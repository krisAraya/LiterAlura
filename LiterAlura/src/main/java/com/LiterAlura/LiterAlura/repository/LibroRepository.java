package com.LiterAlura.LiterAlura.repository;

import com.LiterAlura.LiterAlura.entity.LibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LibroRepository extends JpaRepository<LibroEntity, Long> {

    @Query("SELECT l FROM LibroEntity l WHERE l.lenguaje >= :idioma")
    List<LibroEntity> findForLanguaje(String idioma);

    List<LibroEntity> findAll();

    LibroEntity save(LibroEntity libro);
}