package br.com.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Embeddable
public class Pessoa implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private static final long personId = 1L;
	@Column(length=50,nullable=false)
	private String nome;
	@Column(length=13,nullable=false)
	private String cpf;
	@Column(length=11,nullable=false)
	private String rg;
	@JoinColumn
	@OneToOne(fetch=FetchType.EAGER)
	private Cidade cidade;
	@Temporal(TemporalType.DATE)
	private Date dataCadastro;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nome, String cpf, String rg, Cidade cidade,Date dataCadastro) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.cidade = cidade;
		this.dataCadastro = dataCadastro;
	}

	
	public static long getPersonid() {
		return personId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
}
