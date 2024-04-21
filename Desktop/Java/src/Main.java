import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Jojo", "black",true));
        animals.add(new Cat("Tuzic", "white", true));
        animals.add(new Animal("Zuko", "dfsdfhgAD"));
        animals.add(new VanaCat("Barsik", "gray", true));
        animals.add(new Lobrador("Sharik", "gray", true));

        for (Animal animal : animals) {
            System.out.println(animal.getSoun());

        }

    }

}
