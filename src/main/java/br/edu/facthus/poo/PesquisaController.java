package br.edu.facthus.poo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PesquisaController {
	
	@FXML
	private TextField txtNumero;
	
	@FXML
	private Label lblSaida;
	
	@FXML
	private void pesquisa() {
		// EX06: completar...
		Integer n1 = Integer.parseInt(txtNumero.getText());
		
		lblSaida.setText(String.format("Pesquisando produto com código..."
				));
	}
	
	@FXML
	private void entrada() {
		// EX07: completar...
		Integer n1 = Integer.parseInt(txtNumero.getText());
		
		lblSaida.setText(String.format("Pesquisando entrada de...itens"
				));
	}
	
	@FXML
	private void saida() {
		// EX08: completar...
		Integer n1 = Integer.parseInt(txtNumero.getText());
		
		lblSaida.setText(String.format("Pesquisando saída de...itens"
				));
	}
	
}
