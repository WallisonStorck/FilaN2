public class Fila {
  private Pedido primeiro; // Referência para o primeiro pedido na fila
  private Pedido ultimo; // Referência para o último pedido na fila
  private int totalDeElementos;

  public Fila() {
    this.primeiro = null;
    this.ultimo = null;
    this.totalDeElementos = 0;
  }

  // Método para adicionar um pedido ao final da fila
  public void enfileirar(Object elemento) {
    Pedido novoPedido = new Pedido(elemento);
    if (this.totalDeElementos == 0) {
      this.primeiro = novoPedido;
      this.ultimo = novoPedido;
    } else {
      this.ultimo.setProximo(novoPedido);
      this.ultimo = novoPedido;
    }
    this.totalDeElementos++;
  }

  // Método para remover o pedido do início da fila
  public Object desenfileirar() {
    if (this.totalDeElementos == 0) {
      throw new IllegalStateException("A fila está vazia!");
    }
    Object elemento = this.primeiro.getElemento();
    this.primeiro = this.primeiro.getProximo();
    this.totalDeElementos--;

    if (this.totalDeElementos == 0) {
      this.ultimo = null;
    }

    return elemento;
  }

  // Método para ver o primeiro pedido da fila sem removê-lo
  public Object primeiro() {
    // Você vai apagar esse comentario e implementar aqui seu código conforme
    // critérios da prova
  }

  // Método para verificar se a fila está vazia
  public boolean estaVazia() {
    return this.totalDeElementos == 0;
  }

  // Método para obter o totalDeElementos da fila
  public int totalDeElementos() {
    return this.totalDeElementos;
  }

  // Método para exibir os pedidos da fila
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("[");
    Pedido atual = this.primeiro;
    while (atual != null) {
      builder.append(atual.getElemento());
      if (atual.getProximo() != null) {
        builder.append(", ");
      }
      atual = atual.getProximo();
    }
    builder.append("]");
    return builder.toString();
  }
}
