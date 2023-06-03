package com.kelvin.contabancaria.controller;

import com.kelvin.contabancaria.model.Conta;
import com.kelvin.contabancaria.repository.ContaRepository;
import com.kelvin.contabancaria.service.ContaSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conta")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ContaController {

    @Autowired
    private ContaSevice contaService;

    @GetMapping
    public ResponseEntity <List<Conta>> getAll(){
        return ResponseEntity.ok(contaService.getAllConta());
    }

    @GetMapping("/{id}")
    public ResponseEntity <Conta> getById(@PathVariable Long id) {
        Conta contaById = contaService.getContaById(id);
        return ResponseEntity.ok(contaById);
    }
    
}
