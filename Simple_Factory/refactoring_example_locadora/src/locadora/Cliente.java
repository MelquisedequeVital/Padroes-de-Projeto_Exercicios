package locadora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
	private String nome;
	private List<Locacao> carrosAlugados = new ArrayList<Locacao>();
	private final String fimDeLinha = System.getProperty("line.separator");

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void adicionaLocacao(Locacao locacao) {
		carrosAlugados.add(locacao);
	}

	public String extrato() {
		int sequencia = 0;

		Iterator<Locacao> alugueis = carrosAlugados.iterator();
		String resultado = adicionarTituloExtrato();

		while (alugueis.hasNext()) {
			Locacao cada = alugueis.next();
			sequencia++;
			resultado += adicionarLinhaExtrato(cada, cada.valorDeUmaLocacao(), sequencia);

		} 
		resultado += adicionarRodapeExtrato(getValorTotal(), getPontosTotaisDeAlugadorFrequente());

		return resultado;
	}

	private String adicionarLinhaExtrato(Locacao locacao, double valorLocacao, int sequencia) {
		return String.format("%02d. %-20s %-5d %6d    R$ %8.2f" + fimDeLinha,
				sequencia,
				locacao.getItem().getDescricao(),
				locacao.getItem().getAno(),
				locacao.getDiasAlugado(), // Ajuste para o nome correto do seu método (ex: getDias())
				valorLocacao);
	}

	private String adicionarTituloExtrato() {
		return "Registro de Locações de " + getNome() + fimDeLinha
				+ "Seq Automovel             Ano   Diarias   Valor Pago" + fimDeLinha
				+ "=== ==================== ===== ========== ===========" + fimDeLinha;
	}

	private String adicionarRodapeExtrato(double valorTotal, int totalPontos) {
		return "=====================================================" + fimDeLinha
				+ String.format("Valor Acumulado em diárias............:  R$ %8.2f" + fimDeLinha, valorTotal)
				+ "Voce acumulou " + totalPontos + " pontos de locador frequente";

	}

	private double getValorTotal() {
		double valorTotal = 0.0;
		Iterator<Locacao> locacoes = carrosAlugados.iterator();

		while (locacoes.hasNext()) {
			valorTotal += locacoes.next().valorDeUmaLocacao();
		}

		return valorTotal;
	}

	private int getPontosTotaisDeAlugadorFrequente() {
		int pontosTotais = 0;
		Iterator<Locacao> locacoes = carrosAlugados.iterator();

		while (locacoes.hasNext()) {
			pontosTotais += locacoes.next().getPontosDeAlugadorFrequente();
		}

		return pontosTotais;

	}

	public String extratoHTML() {

		int sequencia = 0;
		Iterator<Locacao> locacoes = carrosAlugados.iterator();
		String resultado = "<html><body>" + fimDeLinha;
		resultado = String.format("<H2>Registro de Locacoes de <EM> %s</EM></H2>", getNome()) + fimDeLinha;
		resultado += "<table border=\"1\"><tr><th>Seq</th><th>Automóvel</th><th>Ano</th><th>Diárias</th><th>Valor</th></tr>"
				+ fimDeLinha;
		while (locacoes.hasNext()) {
			Locacao cada = locacoes.next();
			// mostra valores para este Locacao
			sequencia++;
			resultado += String.format(
					"<tr><th>%02d.</th><th>%s</th><th>%4d</th><th>%2d</th><th>R$%8.2f</th></tr>" + fimDeLinha,
					sequencia,
					cada.getItem().getDescricao(), cada.getItem().getAno(),
					cada.getDiasAlugado(), cada.valorDeUmaLocacao());
		} // while
			// adiciona rodapé
		resultado += String.format(
				"<tfoot><tr><td colspan=\"4\">Valor Acumulado em diárias:</td><td><EM>R$ %8.2f</EM></td></tr></tfoot></table>"
						+
						fimDeLinha,
				getValorTotal());
		resultado += "<P>Voce acumulou <EM>" +
				getPontosTotaisDeAlugadorFrequente() +
				" pontos </EM> de alugador frequente</p></body></html> ";
		return resultado;

	}
}
