public class TesteBancoBrasil
{
    public static void main(){
        BancoBrasil banco = new BancoBrasil();
        
        ContaEstudante ce1 = new ContaEstudante();
        banco.addContaEstudante(ce1);
        
        ContaCorrente cfc1 = new ContaCorrente();
        banco.addContaCorrente(cfc1);
        
        System.out.println(banco.saldoTotal());
        
        System.out.println(banco.saldoTotal());
        
    }
}
