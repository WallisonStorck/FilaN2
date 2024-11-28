public class App {
    public static void main(String[] args) {
        Fila fila = new Fila();

        // Enfileirando pedidos
        fila.enfileirar("Pedido 1");
        fila.enfileirar("Pedido 2");
        fila.enfileirar("Pedido 3");

        // Exibindo o primeiro e o estado atual da fila
        System.out.println("Primeiro da fila: " + fila.primeiro());
        System.out.println("Fila atual: " + fila.toString());

        // Desenfileirando um pedido
        System.out.println("Desenfileirado: " + fila.desenfileirar());
        System.out.println("Fila após desenfileirar: " + fila.toString());

        // Verificando se está vazia
        System.out.println("A fila está vazia? " + fila.estaVazia());
    }
}
