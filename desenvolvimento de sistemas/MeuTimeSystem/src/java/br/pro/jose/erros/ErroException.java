package br.pro.jose.erros;

public class ErroException extends Exception {
  public ErroException() {
    super("Nenhuma mensagem foi especificada");
  }
  
  public ErroException(String msg) {
    super(msg);
  }
}