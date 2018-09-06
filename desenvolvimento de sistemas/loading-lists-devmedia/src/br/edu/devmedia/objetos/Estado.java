package br.edu.devmedia.objetos;

public class Estado implements Entidade {

	private int id;

	private String descricao;

	private Regiao regiao;

	public Estado(int id, String descricao, Regiao regiao) {
		this.id = id;
		this.descricao = descricao;
		this.regiao = regiao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Regiao getRegiao() {
		return regiao;
	}

	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}
}
