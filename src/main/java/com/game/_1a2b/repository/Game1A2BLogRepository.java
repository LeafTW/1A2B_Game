package com.game._1a2b.repository;

import com.game._1a2b.enity.Game1A2BLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Game1A2BLogRepository extends JpaRepository<Game1A2BLog,Integer> {
    Integer countByRecordID(Integer recordId);
    List<Game1A2BLog> findByRecordID(Integer id);


}
