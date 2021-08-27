public class App {
    
    public static void main(String[] args) {
        String catFood = "fish";
        String dogFood = "bone";
        Animal dog = new Dog();
        dog.speak();
        dog.getFavoriteFoodName(dogFood);
        System.out.println("The dog's favorite food is: " + dogFood);
        Animal cat = new Cat();
        cat.speak();
        cat.getFavoriteFoodName(catFood);
        System.out.println("The cat's favorite food is: " + catFood);
    }
}
