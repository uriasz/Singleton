import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LogSistemaTest {

    private LogSistema logSistema;

    @BeforeEach
    void setUp() {
        logSistema = LogSistema.getInstance();
    }

    @Test
    void testSingletonInstance() {
        LogSistema log2 = LogSistema.getInstance();
        assertSame(logSistema, log2, "A instância do log deve ser única.");
    }

    @Test
    void testLogRegistro() {
        logSistema.registrarErro("Erro Teste 1");
        logSistema.registrarErro("Erro Teste 2");

        String logs = logSistema.obterLogs();
        assertTrue(logs.contains("Erro Teste 1"), "O log deve conter 'Erro Teste 1'.");
        assertTrue(logs.contains("Erro Teste 2"), "O log deve conter 'Erro Teste 2'.");
    }
}
