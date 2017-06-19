package be.fremancoder.highscore.dto.mother;

import be.fremancoder.highscore.dto.ScoreDto;

/**
 * Created by Freddy on 18-6-2017.
 */
public class ScoreDtoMother {

    public static ScoreDto create(String user, int score){
        ScoreDto scoreDto = new ScoreDto();
        scoreDto.setUserName(user);
        scoreDto.setScore(score);
        return scoreDto;
    }
}
