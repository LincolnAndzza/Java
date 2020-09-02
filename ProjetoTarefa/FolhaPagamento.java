public class FolhaPagamento {
  
  double horasTrabalhadas;
  double salarioHora;
  int numDependentes;
  double descontoIr;

  public FolhaPagamento(double horasTrabalhadas,double salarioHora,
  int numDependentes,double descontoIr){
    this.horasTrabalhadas = horasTrabalhadas;
    this.salárioHora = salárioHora;
    this.numDependentes = numDependentes;
  }
  
  public double salarioBruto(){
    return this.horasTrabalhadas * this.salarioHora + (50 * 
    this.numDependentes);
  }
  
  public double descontoInss(){
    if(salarioBruto() <= 1000){
       this.descontoInss = this.salarioBruto() * 8.5/100;
    }
    else if(salarioBruto() > 1000){
       this.Inss = salarioBruto * 9/100;
         return descontoInss;
    }
   
   public double descontoIr(){
    if(salarioBruto() <= 500){
       this.descontoIr = 0;
    }
    else if(salarioBruto() > 500 && salarioBruto() <= 1000){
        this.descontoIr = this.salarioBruto() * 5/100; 
    }
    else if(salarioBruto() > 1000){
        this.descontoIr = salarioBruto * 7/100;
        return descontoIr;
    } 
  
  public double salarioLiquido(){
      return salarioBruto() - descontoInss() - descontoIr();
  }
}

