public class Pessoa
{
   //O que ela tem
  String nome;
  String endereco;
  String cpf;
  String email;
  String rg;
  int idade;
  boolean eDoador;
  
  //O que ela faz
  //checarCpf()
  public boolean checarCpf(int tamanho){
      if(this.cpf != null && this.cpf.length() == 5){  
          return true;
      }else {
          return false;
      }
    }
}

