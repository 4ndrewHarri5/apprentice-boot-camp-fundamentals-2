package bowling;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BowlingGameTest {

    @Test
    public void whenBowledAll0ThenScore0() {

        Frame[] frames = {
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0)
        };

        BowlingGame bowling = new BowlingGame(frames);

        int score = bowling.score();

        Assertions.assertThat(score).isEqualTo(0);

    }

    @Test
    public void whenBowledAll1ThenScore20() {

        Frame[] frames = {
                Frame.setAllRolls(1,1),
                Frame.setAllRolls(1,1),
                Frame.setAllRolls(1,1),
                Frame.setAllRolls(1,1),
                Frame.setAllRolls(1,1),
                Frame.setAllRolls(1,1),
                Frame.setAllRolls(1,1),
                Frame.setAllRolls(1,1),
                Frame.setAllRolls(1,1),
                Frame.setAllRolls(1,1)
        };

        BowlingGame bowling = new BowlingGame(frames);

        int score = bowling.score();

        Assertions.assertThat(score).isEqualTo(20);

    }

    @Test
    public void whenBowledSingleSpareAnd0IsAfterSpareThenScoreIs10() {

        Frame[] frames = {
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(7,3),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0)
        };

        BowlingGame bowling = new BowlingGame(frames);

        int score = bowling.score();

        Assertions.assertThat(score).isEqualTo(10);

    }

    @Test
    public void whenBowledSingleSpareAnd1IsAfterSpareThenScoreIs12() {

        Frame[] frames = {
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(7,3),
                Frame.setAllRolls(1,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0)
        };

        BowlingGame bowling = new BowlingGame(frames);

        int score = bowling.score();

        Assertions.assertThat(score).isEqualTo(12);

    }

    @Test
    public void whenBowledSingleSpareAnd1Then2IsAfterSpareThenScoreIs14() {

        Frame[] frames = {
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(7,3),
                Frame.setAllRolls(1,2),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0)
        };

        BowlingGame bowling = new BowlingGame(frames);

        int score = bowling.score();

        Assertions.assertThat(score).isEqualTo(14);

    }

    @Test
    public void whenBowledSingleSpareAnd1Then2Then1AgainIsAfterSpareThenScoreIs14() {

        Frame[] frames = {
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(7,3),
                Frame.setAllRolls(1,2),
                Frame.setAllRolls(1,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0)
        };

        BowlingGame bowling = new BowlingGame(frames);

        int score = bowling.score();

        Assertions.assertThat(score).isEqualTo(15);

    }

    @Test
    public void whenBowledTwoSpareInRowIsThenScoreIs31() {

        Frame[] frames = {
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(7,3),
                Frame.setAllRolls(9,1),
                Frame.setAllRolls(1,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0)
        };

        BowlingGame bowling = new BowlingGame(frames);

        int score = bowling.score();

        Assertions.assertThat(score).isEqualTo(31);

    }

    @Test
    public void whenBowledTwoSpareWithGapThenScoreIs20() {

        Frame[] frames = {
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(7,3),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(9,1),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0),
                Frame.setAllRolls(0,0)
        };

        BowlingGame bowling = new BowlingGame(frames);

        int score = bowling.score();

        Assertions.assertThat(score).isEqualTo(20);

    }



}
