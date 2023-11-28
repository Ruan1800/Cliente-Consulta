package Cliente.ClienteConsulta.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Telefone")
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "numero")
    private int numero;

    @Column(name = "ddd")
    private int ddd;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Telefone() {

    }

    public Telefone(int numero, int ddd, Cliente cliente) {
        this.numero = numero;
        this.ddd = ddd;
        this.cliente = cliente;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
