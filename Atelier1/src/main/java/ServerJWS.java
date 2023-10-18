import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

//ceci est notre serveur
public class ServerJWS {
    public static void main(String[] args)
    {
        //endpoint est une classe de jaxws
        //cette methode permet de demarer un serveur http qui utilisera le port 9191 et il est utiliser pour consulter seulement le webservice banqueservice
        //localhost signifie que le web service n'est accessible qu'on local si on veut de n'importe ou cest 0000
        //pour consulter de wsdl on lance le serveur et on cherche localhost:9191/NOMWEBS?wsdl mnt on a la documentation
        //soapUI est un outil qui permet de tester les webservice, on lui donnant le wsdl
        //jaxb cest une librairie qui permet de faire le mapping xml-> convertir a vers xml ou a partir dxml
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("web service déployé sur http://0.0.0.0:9191/");
    }
}
