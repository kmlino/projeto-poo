package br.edu.facthus.poo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class PesquisaController {
	
	// Ex. 03b - Completar...
	@FXML
	private TextField txtNumero;
	
	
	@FXML
	private Label lblSaida;
	
	@FXML
	private void pesquisa() {
		// Imprimir no console "Pesquisando produto com código ...
		Integer n1 = Integer.parseInt(txtNumero.getText());
		
		lblSaida.setText(String.format("Pesquisando produto com código..."
				));
	}
	
	@FXML
	private void entrada() {
		// Imprimir no console "Registrando entrada de ... itens"
		Integer n1 = Integer.parseInt(txtNumero.getText());
		
		lblSaida.setText(String.format("Pesquisando entrada de...itens"
				));
	}
	
	@FXML
	private void saida() {
		// Imprimir no console "Registrando saíde de ... itens"
		Integer n1 = Integer.parseInt(txtNumero.getText());
		
		lblSaida.setText(String.format("Pesquisando saída de...itens"
				));
	}
	
}
