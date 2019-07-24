package ro.itschool.mvnbase.curs8;

public class MainPet {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.voice());
        System.out.println( dog.numberOfLimbs());
        dog.eat("Pedigree");

        Cat cat = new Cat();
        System.out.println(cat.voice());
        System.out.println( cat.numberOfLimbs());
        cat.eat("mouse");

        Bird bird = new Bird();
        System.out.println(bird.voice());
        System.out.println( bird.numberOfLimbs());
        bird.eat("worm");
    }
}
