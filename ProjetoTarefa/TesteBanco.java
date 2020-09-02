public class TesteBanco
{
    public static void main(String[] args){
        
        Banco banco1 = new Banco();
        
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Kain";
        
        Cliente cliente2 = new Cliente();
        cliente2.nome = "Gabriel";
        
        //Cliente cliente1 = new Cliente("Kain Rebaixado", "999.999.999-90",123);
        //Cliente cliente2 = new Cliente("Miguel Arcanjo", "999.999.998-15",1234);
        
        Conta c = new Conta(6000.0, cliente1);
        Conta c2 = new Conta(4000.0, cliente2);
        
        banco1.contas[0] = c;
        banco1.contas[1] = c2;
        
        int totconta = 0;
        totconta = banco1.totalContasCadastradas();
        System.out.println("Total Contas: " + totconta);
        
        /*
        double totsaldo = 0.0;
        totsaldo = banco1.totalSaldoConta();
        System.out.println("Total Saldo: " + totsaldo);
        */
        
    
    }
    
}