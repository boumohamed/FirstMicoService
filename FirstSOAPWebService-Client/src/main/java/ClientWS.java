import proxy.BanqueService;
import proxy.Bws;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new Bws().getBanqueServicePort();
        System.out.println(stub.convert(100));
        List<Compte> list = stub.getComptes();
        list.forEach(c -> {
            System.out.println("Compte : " + c.getCode() + " => " + c.getSolde() + " Dh");
        });
    }
}
