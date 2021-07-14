public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;
    protected int obstacles;
    int maxMove ;
    int maxDrift ;


    Animal(String  name, String color, int age, int obstacles){
        this.name = name;
        this.color = color;
        this.age = age;
        this.obstacles = obstacles;
        this.maxMove = 0;
        this.maxDrift = 0;
        countAnimal++;

    }
    public static int countAnimal = 0;

    void move () {

        if (maxMove <= 0)
            System.out.println(name + " не умеет бегать");
        else if (maxMove >= obstacles)
            System.out.println(name + " пробежал " + obstacles + "м ");
        else
            System.out.println("для " + name + " дистанция слишком большая");

    }
    void drift () {
        if (maxDrift <= 0)
            System.out.println(name + " не умеет плавать");
        else if (maxDrift >= obstacles)
            System.out.println(name + " проплыл " + obstacles + "м ");
        else
            System.out.println("для " + name + " дистанция слишком большая");
    }
}
