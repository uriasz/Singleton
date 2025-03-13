public class Empresa {
    public static void main(String[] args) {

        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();


        boolean mesmaConexao = db1.getConnection() == db2.getConnection();
        armazenarResultado("A conexão é a mesma? " + mesmaConexao);
    }


    private static void armazenarResultado(String mensagem) {
        LogSistema.getInstance().registrarErro("Resultado: " + mensagem);
    }
}
