package br.com.banco.resources;

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

