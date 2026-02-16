package AnimalShelter;

public class Animal {
    private String name;
    private int order;

    public Animal(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setOrder(int order){
        this.order = order;
    }
    public int getOrder(){
        return order;
    }

    public String toString(){
        return "(ANIMAL " +
                "Name ='" + name +
                ", Order =" + order +
                ')';
    }

}
