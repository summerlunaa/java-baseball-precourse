package baseball;

import baseball.Game;

public class Application {

    public static void main(String[] args) {
        boolean isContinue = true;

        while (isContinue) {
            isContinue = Game.oneRound();
        }
    }
}
