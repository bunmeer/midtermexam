import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Person[] persons = {
                new Person("Nami Emerald", 22, "421 Street, City"),
                new Person("Zoey Mira", 21, "84 Avenue, City"),
                new Person("Sophia Rhameen", 18, "123 Road, Town"),
                new Person("Aria Laca", 20, "534 Highway, Village"),
                new Person("Athena Lumi", 24, "101 Boulevard, Country")
        };
        System.out.println("\nPeople :");
        for (Person person : persons) {
            System.out.println(
                    person.getName() + " is " + person.getAge() + " years old. Lives in " + person.getAddress());
        }

        Scanner scanner = new Scanner(System.in);
        Dog[] dogs = {
                new Dog("Portia", "Shih Tzu"),
                new Dog("Wendy", "Lhasa Apso")
        };
        System.out.println("\nDogs :");
        for (Dog dog : dogs) {
            System.out.println(
                    dog.getName() + " is a " + dog.getBreed());
        }
        for (Dog dog : dogs) {
            System.out.print("\nEnter new name for " + dog.getName() + " : ");
            String new_name = scanner.nextLine();
            System.out.print("Enter new breed for " + dog.getName() + " : ");
            String new_breed = scanner.nextLine();
            dog.setName(new_name);
            dog.setBreed(new_breed);
            System.out.println("New dog : " + dog.getName() + ", " + dog.getBreed());
        }

        System.out.println("\nRectangle Calculator :");
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        Rectangle rect = new Rectangle(width, height);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
        scanner.close();
    }
}
