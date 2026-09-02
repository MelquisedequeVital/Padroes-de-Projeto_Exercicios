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
		double valorTotal = 0.0;
		int pontosDeAlugadorFrequente = 0;
		int sequencia = 0;

		Iterator<Locacao> alugueis = carrosAlugados.iterator();
		String resultado = adicionarTituloExtrato();

		while (alugueis.hasNext()) {
			Locacao cada = alugueis.next();

			double valorCorrente = cada.valorDeUmaLocacao();

			pontosDeAlugadorFrequente += cada.quantidadePontosLocacao();

			// mostra valores para este aluguel
			sequencia++;
			resultado += adicionarLinhaExtrato(cada, valorCorrente, sequencia);

			valorTotal += valorCorrente;

		} // while

		// adiciona rodapé
		resultado += adicionarRodapeExtrato(valorTotal, pontosDeAlugadorFrequente);

		return resultado;
	}

	private String adicionarLinhaExtrato(Locacao locacao, double valorLocacao, int sequencia) {
		// O formato foi ajustado para incluir a coluna de diárias e alinhar
		// perfeitamente com o cabeçalho.
		return String.format("%02d. %-20s %-5d %6d    R$ %8.2f" + fimDeLinha,
				sequencia,
				locacao.getCarro().getDescricao(),
				locacao.getCarro().getAno(),
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

	

	
	}

