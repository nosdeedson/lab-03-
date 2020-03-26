package br.edson.exercicioEntidade.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "carro")
public class Carro implements Serializable {

	private static final long serialVersionUID = 1L;
	private int idCarro;
	private String placaCarro;
	private String modeloCarro;
	
	@Id
	@GeneratedValue
	@Column (name="id")
	public int getIdCarro() {
		return idCarro;
	}
	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
	}
	@Column (name = "placa_carro" , length = 8, nullable = false)
	public String getPlacaCarro() {
		return placaCarro;
	}
	public void setPlacaCarro(String placaCarro) {
		this.placaCarro = placaCarro;
	}
	@Column (name = "modelo_carro", length = 15, nullable = false)
	public String getModeloCarro() {
		return modeloCarro;
	}
	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCarro;
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
		Carro other = (Carro) obj;
		if (idCarro != other.idCarro)
			return false;
		return true;
	}
	
}
