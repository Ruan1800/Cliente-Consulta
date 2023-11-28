package Cliente.ClienteConsulta.Controller;
import Cliente.ClienteConsulta.Model.Cliente;
import Services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cliente-consulta")
public class ClienteController {

    private final ClienteService clienteService;


    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping("/adicionar")
    @ResponseStatus(HttpStatus.CREATED)
    public void adicionarCliente(@RequestBody Cliente cliente) {
        clienteService.adicionarCliente(cliente);
    }
}
