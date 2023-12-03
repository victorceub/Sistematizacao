package com.sistematizacao.entregadores.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sistematizacao.entregadores.models.EntregadorModel;

@Repository
public interface EntregadorRepository extends JpaRepository<EntregadorModel, Integer>{

}
