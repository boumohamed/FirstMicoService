import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class server {

    public static void main(String[] args) {
        String url = "http://0.0.0.0:9092/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("server deployer");
    }
}
