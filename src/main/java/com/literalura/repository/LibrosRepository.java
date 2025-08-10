package com.literalura.repository;

import com.literalura.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibrosRepo extends JpaRepository<Libro, Long> {
}
