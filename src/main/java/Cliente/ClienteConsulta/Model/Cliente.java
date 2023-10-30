package Cliente.ClienteConsulta.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private int cpf;
    private int Cnpj;
    private int rg;
    private Date DataCadrasto;
    private boolean ativo;


    public Cliente(long id, String nome, int cpf, int Cnpj, int rg, Date DataCadrasto, boolean ativo, List<Telefone> Telefones) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.Cnpj = Cnpj;
        this. rg = rg;
        this.ativo = ativo;
        this.DataCadrasto = DataCadrasto;
        this.Telefone = Telefones;
    }
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("cliente")
    private List<Telefone> Telefone;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCnpj() {
        return Cnpj;
    }

    public void setCnpj(int cnpj) {
        Cnpj = cnpj;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public Date getDataCadrasto() {
        return DataCadrasto;
    }

    public void setDataCadrasto(Date dataCadrasto) {
        DataCadrasto = dataCadrasto;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
