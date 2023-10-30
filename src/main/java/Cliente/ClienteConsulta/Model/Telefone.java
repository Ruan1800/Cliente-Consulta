package Cliente.ClienteConsulta.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Telefone {

@ManyToOne
@JoinColumn(name = "cliente_id")
@JsonIgnoreProperties("Telefone")
    private Cliente cliente;
    private long id;
    private int numero;
    private int ddd;





}
