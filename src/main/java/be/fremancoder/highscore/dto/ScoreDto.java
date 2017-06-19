package be.fremancoder.highscore.dto;

import java.io.Serializable;

/**
 * Created by Freddy on 18-6-2017.
 */
public class ScoreDto implements Serializable {

    private String userName;

    private int score;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
