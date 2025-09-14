package OOPs.Abstraction;

// to use interface class we use implements
//we get the property of flyable2 this is used to link any property to parent class which only child class has to declare.
public abstract class bird2 implements Flyable2 {
    private final String breed;

    public bird2(String breed) {
        this.breed = breed;
    }

}
