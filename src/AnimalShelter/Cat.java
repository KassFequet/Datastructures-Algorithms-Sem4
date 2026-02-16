package AnimalShelter;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public String toString() {
        return "(CAT " +
                "Name ='" + getName() +
                ", Order =" + getOrder() +
                ')';
    }

}
