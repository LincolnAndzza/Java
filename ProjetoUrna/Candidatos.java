public class Candidatos extends eleitores {
    private int funcao = -1;
    private int votos = 0;
    private int numCandidatos = -1;
    
    public Candidatos (String nome, String rg, int zona, int secao, int funcao, int numCandidatos) {
        this.getNome(nome);
        this.getRg(rg);
        this.getZona(zona);
        this.getsecao(secao);
        this.getFuncao(funcao);
        this.getnumCandidato(numCandidato);
    }
    
    public int getFuncao() {
        return funcao;
    }

    public boolean setFuncao(int funcao) {
        if (funcao == 1 || funcao == 4) {
            this.funcao = funcao;
            
            return true;

        } else {
            return false;
        }
    }
    
    public int getvotos () {
        return this.votos;
    }
    
    public void acrescentandoVotos () {
        this.votos++;
    }
    
    public int numCandidatos () {
        return this.numCandidatos;
    }
    
    public boolean setnumCandidatos (int numCandidatos) {
        if (numCandidatos <= 0) 
        
            return false;

        this.numCandidatos = numCandidatos;

            return true;
    }
    
    public boolean verificacaoDocumentos () {
        return verificacaoDocumentos() && funcao != -1 &&
            numCandidatos != -1;
    }
}