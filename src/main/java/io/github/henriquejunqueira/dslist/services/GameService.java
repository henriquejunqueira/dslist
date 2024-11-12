package io.github.henriquejunqueira.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.github.henriquejunqueira.dslist.dto.GameDTO;
import io.github.henriquejunqueira.dslist.dto.GameMinDTO;
import io.github.henriquejunqueira.dslist.entities.Game;
import io.github.henriquejunqueira.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		
		// tranforma uma lista de games em uma lista de games dto
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		
//		return result;
		return dto;
	}
}
