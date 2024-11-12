package io.github.henriquejunqueira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.henriquejunqueira.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
