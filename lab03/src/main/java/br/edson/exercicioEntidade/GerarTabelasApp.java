package br.edson.exercicioEntidade;

import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class GerarTabelasApp {

	public static void main(String[] args) {
		try {
			Persistence.createEntityManagerFactory("exercicioEntidadePU");
			JOptionPane.showMessageDialog(null, "conectado ao banco");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "falha na conexao " + e.getMessage());
		}
	}

}
