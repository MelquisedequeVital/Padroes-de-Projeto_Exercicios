

Exercício do padrão **Factory Method**, junto com o **Template Method**, simulando o processamento de uma transação de pagamento.

- **`Pagamento`** ([Pagamento.java](src/pps/factory/pagamento/Pagamento.java)) é a interface do "produto". `Boleto`, `Pix` e `CartaoDeCredito` são as implementações, e cada uma só imprime uma mensagem.
- **`Transacao`** ([Transacao.java](src/pps/factory/Transacao.java)) é a classe abstrata "criadora":
  - `processar()` é o **template method**. Ele define a ordem fixa: validação → autenticação → pagamento → recibo.
  - `criarFormaPagamento()` é o **factory method** abstrato.
  - `pagamento()` chama a fábrica e usa o objeto criado sem saber qual é a classe concreta.
- **`TransacaoBoleto`**, **`TransacaoPix`** e **`TransacaoCredito`** são os criadores concretos. Cada um sobrescreve só o factory method e devolve o pagamento correspondente.
- **`App`** ([App.java](src/pps/App.java)) cria as três transações e chama `processar()` em cada uma.

A saída esperada para cada transação é:
```
Transação Validada
Usuario autenticado
Pagamento realizado com <Boleto|Pix|Cartao de Credito>
Recibo Enviado
```

## A implementação está correta?

**Sim, está.** A implementação do Factory Method está correta:
- `Transacao` depende só da abstração `Pagamento`, nunca das classes concretas.
- A decisão de qual objeto criar fica nas subclasses.
- Para adicionar uma nova forma de pagamento (um débito, por exemplo), basta criar `Debito implements Pagamento` e `TransacaoDebito extends Transacao`. Nada do que já existe precisa mudar, o que respeita o princípio Aberto/Fechado.

Não executei o programa, mas o código é simples e não tem erro de compilação nem de lógica.

## Observações (não são erros)

1. **Encapsulamento:** `criarFormaPagamento()`, `validacao()`, `autenticacao()` etc. estão `public`. O mais comum seria deixar como `protected`, para o cliente só enxergar `processar()`. Também seria possível marcar `processar()` como `final`, para nenhuma subclasse mudar a ordem dos passos.
2. **É só uma simulação:** não há valor nem dados da transação, e a validação e a autenticação sempre passam. Para um exercício didático isso basta.
3. **Acento no console:** "Transação" pode aparecer com caracteres estranhos no terminal do Windows, dependendo do encoding. É só cosmético.
4. **`throws Exception` no `main`** não é necessário, porque nada lança exceção verificada.