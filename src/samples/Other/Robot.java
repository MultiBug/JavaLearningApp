package samples.Other;

public class Robot {
    private int i;
    int id = i;
    Robot(int i) {
        Brain b = new Brain();
        b.think();
    }
    private class Brain {
        public void think() {
            System.out.println(id + " is thinking");
        }
    }
}
