package br.edu.facthus.poo;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class GuiUtils {
	
	public static void info(String mensagem) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText(mensagem);
		alert.show();
	}

	public static void error(String mensagem) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setHeaderText(mensagem);
		alert.show();
	}

}
