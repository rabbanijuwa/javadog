public class Dog {
// properties
    private String name;
    private int age;
    private String color;
    private int weight;
    private Breed breed; //using enum type here
    private Size size; //Using enum type here

        // constructor
// Constructors
    public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

    public Dog(String name, int age, Size size) {
        this.name = name;
        this.age = age;
        this.size = size;
    }

    public Dog(String name, int age, Size size, Breed breed) {
        this.name = name;
        this.age = age;
        this.size = size;
        this.breed = breed;
    }
    // methods
    public void bark() {System.out.println(name + " is barking!"); }
    public void eat() {
        System.out.println(name + " is eating!");
    }
    public void sleep() {
        System.out.println(name + " is sleeping!");
    }

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge() {
        this.age = age;
    }

    public String getColor() {
        return color;
    }
    public void setColor() {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight () {
        this.weight = weight;
    }

    public Breed getBreed() {
        return breed;
    }
    public void setBreed(Breed breed) {this.breed = breed;}

    public Size getSize() {return size;}
    public void setSize(Size size) {this.size = size;}
    public static void main (String[] args) {
        // snoppy
        Dog snoppy= new Dog("Snoppy", 12);

        System.out.println("Name:" + snoppy.getName());
        System.out.println("Age:" + snoppy.getAge());

        //Spot
        Dog spot = new Dog("Spot", 5, Size.Small);

        System.out.println("Name:" + spot.getName());
        System.out.println("Age:" + spot.getAge());
        System.out.println("Size:" + spot.getSize());

        //Wolf
        Dog wolf = new Dog("Wolf", 13, Size.Medium, Breed.GoldenRetriever );

        System.out.println("Name:" + wolf.getName());
        System.out.println("Age:" + wolf.getAge());
        System.out.println("Breed:" + wolf.getBreed());
        System.out.println("Size:" + wolf.getSize());

//Behaviors
        snoppy.bark();
        spot.eat();
        wolf.sleep();
    }
}

