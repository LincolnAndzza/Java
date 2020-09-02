public class Conta
{
    double saldo;
    Cliente cliente;
    
    public Conta(double saldoInicial, Cliente cliente){

        this.saldo = saldoInicial;
        this.cliente = cliente;
    }
    
    public void saque(double saq){
        
        this.saldo = this.saldo - saq;    
    }
   
    public void desposito(double des){
        
         this.saldo = this.saldo + des;
    }
    
    public double pegaSaldo(){
        
        return this.saldo;
    }
 
    public double mostrarSaldo(){
        System.out.println("R$ " + this.saldo);
    }
    
    public void transferencia(Conta c, double v){
        
        this.saque(v);
        c.desposito(v);
    }
}   
    
    
    
    
    

