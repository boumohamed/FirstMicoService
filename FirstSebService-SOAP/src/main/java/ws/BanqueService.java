package ws;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "bws")
public class BanqueService {
    @WebMethod(operationName = "convert")
    public double convert(@WebParam(name = "montant") double mt)
    {
        return mt * 9.59;
    }
    @WebMethod(operationName = "getCompte")
    public Compte getCompte(@WebParam(name = "code") int code)
    {
        return new Compte(code, Math.random() * 5400, new Date());
    }

    @WebMethod(operationName = "getComptes")
    public List<Compte> LisComptes()
    {
        return List.of(
                new Compte(3, Math.random() * 5400, new Date()),
                new Compte(2,Math.random() * 5400, new Date()),
                new Compte(1, Math.random() * 5400, new Date())
        );
    }
}
