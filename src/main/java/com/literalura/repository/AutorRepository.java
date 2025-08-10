package com.literalura.repository;

import com.literalura.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    // Busca un autor por nombre para evitar duplicados
    Optional<Autor> findByNombreContainsIgnoreCase(String nombre);

    // Busca autores que estaban vivos en un año determinado
    @Query("SELECT a FROM Autor a WHERE a.anioNacimiento <= :anio AND (a.anioFallecimiento IS NULL OR a.anioFallecimiento >= :anio)")
    List<Autor> findAutoresVivosEnAnio(int anio);
}