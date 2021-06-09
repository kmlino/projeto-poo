package br.edu.facthus.poo;

import java.math.BigDecimal;

import br.edu.facthus.poo.model.Produto;
import br.edu.facthus.poo.service.ProdutosService;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CadastroController {
	
	@FXML
	private TextField txtCodigo;
	
	@FXML
	private TextField txtDescricao;

	@FXML
	private TextField txtPreco;
	
	@FXML
	private TextField txtQuantidade;
	
	@FXML
	private void cadastra() {
		try {
			Integer id = Integer.parseInt(txtCodigo.getText());
			String desc = txtDescricao.getText();
			BigDecimal preco =  new BigDecimal(txtPreco.getText());
			Integer qtd = Integer.parseInt(txtQuantidade.getText());
			
			Produto produto = new Produto(id, desc,
					preco, qtd);
			
			ProdutosService.cadastra(produto);
			
			GuiUtils.info("Produto cadastrado com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
			GuiUtils.error("Ocorreu um erro ao cadastrar o produto.");
		}
	}
	
}
