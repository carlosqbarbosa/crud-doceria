public class Cliente extends Pessoa {
    private String pedido;
    private String descricaoPedido;
    private String formadepagamento; 
    private String valor;
    private String diaEntrega;
    private String entregaRetirada;

    public Cliente(String nome, String endereco, String pedido, String descricaoPedido, String formadepagamento,  String valor, String diaEntrega, String entregaRetirada) {
        super(nome, endereco);
        this.pedido = pedido;
        this.descricaoPedido = descricaoPedido;
        this.formadepagamento = formadepagamento; 
        this.valor = valor;
        this.diaEntrega = diaEntrega;
        this.entregaRetirada = entregaRetirada;
    }


    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getDescricaoPedido() {
        return descricaoPedido;
    }

    public void setDescricaoPedido(String descricaoPedido) {
        this.descricaoPedido = descricaoPedido;
    }
    
    
     public String getformadepagamento() {
        return formadepagamento;
    }

    public void setformadepagamento(String formadepagamento) {
        this.formadepagamento = formadepagamento;
    }
     

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDiaEntrega() {
        return diaEntrega;
    }

    public void setDiaEntrega(String diaEntrega) {
        this.diaEntrega = diaEntrega;
    }

    public String getEntregaRetirada() {
        return entregaRetirada;
    }

    public void setEntregaRetirada(String entregaRetirada) {
        this.entregaRetirada = entregaRetirada;
    }

    /**
     *
     */
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Pedido: " + pedido);
        System.out.println("Descrição do Pedido: " + descricaoPedido);
        System.out.println("Forma de pagamento: " + formadepagamento);
        System.out.println("Valor: " + valor);
        System.out.println("Dia de Entrega: " + diaEntrega);
        System.out.println("Entrega/Retirada: " + entregaRetirada);
    }
}
