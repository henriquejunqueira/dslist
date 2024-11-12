package io.github.henriquejunqueira.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.henriquejunqueira.dslist.dto.GameDTO;
import io.github.henriquejunqueira.dslist.dto.GameMinDTO;
import io.github.henriquejunqueira.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gameService;
	
	@GetMapping
//	public List<Game> findAll(){
	public List<GameMinDTO> findAll(){
//		List<Game> result = gameService.findAll();
		List<GameMinDTO> result = gameService.findAll();
		
		return result;
		
	}
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id){
		GameDTO result = gameService.findById(id);
		
		return result;
		
	}
	
}
