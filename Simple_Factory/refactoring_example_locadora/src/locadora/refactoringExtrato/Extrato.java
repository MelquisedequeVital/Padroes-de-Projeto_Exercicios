package locadora.refactoringExtrato;


import java.util.Iterator;

import locadora.Locacao;

public class Extrato extends GeradorExtrato{
    

    public String gerarExtrato(Cliente cliente) {
        int sequencia = 0;

        Iterator<Locacao> alugueis = cliente.getItensAlugados().iterator();
        String resultado = adicionarTituloExtrato(cliente.getNome());

        while (alugueis.hasNext()) {
            Locacao cada = alugueis.next();
            sequencia++;
            resultado += adicionarLinhaExtrato(cada, cada.valorDeUmaLocacao(), sequencia);

        }
        resultado += adicionarRodapeExtrato(cliente.getValorTotal(), cliente.getPontosTotaisDeAlugadorFrequente());

        return resultado;
    }

    private String adicionarTituloExtrato(String nome) {
        return "Registro de Locações de " + nome + fimDeLinha
                + "Seq Automovel             Ano   Diarias   Valor Pago" + fimDeLinha
                + "=== ==================== ===== ========== ===========" + fimDeLinha;
    }

    private String adicionarLinhaExtrato(Locacao locacao, double valorLocacao, int sequencia) {
        return String.format("%02d. %-20s %-5d %6d    R$ %8.2f" + fimDeLinha,
                sequencia,
                locacao.getItem().getDescricao(),
                locacao.getItem().getAno(),
                locacao.getDiasAlugado(), // Ajuste para o nome correto do seu método (ex: getDias())
                valorLocacao);
    }

    private String adicionarRodapeExtrato(double valorTotal, int totalPontos) {
        return "=====================================================" + fimDeLinha
                + String.format("Valor Acumulado em diárias............:  R$ %8.2f" + fimDeLinha, valorTotal)
                + "Voce acumulou " + totalPontos + " pontos de locador frequente";

    }

}
