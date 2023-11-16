package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.devsuperior.dslist.entities.GameList;

public interface GameListRepository extends JpaRepositoryImplementation<GameList, Long> {

}
