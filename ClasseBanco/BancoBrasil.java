import java.util.ArrayList;

public class BancoBrasil
{
    private ArrayList<ContaEstudante> constasEstudante = new ArrayList();
    
    public void addContaEstudante(ContaEstudante conta){
        constasEstudante.add(conta);
    }
    
    public ArrayList<ContaEstudante> contasEstudante(){
        return this.constasEstudante;
    }
    
    public double saldoTotal(){
        
        double saldoTotal = 0.0;
        
        for(int i=0; i < constasEstudante.size(); i++){
            saldoTotal += constasEstudante.get(i).pegaSaldo();
        }
        
        for(int i=0; i < constasCorrente.size(); i++){
            saldoTotal += constasCorrente.get(i).pegaSaldo();
        }
        return saldoTotal;
    }
   
}