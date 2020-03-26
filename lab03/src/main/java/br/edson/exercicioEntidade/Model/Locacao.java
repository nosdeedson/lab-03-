package br.edson.exercicioEntidade.Model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="locacao")
public class Locacao implements Serializable {

	private static final long serialVersionUID = 1L;
	private int idLocacao;
	private Date dataLocacao;
	private Date dataDevolucao;
	private Cliente cliente;
	private Carro carro;
	
	@Id
	@GeneratedValue
	@Column (name= "id")
	public int getIdLocacao() {
		return idLocacao;
	}
	public void setIdLocacao(int idLocacao) {
		this.idLocacao = idLocacao;
	}
	@Temporal (TemporalType.DATE)
	@Column (name="data_locacao")
	public Date getDataLocacao() {
		return dataLocacao;
	}
	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	@Temporal (TemporalType.DATE)
	@Column (name="data_devolucao")
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	@OneToOne
	@JoinColumn (name="id_cliente")
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@OneToOne
	@JoinColumn (name="id_carro")
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idLocacao;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Locacao other = (Locacao) obj;
		if (idLocacao != other.idLocacao)
			return false;
		return true;
	}
	
	
}
