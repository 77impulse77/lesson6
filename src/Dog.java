public class Dog extends Animal {
     Dog(String name, String color, int age, int obstacles) {

        super(name, color, age, obstacles);
        this.maxMove = 500;
        this.maxDrift = 10;
        countDog ++;
    }
    static int countDog = 0;
}
