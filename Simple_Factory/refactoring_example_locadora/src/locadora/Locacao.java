package locadora;

import locadora.interfaces.Alugavel;

public class Locacao {
	private Alugavel item;
	private int diasAlugado;

	public Locacao(Alugavel item, int diasAlugado) {
		this.item = item;
		this.diasAlugado = diasAlugado;
	}

	public Alugavel getItem() {
		return item;
	}

	public int getDiasAlugado() {
		return diasAlugado;
	}

	public double valorDeUmaLocacao() {
		double valorLocacao = getItem().getValorDaLocacao(getDiasAlugado());

		return valorLocacao;
	}

	public int getPontosDeAlugadorFrequente() {
		int pontos = getItem().getPontosDeAlugadorFrequente(getDiasAlugado());
		return pontos;
	}
}
