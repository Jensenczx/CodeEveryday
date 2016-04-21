interface Toy {
    void talk();
}

class Dog implements Toy {
    // Write your code here
    public void talk(){
        System.out.println("Wow");
    }
}

class Cat implements Toy {
    // Write your code here
    public void talk(){
        System.out.println("Meow");
    }
}

public class ToyFactory {
    /**
     * @param type a string
     * @return Get object of the type
     */
    public Toy getToy(String type) {
        // Write your code here
        if(type==null)
            return null;
        if(type.equals("Dog"))
            return new Dog();
        if(type.equals("Cat"))
            return new Cat();
        return null;
    }
}