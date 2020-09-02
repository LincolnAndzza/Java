public class Elevador {
    
    public int andarAtual;
    public int totalDeAndares;
    public int capacidade;
    public int quantidadePessoas;
         
    public Elevador (int capacidade, int totalDeAndares) {
        this.capacidade = capacidade;
        this.totalDeAndares = totalDeAndares;
    }
    
    public boolean entra(){
        if (this.quantidadePessoas == this.capacidade) {
            return false;
        }
        else{
        	this.quantidadePessoas++;
       		return true;
        }
    }

    public boolean sai(){
        if (this.quantidadePessoas == 0) {
            return false;
        }
        else{
        	this.quantidadePessoas--;
        	return true;
        }
    }

    public boolean sobe(){
        if (this.andarAtual == this.totalDeAndares) {
            return false;
        }
        else{
        	this.andarAtual++;
        	return true;
        }        
    }

    public boolean desce(){
        if (this.andarAtual == 0) {
            return false;
        }
        else{
        	this.andarAtual--;
        	return true;
        }        
    }
}