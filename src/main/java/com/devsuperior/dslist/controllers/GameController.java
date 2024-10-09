package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping // define que o verbo utilizado é o GET, já que é uma listagem
//	public List<Game> findAll(){ // agora o controller não irá retornar mais uma lista de Game e sim de GameMinDTO
	public List<GameMinDTO> findAll(){
//		List<Game> result = gameService.findAll();
		List<GameMinDTO> result = gameService.findAll();
		
		return result;
	}
	
}
