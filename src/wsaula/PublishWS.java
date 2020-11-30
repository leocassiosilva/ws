package wsaula;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Leocassio
 */
public class PublishWS {

    public static void main(String[] args) {
        Conversor c = new Conversor();
        Endpoint.publish("http://localhost:8000/conversor", c);
        System.out.println("Server started");

    }

}
