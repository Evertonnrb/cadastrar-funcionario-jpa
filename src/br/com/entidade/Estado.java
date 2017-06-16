package br.com.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_estado")
public class Estado {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(nullable=false, length=30)
	private String nome;
	@Column(nullable=false, length=2)
	private String uf;
	
	public Estado() {
		// TODO Auto-generated constructor stub
	}

	public Estado(String nome, String uf) {
		super();
		this.nome = nome;
		this.uf = uf;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
}
