package locadora;

import locadora.interace.Alugavel;

public class Automovel implements Alugavel {
	public static final int BASICO = 0;
	public static final int FAMILIA = 1;
	public static final int LUXO = 2;

	private String descricao;
	private String placa;
	private int ano; // Ano de fabricação do automóvel
	private int codigoDoPreco;

	public Automovel(String descricao, int ano, String placa,
			int codigoDoPreco) {
		this.descricao = descricao;
		this.placa = placa;
		this.ano = ano;
		this.codigoDoPreco = codigoDoPreco;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getPlaca() {
		return placa;
	}

	public int getAno() {
		return ano;
	}

	public int getCodigoDoPreco() {
		return codigoDoPreco;
	}

	public void setCodigoDoPreco(int codigoDoPreco) {
		this.codigoDoPreco = codigoDoPreco;
	}

	public double getValorDaLocacao(int diasAlugada) {
		double valorLocacao = 0.0;
		// determina valores para cada linha
		switch (getCodigoDoPreco()) {
			case Automovel.BASICO: // R$ 90.00 por dia
				valorLocacao = 90.00;
				break;

			case Automovel.FAMILIA: // R$ 130.00 por dia
				valorLocacao = 130.00;

				break;

			case Automovel.LUXO: // R$ 200.00 por dia.
				valorLocacao = 200.00;
				// Acima de 4 diárias tem 10% de desconto
				if (diasAlugada > 4) {
					valorLocacao *= 0.9;
				}
				break;
		} // switch

		return valorLocacao;
	}

	public int getPontosDeAlugadorFrequente(int diasAlugada) {
		int pontos = 1;

		if (diasAlugada > 2) {
			pontos += 2;
		}

		return pontos;
	}
}
