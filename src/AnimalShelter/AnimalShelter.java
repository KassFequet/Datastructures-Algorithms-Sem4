package AnimalShelter;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    private Queue<Cat> catQueue = new LinkedList<>();
    private Queue<Dog> dogQueue = new LinkedList<>();
    private int order = 0;

    public void enqueueCat(Cat cat) {
        cat.setOrder(order);
        order++;
        catQueue.add(cat);
    }

    public void enqueueDog(Dog dog) {
        dog.setOrder(order);
        order++;
        dogQueue.add(dog);
    }

    public Cat dequeueCat() {
        Cat adoptedCat = catQueue.poll();
        if (adoptedCat == null) {
            System.out.println("No cats available for adoption.");
        } else {
            System.out.println("You have adopted a cat named " + adoptedCat.getName());
        }
        return adoptedCat;
    }

    public Dog dequeueDog() {
        Dog adoptedDog = dogQueue.poll();
        if (adoptedDog == null) {
            System.out.println("No dogs available for adoption.");
        } else {
            System.out.println("You have adopted a dog named " + adoptedDog.getName());
        }
        return adoptedDog;
    }



    public Object dequeueAny() {
        if (catQueue.isEmpty() && dogQueue.isEmpty()) {
            System.out.println("No animals available for adoption.");
            return null;
        } else if (catQueue.isEmpty()) {
            return dequeueDog();
        } else if (dogQueue.isEmpty()) {
            return dequeueCat();
        } else {
            if (catQueue.peek().getOrder() > dogQueue.peek().getOrder()) {
                return dequeueDog();
            } else {
                return dequeueCat();
            }
        }
    }


}
