public class ConnectionConcreteFactory extends ConnectionAbstractFactory {
    @Override
    public IConnection factoryConnection(TypeDataBase dataBase) {
        switch (dataBase) {
            case MONGODB:
                return new DBMongodDB();
            case SQLSERVER:
                return new DBSQLServer();
            case MYSQL:
                return new DBMySQL();
            case POSTGRESQL:
                return new DBPostgreSQL();
            case ORACLE:
                return new DBOracle();
        }
        return null;
    }
}
