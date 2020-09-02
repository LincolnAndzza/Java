public class Moto
{
   String cor;
   String marca;
   String modelo;
   double velocidadeMinima;
   double velocidadeMaxima;
   double velocidadeAtual;
   
   //Ligar a Moto
   public void checar(String[] args){
       System.out.println("A moto esta ligando");
   }
    
   //Desligar a Moto
   public void desligar(){
       System.out.println("A moto esta desligada");  
   }
   
   //acelerando uma certa quantidade de velocidade
   public void acelerando(double quantidade) {
     double velocidadeNova = this.velocidadeAtual + quantidade; 
     this.velocidadeAtual = velocidadeNova;
   }
   
   //devolvendo a marcha da moto
  public int pegaMarcha() {
    if (this.velocidadeAtual < 0) {
       return -1;
    }
    if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 50) {
       return 1;
    }
    if (this.velocidadeAtual >= 50 && this.velocidadeMinima < 10) {
       return 2;
    }
    if (this.velocidadeAtual >= 100 && this.velocidadeMaxima < 50) {
       return 3;
    }
   return 4;
   }
}
   
   
