package br.medium.mobicare.pizzaweb.entity;


public class PizzaEntity{

	private Integer id;
	private String nome;
	private double preco;
	private String descricao;

	public PizzaEntity(Integer id, String nome, double preco, String descricao) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}

	public PizzaEntity() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return this.nome + "; " + this.preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isEmpty() {
		return this == null;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
}
