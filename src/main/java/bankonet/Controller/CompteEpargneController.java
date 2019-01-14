package bankonet.Controller;

import bankonet.Entity.Client;
import bankonet.Entity.Compte;
import bankonet.Entity.CompteEpargne;
import bankonet.Repository.CompteEpargneRepository;
import bankonet.Repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/bankonet") // This means URL's start with /bankonet (after Application path)
public class CompteEpargneController {
    private final CompteEpargneRepository CompteEpargneRepository;

    @Autowired
    public CompteEpargneController(CompteEpargneRepository CompteEpargneRepository) {
        this.CompteEpargneRepository = CompteEpargneRepository;
    }

    @PostMapping("/addCompteEpargne")
    public @ResponseBody String addNewCompteEpargne (@RequestParam Integer numero, @RequestParam String intitule,
                                                     @RequestParam Integer solde, @RequestParam double tauxInteret,
                                                     @RequestParam Client client) {

        CompteEpargne n = new CompteEpargne();
        n.setNumero(numero);
        n.setIntitule(intitule);
        n.setSolde(solde);
        n.setTauxInteret(tauxInteret);
        n.setClient(client);
        CompteEpargneRepository.save(n);
        return "Saved";
    }
    @GetMapping(path="/compteEpargne")
    public @ResponseBody Iterable<CompteEpargne> getAllCompteEpargne() {
        // This returns a JSON or XML with the users
        return CompteEpargneRepository.findAll();
    }
}

// java -jar target/gs-mysql-data-0.1.0.jar