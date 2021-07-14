public class Cat extends Animal {
    Cat(String name, String color, int age, int obstacles) {

        super(name, color, age, obstacles);
        this.maxMove = 500;
        this.maxDrift = 2;
        countCat++;
    }
    public static int countCat = 0;

}
