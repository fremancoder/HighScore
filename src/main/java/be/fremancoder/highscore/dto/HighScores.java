package be.fremancoder.highscore.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Freddy on 18-6-2017.
 */
public class HighScores implements Serializable {

    List<ScoreDto> scores;

    public List<ScoreDto> getScores() {
        if(scores == null){
            scores = new ArrayList<ScoreDto>();
        }
        return scores;
    }

}
