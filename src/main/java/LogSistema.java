
public class LogSistema {
    private static LogSistema instance;
    private final StringBuilder logs = new StringBuilder();

    private LogSistema() {}

    public static LogSistema getInstance() {
        if (instance == null) {
            synchronized (LogSistema.class) {
                if (instance == null) {
                    instance = new LogSistema();
                }
            }
        }
        return instance;
    }

    public void registrarErro(String mensagem) {
        logs.append("ERRO: ").append(mensagem).append("\n");
    }

    public String obterLogs() {
        return logs.toString();
    }
}
