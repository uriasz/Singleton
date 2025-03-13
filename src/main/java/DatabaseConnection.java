public class DatabaseConnection {
    private static DatabaseConnection instance;
    private String connectionStatus;


    private DatabaseConnection() {
        connectionStatus = "Banco de dados conectado";
    }


    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public String getConnection() {
        return connectionStatus;
    }
}
