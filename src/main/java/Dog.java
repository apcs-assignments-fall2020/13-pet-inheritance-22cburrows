public class Dog extends Pet {
    // Instance variable(s)
    private String breed;

    // Constructors
    public Dog(String a, int b, String c) {
        super(a, b);
        this.breed = c;
    }

    public Dog(){
        super(a, b);
        this.breed = "Huskey";
    }

    // makeNoise() method
    public void makeNoise(){
        System.out.println("Roof");
    }

    // toString method
    public String toString() {
        String str = "Name: " + super.getName() + ", Age: " + super.getAge() + ", Breed:" + this.breed;
        return str;
    }
    // Getter
    public String getBreed() {
        return this.breed;
    }

    // Setter
    public void setBreed(String breed) {
        // Don't allow blank names
        if (breed.trim().length() != 0) {
            this.breed = breed;
        }
    }
}