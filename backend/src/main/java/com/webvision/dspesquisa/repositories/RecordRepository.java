package com.webvision.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webvision.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
