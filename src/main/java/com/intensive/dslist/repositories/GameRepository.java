package com.intensive.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.intensive.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
