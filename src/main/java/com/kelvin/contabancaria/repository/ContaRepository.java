package com.kelvin.contabancaria.repository;

import com.kelvin.contabancaria.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

    public List<Conta> findAllByAgencia(@Param("Agencia") Integer Agencia);

    public Optional<Conta> findByNumero(@Param("Numero") Integer Numero);

}
