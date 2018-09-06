package br.pro.jose;

import java.sql.*;


public class ConexaoPostgre {

    

   private static Connection con;
  private static Statement stm;
  
  public static Connection abrir () throws Exception {
    String driver, url, usuario, senha;
    
    driver = "org.postgresql.Driver";
    url = "jdbc:postgresql://localhost:5432/banco1008";
    usuario = "postgres";
    senha = "postgres";
    
    Class.forName(driver);
    con = DriverManager.getConnection(url,usuario,senha);
    stm = con.createStatement();
    return DriverManager.getConnection(url,usuario,senha);
  }
  
  public static void fechar () throws Exception {
    if (stm != null) stm.close();
    if (con != null) con.close();
  }
  
  public static void atualizar(String sql) throws Exception {
    if (con == null || stm == null) abrir();
    stm.execute(sql);
  }
  
  public static ResultSet selecionar(String sql) throws Exception {
    if (con == null || stm == null) abrir();
    return stm.executeQuery(sql);
  }
}