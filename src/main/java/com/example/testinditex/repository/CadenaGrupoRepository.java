package com.example.testinditex.repository;

import com.example.testinditex.entity.Cadenagrupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * CadenaGrupo JPA Repository
 */
@Repository
public interface CadenaGrupoRepository extends JpaRepository<Cadenagrupo,Integer> {

}
