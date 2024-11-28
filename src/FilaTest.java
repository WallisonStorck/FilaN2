import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FilaTest {

  @Test
  public void testPrimeiro() {
    Fila fila = new Fila();

    // Teste com a fila vazia
    Exception exception = assertThrows(IllegalStateException.class, () -> {
      fila.primeiro();
    });
    assertEquals("A fila está vazia!", exception.getMessage(),
        "A mensagem de exceção deve ser 'A fila está vazia!' quando a fila estiver vazia.");

    // Adiciona o primeiro pedido
    fila.enfileirar("Pedido 1");
    assertEquals("Pedido 1", fila.primeiro(), "O primeiro pedido deve ser 'Pedido 1'.");

    // Adiciona outro pedido e verifica novamente
    fila.enfileirar("Pedido 2");
    assertEquals("Pedido 1", fila.primeiro(), "O primeiro pedido deve continuar sendo 'Pedido 1'.");

    // Remove o primeiro e verifica o novo topo
    fila.desenfileirar();
    assertEquals("Pedido 2", fila.primeiro(), "Após desenfileirar, o primeiro pedido deve ser 'Pedido 2'.");
  }
}
