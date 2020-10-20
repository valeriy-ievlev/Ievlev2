package Lesson1;

public class Person implements Activity {
    private int maxRun;
    private int maxJump;

    public Person(int maxRun, int maxJump){
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
    @Override
    public void jump() {
        System.out.println("I am jumping" + getClass());
    }

    @Override
    public void run() {
        System.out.println("I am running" + getClass());
    }
    @Override
    public int getMaxRun() {
        return maxRun;
    }
    @Override
    public int getMaxJump() {
        return maxJump;
    }
}
