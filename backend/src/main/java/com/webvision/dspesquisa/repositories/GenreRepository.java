package com.webvision.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webvision.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
