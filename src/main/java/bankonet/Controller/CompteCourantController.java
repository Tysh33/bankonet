package bankonet.Controller;

import bankonet.Entity.Client;
import bankonet.Entity.Compte;
import bankonet.Entity.CompteCourant;
import bankonet.Repository.CompteCourantRepository;
import bankonet.Repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/bankonet") // This means URL's start with /bankonet (after Application path)
public class CompteCourantController {
        private final CompteCourantRepository compteCourantRepository;

    @Autowired
        public CompteCourantController(CompteCourantRepository compteCourantRepository) {
            this.compteCourantRepository = compteCourantRepository;
        }

        @PostMapping("/addCompteCourant")
        public @ResponseBody String addNewCompteCourant (@RequestParam Integer numero, @RequestParam String intitule,
                                                         @RequestParam Integer solde, @RequestParam Integer decouvert,
                                                         @RequestParam Client client) {

            CompteCourant n = new CompteCourant();
            //CompteCourant c = new CompteCourant();
            n.setNumero(numero);
            n.setIntitule(intitule);
            n.setSolde(solde);
            n.setDecouvert(decouvert);
            n.setClient(client);
            compteCourantRepository.save(n);
            //compteCourantRepository.save(c);
            return "Saved";
        }
        @GetMapping(path="/compteCourant")
        public @ResponseBody Iterable<CompteCourant> getAllCompteCourant() {
            // This returns a JSON or XML with the users
            return compteCourantRepository.findAll();

        }
}

// mvn package
// java -jar target/gs-mysql-data-0.1.0.jar