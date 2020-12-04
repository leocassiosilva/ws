package wsaula;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author Leocassio
 */
@WebService
public class Conversor {
    
    /*Metodo para converter real para dolar*/
    @WebMethod
    public  double realToDolar(double real){
        double dolar = 5.16;  //Valor do dolar na data 04/12/2020
        return real/dolar;
    }
    
    
    /*Metodo para converter real para dolar*/
    @WebMethod
    public  double dolarParaReal(double dolar){
        double real = 0.19; 
        return dolar/real;
    }
    
    /*Metodo para converter real para euro*/
    @WebMethod
    public  double realParaEuro(double real){
        double euro = 6.25; 
        return real/euro;
    }
    
    /*Metodo para converter euro para real*/
    @WebMethod
    public  double euroParaReal(double euro){
        double real = 0.16; 
        return euro/real;
    }
    
    /*Metodo para converter real para libras*/
    @WebMethod
    public  double realParaLibras(double real){
        double libras = 6.93; 
        return real/libras;
    }
    

    /*Metodo para converter real para libras*/
    @WebMethod
    public  double librasParaReal(double libras){
        double real = 0.14; 
        return libras/real;
    }
}
