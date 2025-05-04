
import java.util.Collections;

import org.bson.Document;

import com.mongodb.MongoClientSettings;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Program {

    public static void main(String[] args) {
    	
        // Dirección IP del servidor Debian con MongoDB
        String host = "192.168.1.208";
        int puerto = 27017;

        // Crear cliente
        MongoClient mongoClient = MongoClients.create(
            MongoClientSettings.builder()
                .applyToClusterSettings(builder ->
                    builder.hosts(Collections.singletonList(new ServerAddress(host, puerto))))
                .build()
        );

        // Seleccionar base de datos y colección
        MongoDatabase database = mongoClient.getDatabase("test");
        MongoCollection<Document> collection = database.getCollection("personas");

        // Insertar un documento
        Document doc = new Document("nombre", "Juan")
                .append("edad", 30);
        collection.insertOne(doc);

        // Leer documentos
        for (Document d : collection.find()) {
            System.out.println(d.toJson());
        }

        // Cerrar conexión
        mongoClient.close();
    }
}