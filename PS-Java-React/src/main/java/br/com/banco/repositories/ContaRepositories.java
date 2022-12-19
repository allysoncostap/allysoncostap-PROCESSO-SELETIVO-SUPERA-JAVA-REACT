package br.com.banco.repositories;


import br.com.banco.entities.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepositories extends JpaRepository<Conta, Long> {
}
