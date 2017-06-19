package be.fremancoder.highscore.view;

import be.fremancoder.highscore.dto.HighScores;
import be.fremancoder.highscore.dto.ScoreDto;
import be.fremancoder.highscore.dto.mother.ScoreDtoMother;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("scores")
    public class HighScore {

        @GET
        @Produces({MediaType.APPLICATION_JSON})
        public Response getHighScores() {
            HighScores scores = new HighScores();

            scores.getScores().add(ScoreDtoMother.create("Freddy", 101));
            scores.getScores().add(ScoreDtoMother.create("Jonas", 90));
            scores.getScores().add(ScoreDtoMother.create("Wout", 80));
            scores.getScores().add(ScoreDtoMother.create("Flore", 66));
            scores.getScores().add(ScoreDtoMother.create("Katrien", 5));

            return Response.ok().entity(scores).build();
        }

        @GET
        @Path("users/{userId}")
        @Produces({MediaType.APPLICATION_JSON})
        public Response getHighScoresRangeForUser(@PathParam ("userId") Long userId) {
            HighScores scores = new HighScores();

            scores.getScores().add(ScoreDtoMother.create("Wout", 80));
            scores.getScores().add(ScoreDtoMother.create("Flore", 66));
            scores.getScores().add(ScoreDtoMother.create("Katrien", 5));

            return Response.ok().entity(scores).build();
        }

        @POST
        @Consumes(MediaType.APPLICATION_JSON)
        @Produces({MediaType.APPLICATION_JSON})
        public Response addScore(ScoreDto newScore){
            System.out.println("the user: " + newScore.getUserName());
            System.out.println("the score: " + newScore.getScore());

            //return Response.status(Response.Status.NOT_ACCEPTABLE).build();

            return Response.ok().entity(newScore).build();
        }

}