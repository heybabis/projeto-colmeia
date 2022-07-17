package com.colmeia.projetointegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colmeia.projetointegrador.entity.ItensDoacao;

@Repository
public interface ItensDoacaoRepository extends JpaRepository<ItensDoacao, Long>{

}
