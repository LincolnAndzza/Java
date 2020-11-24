public class ContaCorrenteTeste
{
   public void main(String[] args){
   
       ContaCorrente Conta = new ContaCorrente();
       conta.setCorrentista("Jose da Silva");
       conta.setAgencia("Caixa - 157 - 154744");
       conta.mostrarSaldo();
       conta.deposito(125.10);
       conta.mostrarSaldo();
    }
}
