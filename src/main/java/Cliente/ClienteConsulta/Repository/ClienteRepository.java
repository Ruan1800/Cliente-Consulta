package Cliente.ClienteConsulta.Repository;
import Services.ClienteService;
import Cliente.ClienteConsulta.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findByCpfAndData(String cpf, LocalDate data);

     Optional<Cliente> findById(Long id);





}
