public class Dog {
// properties
    private String name;
    private int age;
    private String color;
    private int weight;
    private Breed breed; //using enum type here
    private Size size; //Using enum type here

        // constructor
    public Dog(String name, int age, String color, int weight, Breed breed, Size size) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.breed = breed;
        this.size = size;
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
        Dog snoppy= new Dog("Snoppy", 12, "black", 52, Breed.GermanShepherd, Size.Large);

        System.out.println("Name:" + snoppy.getName());
        System.out.println("Age:" + snoppy.getAge());
        System.out.println("Color:" + snoppy.getColor());
        System.out.println("Weight:" + snoppy.getWeight());
        System.out.println("Breed:" + snoppy.getBreed());
        System.out.println("Size"+snoppy.getSize());

        //Spot
        Dog spot = new Dog("Spot", 5,"Brown",62, Breed.Corgi, Size.Small);

        System.out.println("Name:" + spot.getName());
        System.out.println("Age:" + spot.getAge());
        System.out.println("Color:" + spot.getColor());
        System.out.println("Weight:" + spot.getWeight());
        System.out.println("Breed:" + spot.getBreed());
        System.out.println("Size" + spot.getSize());

        //Wolf
        Dog wolf = new Dog("Wolf", 13, "Gold",87, Breed.GoldenRetriever, Size.Medium );

        System.out.println("Name:" + wolf.getName());
        System.out.println("Age:" + wolf.getAge());
        System.out.println("Color:" + wolf.getColor());
        System.out.println("Weight:" + wolf.getWeight());
        System.out.println("Breed:" + wolf.getBreed());
        System.out.println("Size:" + wolf.getSize());
        
//Behaviors
        snoppy.bark();
        spot.eat();
        wolf.sleep();
    }
}

