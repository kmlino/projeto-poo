module br.edu.facthus.poo {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;

	opens br.edu.facthus.poo to javafx.fxml;
	exports br.edu.facthus.poo;
}