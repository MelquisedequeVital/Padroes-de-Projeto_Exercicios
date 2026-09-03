package locadora;

import locadora.interace.Alugavel;

public class Locacao {
	private Alugavel carro;
	private int diasAlugado;

	public Locacao(Alugavel carro, int diasAlugado) {
		this.carro = carro;
		this.diasAlugado = diasAlugado;
	}

	public Alugavel getCarro() {
		return carro;
	}

	public int getDiasAlugado() {
		return diasAlugado;
	}

	public double valorDeUmaLocacao() {
		double valorLocacao = getCarro().getValorDaLocacao(getDiasAlugado());

		return valorLocacao;
	}

	public int getPontosDeAlugadorFrequente() {
		int pontos = getCarro().getPontosDeAlugadorFrequente(getDiasAlugado());
		// trata de pontos de alugador frequente
		// adiciona bonus para aluguel de um lançamento por pelo menos 2 dias
		

		return pontos;
	}
}
