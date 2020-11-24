 

public class ControleVerbas {
    private double saldoTotal;

    public ControleVerbas () {
        saldoTotal = 10000;
    }
    public ControleVerbas (double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public boolean Pagamento (PessoaBeneficiario pessoa) {
        if (this.saldoTotal < 600) return false;

        boolean condicao =
            pessoa.getsexo().equals("feminino");

        this.saldoTotal -= condicao ? 1200 : 600;

        pessoa.setsaldoEmConta(
            pessoa.getsaldoEmConta() + 600
        );

        avisarPagamento(pessoa.getNome(), (condicao ? 1200 : 600));
        return true;
    }
    
    public void avisarPagamento (String nome, double valor) {
        System.out.println(
            "Olá(a) " + nome + '\n' +
            "Seu auxilio emergencial foi aprovado \n" +
            "Em um valor total de " + valor + "que foi depositado em sua conta"
        );
    }
}