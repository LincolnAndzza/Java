public class  Votos {
    
    private Candidatos vereadores;
    private Candidatos prefeito;
    private Eleitores eleitores;

    public Votos (Candidatos vereadores, Candidatos prefeito, Eleitores eleitores) {
        
        this.setVereadores(vereadores);
        this.setPrefeito(prefeito);
        this.setEleitores(eleitores);
    }
    
    public boolean setVereadores(Candidatos vereadores) {
        if (vereadores.getFuncao() != 1 || vereadores.getRg() == null) {
            return false;
        }
        
        this.vereadores = vereadores;
        
        return true;
    }
    
    public boolean setPrefeito(Candidatos prefeito) {
        if (prefeito.getFuncao() != 5 || vereadores.getRg() == null) {
            return false;
        }
        
        this.prefeito = prefeito;
        
        return true;
    }
    
    public boolean setEleitores(Eleitores eleitores) {
        if (eleitores.getRg() == null) 
            return false;
        
        this.eleitores = eleitores;
        
        return true;
    }
    
    public Eleitores getEleitores() {
        return eleitores;
    }
    
    public Candidatos getVereadores() {
        return vereadores;
    }
    
    public Candidatos getPrefeito() {
        return prefeito;
    }
}

