package Cliente.ClienteConsulta.Model;


import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String cpf;
    private String cnpj;
    private String rg;
    private boolean ativo;
    private LocalDate data;

    public Cliente(String nome, String cpf, String cnpj, String rg, boolean ativo, LocalDate data) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.rg = rg;
        this.ativo = ativo;
        this.data = data;
    }
    public Cliente() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}

