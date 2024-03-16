package com.game._1a2b.service;

import com.game._1a2b.dao.Game1A2BDaoImpl;
import com.game._1a2b.enity.Game1A2B;
import com.game._1a2b.enity.Game1A2BLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class Game1A2BService {
    @Autowired
    private Game1A2BDaoImpl game1A2BDao;

    public Game1A2B createAnswer() {
        return game1A2BDao.createAnswer();
    }

    public Game1A2BLog createLog(Integer Record_ID, String GuessNumber){
        return game1A2BDao.createLog(Record_ID,GuessNumber);
    }
    public String AnalysisAnswer(Game1A2B game1A2B,String guessString){
        return game1A2BDao.AnalysisAnswer(game1A2B,guessString);
    }

}
