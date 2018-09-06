package br.edu.devmedia.objetos;

public class Cidade implements Entidade {

	private int id;

	private String descricao;
	
	private Estado estado;
	
	public Cidade(int id, String descricao, Estado estado) {
		this.id = id;
		this.descricao = descricao;
		this.estado = estado;
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

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
