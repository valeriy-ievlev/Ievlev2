package Lesson1;

public class Wall implements Barrier{
    private int maxHigh;

    public Wall(int maxHigh){
        this.maxHigh = maxHigh;
    }
    public void getBarrier(Activity a, Barrier b){
        if (a.getMaxJump() >= b.getMax()){
            System.out.println("Успешно перепрыгнул");
        }
        else {System.out.println("Не смог перепрыгнуть");
        }
    }

    public int getMax() {
        return maxHigh;
    }
}
