public class IMC
{
    public static void main(String[] args){
        
        double peso = 45;
        double altura = 1.75;
        double imc;
        
        imc = peso / (altura * altura);
        
        if(imc < 18.5){
            System.out.println("Déficit de Massa corporal");
            //riscos de ter doenças
            System.out.println("Baixo com outros riscos de doenças");
            
        }else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Massa corporal normal");
             //riscos de ter doenças
            System.out.println("O risco de ter doenças é Normal");
            
        }else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("Sobrepeso");
             //riscos de ter doenças
            System.out.println("O risco de ter doenças é Elevado");
            
        }else if (imc >= 30.0 && imc <= 34.9){
            System.out.println("Obesidade leve");
             //riscos de ter doenças
            System.out.println("O risco de ter doenças é Alto");
            
        }else if (imc >= 35.0 && imc <= 39.9){
            System.out.println("Obesidade Média");
             //riscos de ter doenças
            System.out.println("O risco de ter doenças é Muito alto");
            
        }else{
            System.out.println("Obesidade Mórbida");
            //riscos de ter doenças
            System.out.println("O risco de ter doenças é Iminente");
        
        }
            System.out.println("Seu IMC é: " + imc);
    }
}
