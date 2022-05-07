
public class lesson6 {
    public static void main(String[] args) {
// 1. Создать классы Собака и Кот с наследованием от класса Животное.

//      2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//      Результатом выполнения действия будет печать в консоль.
//      (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        Cat cat = new Cat("Мурзик", "Серый", 7, 200);

        Dog dog = new Dog("Болт", "черный", 6, 500);


//      3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
//      плавание: кот не умеет плавать, собака 10 м.!!!
        cat.drift();
        cat.move();
        System.out.println(" ");
        System.out.println("_____________________________");
        System.out.println(" ");
        dog.drift();
        dog.move();
        System.out.println(" ");
        System.out.println("_____________________________");
        System.out.println("всех собак " + Dog.countDog);
        System.out.println("_____________________________");
        System.out.println("всех кошек " + Cat.countCat);
        System.out.println("_____________________________");
        System.out.println("всех животных " + Animal.countAnimal);


// сдача!






    }

}
