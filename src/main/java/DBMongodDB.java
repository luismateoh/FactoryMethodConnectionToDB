public class DBMongodDB implements IConnection {
    @Override
    public void conectDataBase() {
        System.out.println("Conectando ... base de datos " + TypeDataBase.MONGODB);
    }
    
    @Override
    public void disconnectDataBase() {
        System.out.println("Desconectando ... base de datos ");
    }
}
