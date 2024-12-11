package ws;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String url="http://0.0.0.0:3000/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web service déployer sur"+url );
    }
}
