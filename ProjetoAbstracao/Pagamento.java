public class Pagamento {
    private String cartao;

    public Pagamento(String cartao) {
        this.setCartao(cartao);
    }
    
    public String getCartao() {
        return cartao;
    }
    
    public void setCartao(String cartao) {
        this.cartao = cartao;
    }
}
