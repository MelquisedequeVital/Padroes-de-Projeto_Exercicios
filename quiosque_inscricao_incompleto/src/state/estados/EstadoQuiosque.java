package state.estados;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import state.Quiosque;

public abstract class EstadoQuiosque {

    public void identificarAluno(Quiosque q, String mat){
        System.out.println("Ação inválida: não é possivel identificar aluno nesta etapa");
    }

    public void selecionarMinicurso(Quiosque q, String minicurso){
        System.out.println("Ação inválida: não é possivel selecionar curso nesta etapa");
    }

    public void pagarComCartao(Quiosque q, String cartao, boolean aprovado){
        System.out.println("Ação inválida: pagamento nao disponivel nesta etapa");
    }

    public void emitirTicket(Quiosque q){
        System.out.println("Ação inválida: não é possivel emitir ticket nesta etapa");
    }

}
