class Duck extends Animal implements Flyable, Swimmable, Walkable {
    public Duck(String name) {
        super(name);
        System.out.println("Duck constructor called");
    } 
    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }
    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }
    @Override
    public void walk() {
        System.out.println(name + " is walking");
    }
    @Override
    public void eat() {
        System.out.println(name + " the duck is eating grains");
    }
}
