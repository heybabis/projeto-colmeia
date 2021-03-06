package com.colmeia.projetointegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colmeia.projetointegrador.entity.AgendaRetiradaDeProdutos;

@Repository
public interface AgendaRetiradaDeProdutosRepository extends JpaRepository<AgendaRetiradaDeProdutos, Long>{

}
