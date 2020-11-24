public class eleitores {
    
    private String nome = "";
    private String rg = "";
    private int zona = "";
    private int secao = "";
    
    public eleitores () {}
    
    public eleitores(String nome, String rg, int zona) {
        this.setNome(nome);
        this.setRg(rg);
        this.setZona(zona);
        this.secao(secao);
    }
    
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getRg() {
        return this.rg;
    }
    
    public boolean setRg(String rg) {
        if (rg.length() < 7 || rg.length() > 10) {
            return false;
        }
        
        this.rg = rg;
        
        return true;
    }

    public boolean setSecao(int secao) {
       if (secao.length() < 8 || rg.length() > 15) {
        return false;
       }
        
       this.secao = secao;
        
       return true;
    }
    
    public boolean verificandoDocumento () {
        return nome != null && rg != null 
        && secao != null;
    }
    
}

