package lambdas;

public class Animal {

    private boolean canRun;

    private boolean canJump;

    public Animal(boolean b, boolean b1) {
        this.canRun = b;
        this.canJump = b1;
    }


    public boolean isCanRun() {
        return canRun;
    }

    public void setCanRun(boolean canRun) {
        this.canRun = canRun;
    }

    public boolean isCanJump() {
        return canJump;
    }

    public void setCanJump(boolean canJump) {
        this.canJump = canJump;
    }
}
