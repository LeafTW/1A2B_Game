package com.game._1a2b.dao;

import com.game._1a2b.enity.Game1A2B;
import com.game._1a2b.enity.Game1A2BLog;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Random;

@Component
public class Game1A2BDaoImpl implements Game1A2BDao {
    // 產生四位不重複的答案
    @Override
    public Game1A2B createAnswer() {
        int[] answer = new int[4];
        String anseerStr="";
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            int digit;
            do {
                digit = random.nextInt(10);
            } while (contains(answer, digit));
            answer[i] = digit;
        }
        for (int i:answer) {
            anseerStr=anseerStr+i;
        }
        Game1A2B game1A2B = new Game1A2B();
        game1A2B.setAnswer(anseerStr);
        return game1A2B;
    }
    // 判斷數組中是否包含指定數字
    private static boolean contains(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Game1A2BLog createLog(Integer recordID, String guessNumber) {
        Game1A2BLog game1A2BLog = new Game1A2BLog();
        game1A2BLog.setRecordID(recordID);
        game1A2BLog.setGuess(guessNumber);
        return game1A2BLog;
    }

    @Override
    public String AnalysisAnswer(Game1A2B game1A2B, String guessString) {
        int a = 0, b = 0;
        char[] answer = game1A2B.getAnswer().toCharArray();
        char[] charArray = guessString.toCharArray();


        for (int i = 0; i < answer.length; i++) {
           for (int j = 0; j < charArray.length; j++) {
                if (answer[i] == charArray[j]) {
                    if (i == j) {
                        a++;
//                        System.out.println("a-"+answer[i]+" G-"+charArray[j]+"A"+a+" B"+b);
                        break;
                    } else {
                        b++;
                        break;
//                        System.out.println("a-"+answer[i]+" G-"+charArray[j]+"A"+a+" B"+b);
                    }
                }
            }
        }
        String re = a + "A" + b + "B";
        return re;
    }
}
