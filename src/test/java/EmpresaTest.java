import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaTest {

    private DatabaseConnection db1;
    private DatabaseConnection db2;

    @BeforeEach
    void setUp() {
        db1 = DatabaseConnection.getInstance();
        db2 = DatabaseConnection.getInstance();
    }

    @Test
    void testMesmaConexao() {
        assertSame(db1.getConnection(), db2.getConnection(), "A conexão deve ser a mesma.");
    }

    @Test
    void testArmazenaResultadoNoLog() {
        Empresa.main(null);
        String logs = LogSistema.getInstance().obterLogs();
        assertTrue(logs.contains("A conexão é a mesma? true"), "O resultado deve estar armazenado no log.");
    }
}
