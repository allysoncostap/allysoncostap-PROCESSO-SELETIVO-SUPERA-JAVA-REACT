package br.com.banco.resources;

<<<<<<< HEAD
import br.com.banco.repositories.TransferenciaRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name="/transferencia")
public class TransferenciaResource {

    @Autowired
    private TransferenciaRepositories repositories;

}
=======
import br.com.banco.entities.Conta;
import br.com.banco.entities.Transferencia;
import br.com.banco.repositories.TransferenciaRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "/conta")
public class TransferenciaResource {
    @Autowired
    private TransferenciaRepositories repositories;


    @PostMapping (name = "/l")
    public ResponseEntity<List<Transferencia>> findAll() {
        List<Transferencia> list = repositories.findAll();
        return ResponseEntity.ok(list);
    }

   /* @GetMapping(value = "/{id}")
    public ResponseEntity<Transferencia> findById(@PathVariable Long id) {
        Transferencia obj = repositories.findById(id).get();
        return ResponseEntity.ok(obj);
    }


    */



    }/*
    @GetMapping(value = "/{id}")
    public ResponseEntity<Transferencia> findById(@PathVariable Long id) {

        Transferencia obj = repositories.findById(id).get();
        return ResponseEntity.ok(obj);
    }

   */

>>>>>>> dc8ccbf13a8fd95d9c8349696da12813f58cc8b6
