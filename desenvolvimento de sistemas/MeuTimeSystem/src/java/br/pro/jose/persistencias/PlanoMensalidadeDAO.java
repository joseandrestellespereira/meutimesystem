package br.pro.jose.persistencias;
  
import br.pro.jose.beans.PlanoMensalidadeBean;
import br.pro.jose.enums.PeriodicidadeEnum;
import br.pro.jose.enums.StatusEnum;
import java.sql.*;
import java.text.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class PlanoMensalidadeDAO {
  public static void incluir (PlanoMensalidadeBean ps) throws Exception {
    String sql = "INSERT INTO PLANO_MENSALIDADE (DESCRICAO, VALOR, DIA_VENCIMENTO, PERIODICIDADE, ATIVO)"+
    "VALUES   ('"+ ps.getDescricao()+"'," + ps.getValor() +","+ ps.getDia_vencimento()+" , '"+ ps.getPeriodicidade()+"', "+ ps.isAtivo()+")";
    //ConexaoMySQL.atualizar(sql); //Banco MySQL
    ConexaoPostgre.atualizar(sql); //Banco Postgre
  }
  
  public static void alterar (PlanoMensalidadeBean ps) throws Exception {
    String sql = "UPDATE PLANO_MENSALIDADE SET DESCRICAO = '"+ ps.getDescricao()+"' , VALOR = "+ ps.getValor()+" , DIA_VENCIMENTO = "+ ps.getDia_vencimento()+" "
            + ", PERIODICIDADE = '"+ ps.getPeriodicidade()+"' , ATIVO = "+ ps.isAtivo()+" WHERE CODIGO = "+ ps.getCodigo()+";";
    //ConexaoMySQL.atualizar(sql); //Banco MySQL
    ConexaoPostgre.atualizar(sql); //Banco Postgre
  }
  
  public static void excluir (String codigo) throws Exception {
    String sql = "DELETE FROM PLANO_MENSALIDADE WHERE CODIGO = "+codigo+";";
    //ConexaoMySQL.atualizar(sql); //Banco MySQL
    ConexaoPostgre.atualizar(sql); //Banco Postgre
  }
  
  public static List<PlanoMensalidadeBean> listarPlanoMensalidade(String codigo, String descricao, String status) throws Exception {
    if(status.equals("Todos")){
        status = "";
    }
    String st = "";
    if((codigo.isEmpty())&&(status.equals(StatusEnum.Ativo.toString()))&&(descricao.isEmpty())){
        st = "SELECT * FROM PLANO_MENSALIDADE WHERE ATIVO = TRUE ORDER BY CODIGO";
    }else if((codigo.isEmpty())&&(status.isEmpty())&&(descricao.isEmpty())){
        st = "SELECT * FROM PLANO_MENSALIDADE ORDER BY CODIGO";
    }else if((codigo.isEmpty())&&(status.equals(StatusEnum.Inativo.toString()))&&(descricao.isEmpty())){
        st = "SELECT * FROM PLANO_MENSALIDADE WHERE ATIVO = FALSE ORDER BY CODIGO";
    }else if((!codigo.isEmpty())&&(status.equals(StatusEnum.Ativo.toString()))&&(descricao.isEmpty())){
        st = "SELECT * FROM PLANO_MENSALIDADE WHERE CODIGO = " +codigo+"  AND ATIVO = TRUE ORDER BY CODIGO";
    }else if((!codigo.isEmpty())&&(status.isEmpty())&&(descricao.isEmpty())){
        st = "SELECT * FROM PLANO_MENSALIDADE WHERE CODIGO = " +codigo+" ORDER BY CODIGO";
    }else if((!codigo.isEmpty())&&(status.equals(StatusEnum.Inativo.toString()))&&(descricao.isEmpty())){
        st = "SELECT * FROM PLANO_MENSALIDADE WHERE CODIGO = " +codigo+"  AND ATIVO = FALSE ORDER BY CODIGO";
    }else if((codigo.isEmpty())&&(status.equals(StatusEnum.Ativo.toString()))&&(!descricao.isEmpty())){
        st = "SELECT * FROM PLANO_MENSALIDADE WHERE DESCRICAO = '" +descricao+"' AND ATIVO = TRUE ORDER BY CODIGO";
    }else if((codigo.isEmpty())&&(status.isEmpty())&&(!descricao.isEmpty())){
        st = "SELECT * FROM PLANO_MENSALIDADE WHERE DESCRICAO = '" +descricao+"' ORDER BY CODIGO";
    }else if((codigo.isEmpty())&&(status.equals(StatusEnum.Inativo.toString()))&&(!descricao.isEmpty())){
        st = "SELECT * FROM PLANO_MENSALIDADE WHERE DESCRICAO = '" +descricao+"' AND ATIVO = FALSE ORDER BY CODIGO";
    }else if((!codigo.isEmpty())&&(status.equals(StatusEnum.Ativo.toString()))&&(!descricao.isEmpty())){
        st = "SELECT * FROM PLANO_MENSALIDADE WHERE CODIGO = "+codigo+" AND DESCRICAO = '" +descricao+"' AND ATIVO = TRUE ORDER BY CODIGO";
    }else if((!codigo.isEmpty())&&(status.isEmpty())&&(!descricao.isEmpty())){
        st = "SELECT * FROM PLANO_MENSALIDADE WHERE CODIGO = "+codigo+" AND DESCRICAO = '" +descricao+"' ORDER BY CODIGO";
    }else if((!codigo.isEmpty())&&(status.equals(StatusEnum.Inativo.toString()))&&(!descricao.isEmpty())){
        st = "SELECT * FROM PLANO_MENSALIDADE WHERE CODIGO = "+codigo+" AND DESCRICAO = '" +descricao+"' AND ATIVO = FALSE ORDER BY CODIGO";
    }
    ResultSet rs = ConexaoPostgre.selecionar(st); //Banco Postgre
    if (rs == null) throw new Exception("Não há registros!");
    List<PlanoMensalidadeBean> planos = new ArrayList<>();
    while (rs.next()){
      PlanoMensalidadeBean ps = new PlanoMensalidadeBean();
      ps.setCodigo(rs.getInt("CODIGO"));
      ps.setDescricao(rs.getString("DESCRICAO"));
      ps.setValor(rs.getDouble("VALOR"));
      ps.setDia_vencimento(rs.getInt("DIA_VENCIMENTO"));
      if(rs.getString("PERIODICIDADE").equals(PeriodicidadeEnum.Mensal.getPeriodicidade()))
            ps.setPeriodicidade(PeriodicidadeEnum.Mensal); //PODE DAR ERRO
      if(rs.getString("PERIODICIDADE").equals(PeriodicidadeEnum.Trimestral.getPeriodicidade()))
            ps.setPeriodicidade(PeriodicidadeEnum.Trimestral); //PODE DAR ERRO
      if(rs.getString("PERIODICIDADE").equals(PeriodicidadeEnum.Semestral.getPeriodicidade()))
            ps.setPeriodicidade(PeriodicidadeEnum.Semestral); //PODE DAR ERRO
      if(rs.getString("PERIODICIDADE").equals(PeriodicidadeEnum.Anual.getPeriodicidade()))
            ps.setPeriodicidade(PeriodicidadeEnum.Anual); //PODE DAR ERRO
      
      ps.setAtivo(rs.getBoolean("ATIVO"));
            
      planos.add(ps);
    }
    return planos; 
  }
  
  public static List<String> listarDescricaoPlanoMensalidade() throws Exception {
    String st = "";
    st = "SELECT DESCRICAO FROM PLANO_MENSALIDADE;";
    ResultSet rs = ConexaoPostgre.selecionar(st); //Banco Postgre
    if (rs == null) throw new Exception("Não há registros!");
    List<String> planos = new ArrayList<>();
    while (rs.next()){
      planos.add(rs.getString("DESCRICAO"));
    }
    return planos; 
  }
}