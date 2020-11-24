public class Agencia {
    private String nome;
    private String digito;
    private String cartao;
    
    public Agencia(String digito, String local, String nome, 
    String cartao) {
        this.setNome(nome);
        this.setDigito(digito);
        this.setCartao(cartao);
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDigito() {
        return digito;
    }
    
    public void setDigito(String digito) {
        this.digito = digito;
    }
    
    public String getCartao() {
        return cartao;
    }
    
    public void setCartao(String cartao) {
        this.cartao = cartao;
    }
}
