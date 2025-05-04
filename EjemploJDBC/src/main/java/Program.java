
import java.sql.*;

public class Program
{
	
    public static void main(String[] args) 
    {
    	//base de datos creada para pruebas en la vm
    	//respetar las mayúsculas
        String url = "jdbc:postgresql://192.168.1.208:5432/Prueba";
        String user = "postgres";
        String password = "postgres";

        try (Connection conn = DriverManager.getConnection(url, user, password)) 
        {
            System.out.println("Conexión exitosa");

            // INSERT 1
            String insertSql = "INSERT INTO Personas (Nombre) VALUES (?)";
            try (PreparedStatement stmt = conn.prepareStatement(insertSql)) 
            {
                stmt.setString(1, "Gabriel");
                stmt.executeUpdate();

                stmt.setString(1, "Ana");
                stmt.executeUpdate();
            }

            // SELECT
            String selectSql = "SELECT Id, Nombre FROM Personas";
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(selectSql)) 
            {
                while (rs.next()) 
                {
                    int id = rs.getInt("Id");
                    String nombre = rs.getString("Nombre");
                    System.out.println("ID: " + id + ", Nombre: " + nombre);
                }
            }

        } catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}