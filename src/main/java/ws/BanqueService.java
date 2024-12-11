package ws;

import java.util.ArrayList;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.Date;
import java.util.List;

@WebService
public class BanqueService {
    @WebMethod (operationName="convertoDH")
    public double conversion(@WebParam(name="montant") double mt) {
        return mt * 12;
    }
@WebMethod
    public Compte getCompte(@WebParam(name="code") int code) {
        return new Compte(code, Math.random() * 9000, new Date());
    }
    @WebMethod
    public List<Compte> ListComptes() {
        List<Compte> comptes = new ArrayList<Compte>();
        comptes.add(new Compte(1, Math.random() * 9000, new Date()));
        comptes.add(new Compte(2, Math.random() * 9000, new Date()));
        comptes.add(new Compte(3, Math.random() * 9000, new Date()));
        return comptes;
    }
}
