package com.game._1a2b.controller;

import com.game._1a2b.enity.Game1A2B;
import com.game._1a2b.enity.Game1A2BLog;
import com.game._1a2b.repository.Game1A2BLogRepository;
import com.game._1a2b.repository.Game1A2BRepository;
import com.game._1a2b.service.Game1A2BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//@Controller
@RestController
@RequestMapping("game")
public class Game1A2BController {

    @Autowired
    Game1A2BService game1A2BService;

    @Autowired
    Game1A2BRepository game1A2BRepository;
    @Autowired
    Game1A2BLogRepository game1A2BLogRepository;

    @GetMapping("start")
    String startGame(){
        System.out.println("run start");
        Game1A2B start = game1A2BService.createAnswer();
        game1A2BRepository.save(start);
        Game1A2B byAnswer = game1A2BRepository.findByAnswer(start.getAnswer());
        return "Sucess_start"+byAnswer.getId();
    }

    @PostMapping("guess")
    String guess(Integer guessId,String guessStr){
        Game1A2B game = game1A2BRepository.getReferenceById(guessId);
        String s = game1A2BService.AnalysisAnswer(game, guessStr);
        Game1A2BLog log = game1A2BService.createLog(guessId, guessStr);
        game1A2BLogRepository.save(log);
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName(s);
        return s;
    }

    @GetMapping("guessLog")
    List<Game1A2BLog> guessLog(Integer guessId){
        Integer aLong = game1A2BLogRepository.countByRecordID(guessId);
        List<Game1A2BLog> byRecord_id = game1A2BLogRepository.findByRecordID(guessId);
        return byRecord_id;
    }
}
