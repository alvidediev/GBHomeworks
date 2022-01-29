package GBLVL2.Homework1;

public class AppRunner {
    public static void main(String[] args) {
        RunnableAndJumpable[] players = {
                new Cat("Мурзик", 20, 20),
                new Human("John Connor",15,100),
                new Robot("T-1000",1000, 500)
        };

        CheckCours[] cours = {
                new Threadmill(),
                new Wall()
        };

        for (CheckCours cour : cours) {
            for (int i = 0; i < players.length; i++) {
                cour.check(players[i]);
            }
        }
    }
}
