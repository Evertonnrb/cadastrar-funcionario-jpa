package br.com.entidade;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Transient;

@SuppressWarnings("serial")
@Entity
@Table(name="tbl_funcionario")
public class Funcionario extends Pessoa {
	
	@EmbeddedId
	private Pessoa id;
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private TipoFuncionario funcionarioTipo;
	@Column(nullable=false,precision=6,scale=2)
	private Double salario;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(TipoFuncionario funcionarioTipo, Double salario) {
		super();
		this.funcionarioTipo = funcionarioTipo;
		this.salario = salario;
	}

	public TipoFuncionario getFuncionarioTipo() {
		return funcionarioTipo;
	}

	public void setFuncionarioTipo(TipoFuncionario funcionarioTipo) {
		this.funcionarioTipo = funcionarioTipo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	@Transient
	public Double calculaSalario(int diasTrabalhados, Double valorDia) {
		return valorDia * diasTrabalhados;
	}
	@Transient
	public Double calculaComissao(Double qtdVenda) {
		return qtdVenda * 0.1;
	}
}
