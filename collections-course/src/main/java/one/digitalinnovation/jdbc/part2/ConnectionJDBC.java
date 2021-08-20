package one.digitalinnovation.jdbc.part2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

    public static void main(String[] args)  {

        String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";

        try (Connection conn = DriverManager.getConnection(urlConnection,"root", "Scoulier01")) {
            System.out.println("SUCESSO");
        } catch (Exception e) {
            System.out.println("FALHA");
        }
    }
}
