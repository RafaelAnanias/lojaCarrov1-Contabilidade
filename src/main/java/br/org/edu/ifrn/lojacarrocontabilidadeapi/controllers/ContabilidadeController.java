package br.org.edu.ifrn.lojacarrocontabilidadeapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contabilidade")
@CrossOrigin(origins = "*")
public class ContabilidadeController {


    @GetMapping("/resumo")
    public ResponseEntity<String> gerarResumo() {

        return ResponseEntity.ok("Resumo Contábil: Sistema operando normalmente. Acesse o banco para ver o total de vendas.");
    }
}