package com.webvision.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webvision.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
