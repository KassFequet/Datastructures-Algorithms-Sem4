package AnimalShelter;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {
		AnimalShelter animalShelter = new AnimalShelter();

		animalShelter.enqueueCat(new Cat("Gerald"));
		animalShelter.enqueueDog(new Dog("Madeline"));
		animalShelter.enqueueCat(new Cat("Timothy"));
		animalShelter.enqueueDog(new Dog("Griffin"));


		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nWelcome to the Animal Shelter! Please select an option:");
			System.out.println("1. Adopt a Cat");
			System.out.println("2. Adopt a Dog");
			System.out.println("3. Adopt Any");
			System.out.println("4. Add a Cat");
			System.out.println("5. Add a Dog");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 1:
					System.out.println("\nAdopting a cat...");
					animalShelter.dequeueCat();
					break;
				case 2:
					System.out.println("\nAdopting a dog...");
					animalShelter.dequeueDog();
					break;
				case 3:
					System.out.println("\nAdopting an animal...");
					animalShelter.dequeueAny();
					break;
				case 4:
					System.out.print("\nEnter the name of the cat: ");
					String catName = scanner.nextLine();
					animalShelter.enqueueCat(new Cat(catName));
					System.out.println("Cat named " + catName + " has been added to the shelter.");
					break;
				case 5:
					System.out.print("\nEnter the name of the dog: ");
					String dogName = scanner.nextLine();
					animalShelter.enqueueDog(new Dog(dogName));
					System.out.println("Dog named " + dogName + " has been added to the shelter.");
					break;
				case 6:
					System.out.println("\nThank you for visiting the Animal Shelter. Goodbye!");
					return;
				default:
					System.out.println("\nInvalid choice. Please try again.");
			}
		}
    }
}
