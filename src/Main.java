public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal tiger = new Tiger();
        Animal rabbit = new Rabbit();

        System.out.println("Собака:");
        dog.voice();
        dog.eat("Meat");
        dog.eat("Grass");

        System.out.println("\nТигр:");
        tiger.voice();
        tiger.eat("Meat");
        tiger.eat("Grass");


        System.out.println("\nКролик:");
        rabbit.voice();
        rabbit.eat("Meat");
        rabbit.eat("Grass");
    }
}
