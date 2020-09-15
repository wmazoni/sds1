package com.webvision.dspesquisa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webvision.dspesquisa.dto.GameDTO;
import com.webvision.dspesquisa.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameResource {
	
	@Autowired
	private GameService service;
	
	@GetMapping
	public ResponseEntity<List<GameDTO>> findAll() {
		List<GameDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
