package bankonet.Controller;

import bankonet.Entity.Client;
import bankonet.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller    // This means that this class is a Controller
@RequestMapping(path="/bankonet") // This means URL's start with /bankonet (after Application path)

public class OperationController {
}
