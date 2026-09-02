package locadora;

public class Locacao {
	private Automovel carro;
	private int diasAlugado;

	public Locacao(Automovel carro, int diasAlugado) {
		this.carro = carro;
		this.diasAlugado = diasAlugado;
	}

	public Automovel getCarro() {
		return carro;
	}

	public int getDiasAlugado() {
		return diasAlugado;
	}

	public double valorDeUmaLocacao() {
		double valorLocacao = 0.0;
		// determina valores para cada linha
		switch (getCarro().getCodigoDoPreco()) {
			case Automovel.BASICO: // R$ 90.00 por dia
				valorLocacao += getDiasAlugado() * 90.00;
				break;

			case Automovel.FAMILIA: // R$ 130.00 por dia
				valorLocacao += getDiasAlugado() * 130.00;

				break;

			case Automovel.LUXO: // R$ 200.00 por dia.
				valorLocacao += getDiasAlugado() * 200.00;
				// Acima de 4 diárias tem 10% de desconto
				if (getDiasAlugado() > 4) {
					valorLocacao *= 0.9;
				}
				break;
		} // switch

		return valorLocacao;
	}

	public int quantidadePontosLocacao() {
		int pontos = 1;
		// trata de pontos de alugador frequente
		// adiciona bonus para aluguel de um lançamento por pelo menos 2 dias
		if (getCarro().getCodigoDoPreco() == Automovel.LUXO &&
				getDiasAlugado() > 2) {
			pontos += 2;
		}

		return pontos;
	}
}
