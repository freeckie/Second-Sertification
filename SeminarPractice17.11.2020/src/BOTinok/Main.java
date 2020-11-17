package BOTinok;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static BOTinok.ConnectionData.URL;
import static BOTinok.ConnectionData.USER;
import static BOTinok.ConnectionData.PASSWORD;
public class Main {
    private static final String CREATE_TABLE_QUERY =
            "CREATE TABLE IF NOT EXISTS users "
                +"(id INT(5) NOT NULL AUTO_INCREMENT,"
                +"username VARCHAR(50),"
                +"PRIMARY KEY(id));";
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement statement = connection.createStatement()) {
            statement.executeUpdate(CREATE_TABLE_QUERY);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
}
