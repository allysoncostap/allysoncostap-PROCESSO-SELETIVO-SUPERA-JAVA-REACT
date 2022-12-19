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

    @OneToMany(mappedBy = "conta", fetch = FetchType.LAZY)// esse é o valor default de fetch
    private List<Conta> conta;

}
