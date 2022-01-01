package GBLVL2.Homework1;

public class Wall implements CheckCours {

    private final int WALL_HEIGHT = 30;

    @Override
    public void check(RunnableAndJumpable player) {
        if(WALL_HEIGHT > player.jump()){
            System.out.println(player.toString() + " не смог перепрыгнуть");
        }else System.out.println(player.toString() + " смог перепрыгнуть");
    }
}
