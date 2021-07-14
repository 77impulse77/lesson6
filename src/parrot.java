public class parrot extends  bird {
    parrot(String name, String color, int age, int height, int obstacles) {
        super(name, color, age, height, obstacles);
    }
    void  speak() {
        System.out.println(name + " хочет рыбы!" );
    }
}
