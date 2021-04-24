package br.edu.facthus.poo;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {
	
	@FXML
	private void cadastro() {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader();
			fxmlLoader.setLocation(getClass().getResource("cadastro.fxml"));
			Scene scene = new Scene(fxmlLoader.load(), 600, 400);
			Stage stage = new Stage();
			stage.setTitle("Cadastro");
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	private void pesquisa() {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader();
			fxmlLoader.setLocation(getClass().getResource("pesquisa.fxml"));
			Scene scene = new Scene(fxmlLoader.load(), 600, 400);
			Stage stage = new Stage();
			stage.setTitle("Pesquisa");
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
