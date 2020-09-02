public class Agenda
{  
  private PessoaAgd agd; 

  public Agenda(PessoaAgd agd){         
        
        agd = new PessoaAgd();         
        this.agd = agd;     
  }
  
  double armazenaPessoa;
  double removePessoa;
  double buscaPessoa;
  int imprimeAgenda;
  int imprimePessoa;
     
  public Agenda(double armazenaPessoa,double removePessoa, double buscaPessoa,
  int imprimeAgenda, int imprimePessoa){
    this.armazenaPessoa = armazenaPessoa;
    this.removePessoa = removePessoa;
    this.buscaPessoa = buscaPessoa;
    this.imprimeAgenda = imprimeAgenda;
    this.imprimePessoa = imprimePessoa;
  }
   
   public void armazenaPessoa(double armazena){
       for(int i=0; i < armazena.length; i++){
           if(armazena[i] != null){
              return armazena[i];
           }
       }
   }
    
   public void removePessoa(String nome){
       return this.nome;
   }
   
   public int buscaPessoa(String nome){
       return this.posicao;
   }

   void imprimeAgenda(){
        return this.pscao;
   }
   
   void imprimePessoa(int index){
       for(int i=0; i< posicao.length; i++){
           if(posicao[i] != null){
               return posicao[i];
           }
        }
   }   
}

 
   


    
    


