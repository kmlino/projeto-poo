package br.edu.facthus.poo;

import br.edu.facthus.poo.model.Produto;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PesquisaController {
	
	@FXML
	private TextField txtNumero;
	
	@FXML
	private Label lblDescricao;
	
	@FXML
	private Label lblQuantidadeDisponivel;
	
	@FXML
	private TextField txtQuantidade;
	
	private Produto produto;
	
	@FXML
	private void pesquisa() {
		Integer idPesquisa = Integer.parseInt(txtNumero.getText());
		GuiUtils.info("Em construção...");

// Ex. 13: completar...		
//		produto = ProdutosService.pesquisa(idPesquisa);
//		
//		if (produto == null) {
//			GuiUtils.error("Nenhum produto encontrado com o código informado.");
//			return;
//		}
//		
//		lblDescricao.setText(produto.getDescricao());
//		lblQuantidadeDisponivel.setText(
//				String.valueOf(produto.getQuantidade()));
	}
	
	@FXML
	private void entrada() {
		try {
			if (produto == null) {
				GuiUtils.error("Nenhum produto selecionado.");
				return;
			}
	
			Integer quantidade = Integer.parseInt(txtQuantidade.getText());
			produto.setQuantidade(produto.getQuantidade() + quantidade);

			GuiUtils.info("Em construção...");
// Ex. 13: completar...			
//			ProdutosService.atualiza(produto);
//			GuiUtils.info("Entrada registrada com sucesso!");
		} catch (Exception e) {
			GuiUtils.error("Ocorreu um erro ao registrar a entrada.");
		}
	}
	
	@FXML
	private void saida() {
		try {
			if (produto == null) {
				GuiUtils.error("Nenhum produto selecionado.");
				return;
			}
	
			Integer quantidade = Integer.parseInt(txtQuantidade.getText());
			produto.setQuantidade(produto.getQuantidade() - quantidade);

			GuiUtils.info("Em construção...");
// Ex. 13: completar...
//			ProdutosService.atualiza(produto);
//			GuiUtils.info("Saída registrada com sucesso!");
		} catch (Exception e) {
			GuiUtils.error("Ocorreu um erro ao registrar a saída.");
		}
	}
	
}
