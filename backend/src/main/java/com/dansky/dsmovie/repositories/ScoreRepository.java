package com.dansky.dsmovie.repositories;

import com.dansky.dsmovie.entities.Score;
import com.dansky.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {


}
