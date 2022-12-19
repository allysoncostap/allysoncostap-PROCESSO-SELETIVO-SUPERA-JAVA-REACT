package br.com.banco.resources;

import br.com.banco.entities.Transferencia;
import br.com.banco.repositories.ContaRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value= "/conta")
public class ContaResource {
@Autowired
    private ContaRepositories repositories;


}
