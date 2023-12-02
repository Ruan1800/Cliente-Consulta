package Cliente.ClienteConsulta.Controller;

import Cliente.ClienteConsulta.Model.Cliente;
import Services.ClienteService;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/Listar")
    @ResponseStatus(HttpStatus.FOUND)
    public ResponseEntity<List<(Cliente)>>ListarTodosClientes
}
