package com.kelvin.contabancaria.service;

import com.kelvin.contabancaria.model.Conta;
import com.kelvin.contabancaria.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ContaSevice {

    @Autowired
    private ContaRepository contaRepository;

    public List<Conta> getAllConta(){
        List<Conta> contas = contaRepository.findAll();
        return contas;
    }
    
    public Conta getContaById(Long id){
        Optional<Conta> conta = contaRepository.findById(id);
        if (conta.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        return conta.get();
    }
        
}
