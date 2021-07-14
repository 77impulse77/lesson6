public class snake extends Animal {
    snake(String name, String color, int age, int obstacles) {
        super(name, color, age, obstacles);
    }

    void move() {
        System.out.println(name + " ползет на брюхе");
    }


}
