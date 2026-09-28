package locadora.refactoringExtrato;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import locadora.Locacao;
import locadora.interfaces.Alugavel;

public class Cliente {
	private String nome;
	private List<Locacao> itensAlugados = new ArrayList<Locacao>();


	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void adicionaLocacao(Alugavel itemAlugavel, int diasAlugado) {
		itensAlugados.add(new Locacao(itemAlugavel, diasAlugado));
	}

	public List<Locacao> getItensAlugados(){
		return itensAlugados;
	}

	public double getValorTotal() {
		double valorTotal = 0.0;
		Iterator<Locacao> locacoes = itensAlugados.iterator();

		while (locacoes.hasNext()) {
			valorTotal += locacoes.next().valorDeUmaLocacao();
		}

		return valorTotal;
	}

	public int getPontosTotaisDeAlugadorFrequente() {
		int pontosTotais = 0;
		Iterator<Locacao> locacoes = itensAlugados.iterator();

		while (locacoes.hasNext()) {
			pontosTotais += locacoes.next().getPontosDeAlugadorFrequente();
		}

		return pontosTotais;

	}

}
