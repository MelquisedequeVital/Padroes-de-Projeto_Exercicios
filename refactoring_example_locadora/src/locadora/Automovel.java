package locadora;

import locadora.classificacao.Basica;
import locadora.classificacao.Familia;
import locadora.classificacao.Luxo;
import locadora.classificacao.abstratas.Classificacao;
import locadora.factory.ClassificacaoFactory;
import locadora.interfaces.Alugavel;

public class Automovel implements Alugavel {

	public static final int BASICO = 0;
	public static final int FAMILIA = 1;
	public static final int LUXO = 2;

	private Classificacao classificacao;
	private String descricao;
	private String placa;
	private int ano; // Ano de fabricação do automóvel

	public Automovel(String descricao, int ano, String placa,
			int codigoDoPreco) {
		this.descricao = descricao;
		this.placa = placa;
		this.ano = ano;
		setCodigoDoPreco(codigoDoPreco);
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
		return classificacao.getCodigoDoPreco();
	}

	public void setCodigoDoPreco(int codigoDoPreco) {
		this.classificacao = ClassificacaoFactory.criarClassificacao(codigoDoPreco);
	}

	public double getValorDaLocacao(int diasAlugada) {
		return classificacao.getValorDaLocacao(diasAlugada);
	}

	public int getPontosDeAlugadorFrequente(int diasAlugada) {
		return classificacao.getPontosDeAlugadorFrequente(diasAlugada);
	}
}
