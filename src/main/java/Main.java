import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        IConnection connection = null;
        ConnectionConcreteFactory connectionCF = new ConnectionConcreteFactory();
        
        Random rnd = new Random();
        Integer var = 0;
        
        for (; ; ) {
            var = rnd.nextInt(6);
            Thread.sleep(1500);
            switch (var) {
                case 0:
                    connection = connectionCF.factoryConnection(TypeDataBase.MONGODB);
                    break;
                case 1:
                    connection = connectionCF.factoryConnection(TypeDataBase.SQLSERVER);
                    break;
                case 2:
                    connection = connectionCF.factoryConnection(TypeDataBase.MYSQL);
                    break;
                case 3:
                    connection = connectionCF.factoryConnection(TypeDataBase.POSTGRESQL);
                    break;
                case 4:
                    connection = connectionCF.factoryConnection(TypeDataBase.ORACLE);
                    break;
                default:
                    System.out.println("No se conecto ninguna base de datos");
            }
            connection.conectDataBase();
            connection.disconnectDataBase();
        }
    }
}

