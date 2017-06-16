package br.com.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_cidade")
public class Cidade {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(length=50,nullable=false)
	private String nome;
	@Column(length=50,nullable=false)
	private String uf;
	@JoinColumn
	@ManyToOne(fetch=FetchType.EAGER)
	private Estado estado;
	
	public Cidade() {
		// TODO Auto-generated constructor stub
	}
	
	public Cidade(String nome, String uf, Estado estado) {
		super();
		this.nome = nome;
		this.uf = uf;
		this.estado = estado;
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

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
}
