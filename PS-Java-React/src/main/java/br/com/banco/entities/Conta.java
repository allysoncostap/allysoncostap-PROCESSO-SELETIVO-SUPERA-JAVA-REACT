package br.com.banco.entities;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "conta")

public class Conta implements Serializable {
    private static final long serialVersionUID= 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
   @Column(name ="id_conta")
    private Long id;
    @Column(name = "nome_responsavel", nullable = false)
    private String nome;
    @ManyToOne
    private Transferencia transferencia;

    public Conta() {
    }

  

    public Conta(Long id, String nome) {
        this.id = id;
        this.nome = nome;
        this.transferencia = transferencia;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conta)) return false;
        Conta conta = (Conta) o;
        return Objects.equals(id, conta.id) && Objects.equals(nome, conta.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}
