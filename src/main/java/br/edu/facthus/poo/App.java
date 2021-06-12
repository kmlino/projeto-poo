package br.edu.facthus.poo;

import java.io.IOException;

import br.edu.facthus.poo.dao.ProdutosDAO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private static Scene scene;

	public static void main(String[] args) {
		ProdutosDAO produtosDAO = new ProdutosDAO();
		produtosDAO.criaBD();
		
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
