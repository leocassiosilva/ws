package wsaula;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author Leocassio
 */
@WebService
public class Conversor {
    
    /*Metodo para converter*/
    @WebMethod
    public  double realToDolar(double valor){
        double dolar = 5.43; 
        return valor/dolar;
    }
}
