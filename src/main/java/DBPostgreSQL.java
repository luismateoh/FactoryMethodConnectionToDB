public class DBPostgreSQL implements IConnection {
    @Override
    public void conectDataBase() {
        System.out.println("Conectando ... base de  " + TypeDataBase.POSTGRESQL);
    }
    
    @Override
    public void disconnectDataBase() {
        System.out.println("Desconectando ... base de datos ");
    }
}
