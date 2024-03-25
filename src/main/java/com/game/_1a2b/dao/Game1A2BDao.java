package com.game._1a2b.dao;


import com.game._1a2b.enity.Game1A2B;
import com.game._1a2b.enity.Game1A2BLog;

import java.util.HashMap;
import java.util.List;

public interface Game1A2BDao {
    //creat
    Game1A2B createAnswer();
    Game1A2BLog createLog(Integer recordID,String guessNumber);

    String AnalysisAnswer(Game1A2B game1A2B,String guessInt);

    //read


}
