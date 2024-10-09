package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

//@Component // posso usar tanto a anotação @Component quanto @Service para registrar o component para o JPA
@Service
public class GameService {
	
	@Autowired // injeta uma instância do GameRepository dentro do GameService
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
//	public List<Game> findAll(){ // comento o método, já que ele não retorna mais uma lista de Game e sim de GameMinDTO
		// o método findAll vem da classe JpaRepository que está sendo extendida em GameRepository
		List<Game> result = gameRepository.findAll();
		
//		return result;
		
		// mapeia a lista de Game para GameMinDTO
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		
		// posso resumir a linha acima assim também:
//		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
		return dto; // retorna a lista mapeada com o que está no GameMinDTO
	}
	
}
