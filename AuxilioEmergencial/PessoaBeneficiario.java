public  class  PessoaBeneficiario {

    private String nome;
    private int idade;
    private boolean empregado;
    private String sexo;
    private double renda;
    private double saldoEmConta;

    public  String  getNome()  {
        return nome;
    }

    public  int  getIdade() {
        return idade;
    }

    public  boolean  getEmpregado() {
        return empregado;
    }

    public  String  getsexo(){
        return sexo;
    }

    public  double  getrenda() {
        return renda;
    }

    public  double  getsaldoEmConta(){
        return saldoEmConta;
    }
    
    public void setsaldoEmConta(double saldoEmConta){
        this.saldoEmConta = saldoEmConta;
    }
}