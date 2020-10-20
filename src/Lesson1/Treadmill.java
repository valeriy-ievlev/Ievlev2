package Lesson1;

public class Treadmill implements Barrier{
    private int maxLenght;

    public Treadmill(int maxLenght){
        this.maxLenght = maxLenght;
    }

    @Override
    public void getBarrier(Activity a, Barrier b) {
                if (a.getMaxRun() >= b.getMax()){
                    System.out.println("Успешно пробежал");
                }
                else {
                    System.out.println("Не смог пробежать");
                }
    }

    public int getMax() {
        return maxLenght;
    }
}
