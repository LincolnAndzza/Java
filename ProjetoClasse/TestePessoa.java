public class TestePessoa
{
   public static void main(String[] args){
        int x  = 10;
        System.out.println(x);
            
        Pessoa p1 = new Pessoa(); 
        p1.nome =  "Lincoln";
        p1.idade = 10;
        
        Pessoa p2 = new Pessoa(); 
        p2.nome = "Lincoln";
        p2.idade = 20;
        
        p1 =  p2;
        
        System.out.println(p1.nome + ":" + p1.idade);
        System.out.println(p2.nome + ":" + p2.idade);
    }
}
