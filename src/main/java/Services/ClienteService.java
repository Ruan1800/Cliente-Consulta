package Services;

import Cliente.ClienteConsulta.Model.Cliente;
import Cliente.ClienteConsulta.Repository.ClienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;


    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;

    }

    public ResponseEntity<String>adicionarCliente(Cliente cliente) {

        try {
            clienteRepository.save(cliente);
            return ResponseEntity.status(HttpStatus.CREATED).body("Cliente Adicionado com sucesso.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("erro ao adicionar o cliente.");
        }


    }
}
