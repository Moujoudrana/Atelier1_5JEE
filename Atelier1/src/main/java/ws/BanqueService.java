package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
//POJO c'est une classe java simple
//ce projet et avec JDK 17 a partir de jdk 10 jaxws nappartient plus a jdk
//c'est la raison pour laquelle la dependance est ajouter dans pom.xml
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt*10.54;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code,Math.random()*9888, new Date());
    }

    @WebMethod
    public List<Compte> listCompte(){
        return List.of(
                new Compte(1,Math.random()*9888, new Date()),
                new Compte(2,Math.random()*9888, new Date()),
                new Compte(3,Math.random()*9888, new Date())
        );
    }
}
