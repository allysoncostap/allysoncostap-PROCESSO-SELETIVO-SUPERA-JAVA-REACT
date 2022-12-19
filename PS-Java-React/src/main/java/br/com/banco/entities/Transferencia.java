package br.com.banco.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "transferencia")
public class Transferencia {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;
    @Column(name="data_transferencia",nullable=false)
   private Date dataDatransferencia;
    @Column(name="valor", nullable=false, precision=11,scale=2)
private Double valor;
private String tipo;

    @Column(name = "nome_operador_transacao")
private String nomeDoOperadoDaTrasacao;

    @OneToMany
    @JoinTable(name = "transferencia_conta",joinColumns = @JoinColumn(name = "transferencia_id"),
            inverseJoinColumns = @JoinColumn(name = "conta_id"))
    private List<Conta> conta;


    public Transferencia() {
    }

    public Transferencia(Long id, Date dataDatransferencia, Double valor, String tipo, String nomeDoOperadoDaTrasacao, List<Conta> conta) {
        this.id = id;
        this.dataDatransferencia = dataDatransferencia;
        this.valor = valor;
        this.tipo = tipo;
        this.nomeDoOperadoDaTrasacao = nomeDoOperadoDaTrasacao;
        this.conta = conta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataDatransferencia() {
        return dataDatransferencia;
    }

    public void setDataDatransferencia(Date dataDatransferencia) {
        this.dataDatransferencia = dataDatransferencia;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNomeDoOperadoDaTrasacao() {
        return nomeDoOperadoDaTrasacao;
    }

    public void setNomeDoOperadoDaTrasacao(String nomeDoOperadoDaTrasacao) {
        this.nomeDoOperadoDaTrasacao = nomeDoOperadoDaTrasacao;
    }

    public List<Conta> getConta() {
        return conta;
    }

    public void setConta(List<Conta> conta) {
        this.conta = conta;
    }
}
