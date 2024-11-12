package io.github.henriquejunqueira.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.github.henriquejunqueira.dslist.dto.GameListDTO;
import io.github.henriquejunqueira.dslist.dto.GameMinDTO;
import io.github.henriquejunqueira.dslist.entities.GameList;
import io.github.henriquejunqueira.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		
		return dto;
	}
}
