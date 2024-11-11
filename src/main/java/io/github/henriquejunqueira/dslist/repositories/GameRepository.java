package io.github.henriquejunqueira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.henriquejunqueira.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
