package br.com.banco.repositories;

import br.com.banco.entities.Transferencia;
import org.apache.tomcat.jni.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;


public interface TransferenciaRepositories extends JpaRepository<Transferencia, Long> {
User findAllByDataDatransferencia(Date data);
        }
