import jdk.internal.foreign.SystemLookup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


    public class DatabaseConnection {
        private static DatabaseConnection instance;
        private Connection connection;


        private DatabaseConnection() {
            try {
                String url = "jdbc:mysql://localhost:3306/empresa";
                String user = "root";
                String password = "senha";
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                armazenarErro(e.getMessage());
            }
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


        public Connection getConnection() {
            return connection;
        }

        private static void armazenarErro(String mensagem) {
            LogSistema.getInstance().registrarErro(mensagem);
        }
    }
