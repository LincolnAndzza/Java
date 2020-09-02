public class ClasseCombustivel
{
   public static void main (String[] args){
        
      double valorAlcool = 4.99;
      double valorGasolina = 3.99;
       
      double valorT = valorAlcool/valorGasolina;
        
      System.out.println("O valor total: " + valorT);
     
        if(valorT < valorAlcool){
            System.out.println("Compensa colocar a alcool");
        }
        else{
            System.out.println("Compensa colocar a gasolina");
        }
   }
}