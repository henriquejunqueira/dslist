package io.github.henriquejunqueira.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.henriquejunqueira.dslist.dto.GameMinDTO;
import io.github.henriquejunqueira.dslist.entities.Game;
import io.github.henriquejunqueira.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
//	public List<Game> findAll(){
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		
		// tranforma uma lista de games em uma lista de games dto
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		
//		return result;
		return dto;
	}
}
