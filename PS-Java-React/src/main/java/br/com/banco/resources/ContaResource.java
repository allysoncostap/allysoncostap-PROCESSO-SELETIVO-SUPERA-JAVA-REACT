package br.com.banco.resources;

import br.com.banco.repositories.ContaRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/conta")
public class ContaResource {
@Autowired
    private ContaRepositories reposotories;

}
