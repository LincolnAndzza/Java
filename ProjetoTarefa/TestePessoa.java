public class TestePessoa
{
   public static void main(String[] args){ 
       Pessoa pessoa = new Pessoa();
       pessoa.nome = "lincoln andreazza";
       pessoa.endereco = "jau";   
       pessoa.idade = 20;
       pessoa.cpf="1234";
       System.out.println("Nome da pessoa: " + pessoa.nome);
       
       boolean checarCpf = pessoa.checarCpf(5);
       if(checarCpf){
           System.out.println("CPF valido" );   
       }else{
           System.out.println("CPF invalido" );   
       }
    }  
}
