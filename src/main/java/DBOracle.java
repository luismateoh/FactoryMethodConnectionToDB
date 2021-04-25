public class DBOracle implements IConnection {
    @Override
    public void conectDataBase() {
        System.out.println("Conectando ... base de datos " + TypeDataBase.ORACLE);
    }
    
    @Override
    public void disconnectDataBase() {
        System.out.println("Desconectando ... base de datos ");
    }
}
