package br.edu.facthus.poo;

import java.io.IOException;
import java.math.BigDecimal;

import br.edu.facthus.poo.model.Produto;
import br.edu.facthus.poo.service.ProdutosService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private static Scene scene;

	public static void main(String[] args) {
		// Cria os produtos de teste
		ProdutosService.cadastra(
				new Produto(1, "Teclado", new BigDecimal(20), 10));
		ProdutosService.cadastra(
				new Produto(2, "Mouse", new BigDecimal(10), 20));
		ProdutosService.cadastra(
				new Produto(3, "Headset", new BigDecimal(25), 30));
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		scene = new Scene(loadFXML("main"), 400, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private static Parent loadFXML(String fxml) throws IOException {
		FXMLLoader fxmlLoader = 
				new FXMLLoader(App.class.getResource(fxml + ".fxml"));
		return fxmlLoader.load();
	}

}
