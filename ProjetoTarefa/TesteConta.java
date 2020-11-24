public class TesteConta
{
    public static void main(String[] args){
        
        Cliente cliente1 = new Cliente();     
        cliente1.numeroConta = "1-0";
        cliente1.nome = "Miguel Arcanjo";
        cliente1.endereco = "Jau";
        
        Cliente cliente2 = new Cliente();     
        cliente2.nome = "Kain Anjo";
        
        Conta c = new Conta(4000.0. cliente1);
        System.out.println(c.cliente.nome);
        
        c.mostrarSaldo();
        System.out.println(c.cliente.nome);
        
    }
}