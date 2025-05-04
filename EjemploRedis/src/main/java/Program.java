
import redis.clients.jedis.Jedis;

public class Program {

	public static void main(String[] args) {
	
		//datos de la vm
        String host = "192.168.1.208";
        int port = 6379;
        String password = "fernando";

        // conexión
        try (Jedis jedis = new Jedis(host, port)) {
            jedis.auth(password);

            // probando conexión.
            String respuesta = jedis.ping();
            System.out.println("Respuesta de Redis: " + respuesta);

            // set y get - probando un ejemplo
            jedis.set("nombre", "Juan");
            String valor = jedis.get("nombre");
            System.out.println("Valor de 'nombre': " + valor);
        } 
        catch (Exception e) 
        {
            System.err.println("Error conectando a Redis: " + e.getMessage());
        }
	}

}
