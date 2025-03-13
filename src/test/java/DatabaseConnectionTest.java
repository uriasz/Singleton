import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    @Test
    void testSingletonInstance() {
        DatabaseConnection instance1 = DatabaseConnection.getInstance();
        DatabaseConnection instance2 = DatabaseConnection.getInstance();


        assertSame(instance1, instance2, "As instâncias do Singleton devem ser iguais.");
    }

    @Test
    void testConnectionStatus() {
        DatabaseConnection connection = DatabaseConnection.getInstance();


        assertEquals("Banco de dados conectado", connection.getConnection(), "A conexão deve retornar a mensagem esperada.");
    }
}

