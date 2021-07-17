package pl.sood.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionSingleton {

    // volatile informuje wszystkie w�tki w porgramie, �e zmienna jest ulotna, czyli przed skorzystaniem z niej,
    // w�tek musi sprawdzi�, co aktualnie znajduje si� pod jej adresem w pami�ci.
    private static volatile DbConnectionSingleton instance = null;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/jdbc";
    private String username = "root";
    private String password = "root";

    private DbConnectionSingleton() {
        //chroni przed u�yciem refleksi i metody setAccessible()
        if (instance != null) {
            throw new RuntimeException("Singleton already constructed, Not allowed. Please use getInstance() method");
        }
        try {
            Class.forName("org.mysql.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Something is wrong with the DB connection String : " + ex.getMessage());
        }
    }
    public Connection getConnection() {
        return connection;
    }
    public static DbConnectionSingleton getInstance() {
        if (instance == null) {
            //Tylko najszybszy w�tek wejdzie do tego bloku. Reszra czeka, a� wykona on swoj� prac�, kt�r� jest stworzenie obiektu.
            synchronized (DbConnectionSingleton.class) {
                if (instance == null) {
                    instance = new DbConnectionSingleton();
                }
            }
        }
        return instance;
    }
}
