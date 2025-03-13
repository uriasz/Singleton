import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.sql.Connection;

class DatabaseConnectionTest {

    private DatabaseConnection db1;
    private DatabaseConnection db2;

    @BeforeEach
    void setUp() {
        db1 = DatabaseConnection.getInstance();
        db2 = DatabaseConnection.getInstance();
    }

    @Test
    void testSingletonInstance() {
        assertSame(db1, db2, "A instância deve ser única.");
    }

    @Test
    void testConnectionNotNull() {
        assertNotNull(db1.getConnection(), "A conexão não pode ser nula.");
    }
}
