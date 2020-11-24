public class Conta extends Pessoa {
   
    Correntista correntista;
    Agencia agencia;
    Pagamento pagamento;
    
    public Conta(Correntista correntista, Agencia agencia, 
    Pagamento pagamento){
        
        this.correntista = correntista;
        this.agencia = agencia;
        this.pagamento = pagamento;
    }
}
