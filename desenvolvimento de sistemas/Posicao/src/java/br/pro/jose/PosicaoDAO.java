package br.pro.jose;
  
import java.sql.*;
import java.text.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class PosicaoDAO {
  public static void incluir (PosicaoBean ps) throws Exception {
    String sql = "INSERT INTO POSICAO (DESCRICAO) VALUES ('" + ps.getDescricao() + "')";
    //ConexaoMySQL.atualizar(sql); //Banco MySQL
    ConexaoPostgre.atualizar(sql); //Banco Postgre
  }
  
  public static List<PosicaoBean> listarPosicao(String codigo, String descricao) throws Exception {
    String st = "";
    if((codigo.isEmpty())&&(descricao.isEmpty())){
        st = "SELECT * FROM POSICAO";
    }else if((!codigo.isEmpty())&&(descricao.isEmpty())){
        st = "SELECT * FROM POSICAO WHERE CODIGO = " +codigo+"";
    }else if((codigo.isEmpty())&&(!descricao.isEmpty())){
        st = "SELECT * FROM POSICAO WHERE DESCRICAO = '" +descricao+"'";
    }else if((!codigo.isEmpty())&&(!descricao.isEmpty())){
        st = "SELECT * FROM POSICAO WHERE CODIGO = "+codigo+" AND DESCRICAO = '" +descricao+"'";
    }
    ResultSet rs = ConexaoPostgre.selecionar(st); //Banco Postgre
    if (rs == null) throw new Exception("Não há registros!");
    List<PosicaoBean> posicoes = new ArrayList<>();
    while (rs.next()){
      PosicaoBean ps = new PosicaoBean();
      ps.setCodigo(rs.getInt("CODIGO"));
      ps.setDescricao(rs.getString("DESCRICAO"));
      posicoes.add(ps);
    }
    return posicoes; 
  }

}