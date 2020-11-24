 public class ControleBeneficiario {
    private PessoaBeneficiario[] indice;
    private ControleVerbas controleVerbas;

    public ControleBeneficiario () {
        this.indice = new PessoaBeneficiario[10];
        this.controleVerbas = new ControleVerbas();
    }
    public ControleBeneficiario (int grandeza, double saldoNoBanco) {
        this.indice = new PessoaBeneficiario[grandeza];
        this.controleVerbas = new ControleVerbas(saldoNoBanco);
    }

    public boolean verificarUtilizador (PessoaBeneficiario utilizador) {
        boolean condicao = !utilizador.getEmpregado() &&
            utilizador.getIdade() >= 18 &&
            utilizador.getrenda() < 18500;

        if (condicao) {
            for (int i = 0; i < this.indice.length; i++) {
                if (this.indice[i] == null) {
                    this.indice[i] = utilizador;
                    return true;
                }
            }
        }
        return false;
    }

    public int executarPagamentos () {
        int count = 0;
        boolean saldoSuficiente = true;
        for (int i = 0; i < this.indice.length; i++) {
            if (saldoSuficiente && this.indice[i] != null) {
                saldoSuficiente = this.controleVerbas.Pagamento(this.indice[i]);
                count++;
            }
        }
        return count;
    }
}