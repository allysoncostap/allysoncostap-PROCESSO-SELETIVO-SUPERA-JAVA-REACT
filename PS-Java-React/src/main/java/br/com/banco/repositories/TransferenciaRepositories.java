package br.com.banco.repositories;

import br.com.banco.entities.Transferencia;
import org.apache.tomcat.jni.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.crypto.Data;

public interface TransferenciaRepositories extends JpaRepository<Transferencia, Long> {
User findAllByDataDatransferencia(Data data);
        }
