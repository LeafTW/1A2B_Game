package com.game._1a2b.repository;

import com.game._1a2b.enity.Game1A2B;
import com.game._1a2b.enity.Game1A2BLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Game1A2BRepository extends JpaRepository<Game1A2B,Integer> {
    Game1A2B findByAnswer(String ans);
}
