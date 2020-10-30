public class DogClient {
    public static void main(String[] args) {
        Dog p1 = new Dog("Lexi", 5, "Poodle");
        System.out.println(p1.getName()); 
        System.out.println(p1.getAge()); 
        System.out.println(p1.getBreed());
        System.out.println(p1); 
        p1.makeNoise(); 
    }
}