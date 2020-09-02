public class Paciente
{
  //Atribudos
  private String nome;
  String nomeMae;
  String endereco;
  char sexo;
  String rg;
  String medico;
  boolean temConvenio;
  boolean alergica;
  int idade;
  
  //Metodos
  public void colocarNome(String nomePaciente){
        this.nome = nomePaciente;
  }
  
  public String mostrarNome(){
        return this.nome;   
    }
          
      
}