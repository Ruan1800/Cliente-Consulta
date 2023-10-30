package Cliente.ClienteConsulta.Controller;

import Cliente.ClienteConsulta.Model.Cliente;
import Cliente.ClienteConsulta.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

        }
    @GetMapping
     public
    List<Cliente> ConsultaClientes(@RequestParam(required = false) String name) {


    }







}
