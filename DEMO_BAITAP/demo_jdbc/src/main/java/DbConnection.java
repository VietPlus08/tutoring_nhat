import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    public static Connection createConnection(){
        String url = "jdbc:sqlserver://localhost:1433;databaseName=tutoring_ex";
        String user = "fa";
        String password = "1234";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            if (connection != null) {
                System.out.println("Kết nối thành công!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
// CREATE DATABASE demo
//    CREATE TABLE Customer (
//        id INT PRIMARY KEY,
//        name NVARCHAR(100),
//    address NVARCHAR(255),
//    email NVARCHAR(100),
//    age INT
//);
//
//        INSERT INTO Customer (id, name, address, email, age)
//        VALUES (1, 'John Doe', '123 Main St', 'john.doe@example.com', 30);
