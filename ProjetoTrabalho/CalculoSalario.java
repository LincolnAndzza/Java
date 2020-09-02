public class CalculoSalario
{
   public static void main(String[] args){
       
    Salario funci = new Salario();
    funci.hrTrabalhadas = 200;
    funci.numeroDependentes = 1;
    funci.salarioHora = 30.00;
    funci.salarioBruto = ((funci.hrTrabalhadas * funci.salarioHora) + (50 * funci.numeroDependentes)); 
    
    System.out.println("Salario Bruto: " + funci.salarioBruto);
    
    if (funci.salarioBruto <= 2000 ){
        funci.INSS = funci.salarioBruto *  8.5/100;
        System.out.println("Valor do INSS: " + funci.INSS);
        } 
   else if (funci.salarioBruto > 1000 ){
        funci.INSS = funci.salarioBruto *  9/100;
        System.out.println("Valor do INSS: " + funci.INSS);
        }
   if (funci.salarioBruto <= 400 ){
       funci.IR = funci.salarioBruto;
       System.out.println("Valor do IR: " + funci.IR);
        }   
   else if (funci.salarioBruto > 500 && funci.salarioBruto <= 1000){
       funci.IR = funci.salarioBruto * 5/100;
       System.out.println("Valor do IR: " +funci.IR);
       }
   else if (funci.salarioBruto > 1000){
       funci.IR = funci.salarioBruto *  7/100 ;
       System.out.println ( "Valor do IR: " +funci.IR);
    }
    
   funci.salarioLiquido = funci.salarioBruto - funci.INSS - funci.IR;
       System.out.println("Salario Liquido: " + funci . salarioLiquido);
    }
}