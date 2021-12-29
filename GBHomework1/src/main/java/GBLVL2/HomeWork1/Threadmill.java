package GBLVL2.HomeWork1;

public class Threadmill implements CheckCours {
    private final int THREADMILL_RUN_COURSE = 1000;

    @Override
    public void check(RunnableAndJumpable player) {

        if(THREADMILL_RUN_COURSE > player.run()) {
            System.out.println(player.toString() + " не смог пробежать");
        }else System.out.println(player.toString() + " смог пробежать");
    }
}
