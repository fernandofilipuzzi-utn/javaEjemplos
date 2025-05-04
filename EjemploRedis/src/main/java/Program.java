
import redis.clients.jedis.Jedis;

public class Program {

	public static void main(String[] args) {
		// Datos de conexión
        String host = "192.168.1.208";
        int port = 6379;
        String password = "virginia";

        // Conectar a Redis
        try (Jedis jedis = new Jedis(host, port)) {
            jedis.auth(password);

            // Probar conexión
            String respuesta = jedis.ping();
            System.out.println("Respuesta de Redis: " + respuesta);

            // Setear y obtener una clave
            jedis.set("nombre", "Juan");
            String valor = jedis.get("nombre");
            System.out.println("Valor de 'nombre': " + valor);
        } catch (Exception e) {
            System.err.println("Error conectando a Redis: " + e.getMessage());
        }

	}

}
