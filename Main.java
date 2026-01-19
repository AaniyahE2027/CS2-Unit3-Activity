public class Main {

   public static void main(String []args) {
       // CREATE 2 Pet objects with different initial values
      Pet dog = new Pet("Cutie", "French Bulldog", 1);
      System.out.println (dog); //toString
      Pet bunny = new Pet("LeGoat", "bunny", 2);
      System.out.println (bunny); //toString
      // TEST all Pet methods (getters, toString, setters)
      
      //getters
      System.out.println(dog.getAge());
      System.out.println(dog.getGender());
      System.out.println(dog.getIsSterile());
      System.out.println(dog.getWeight());
      System.out.println(dog.getType());
      System.out.println(dog.getName());

      //Setters
      dog.setName("Batman");
      dog.setAge(2);
      dog.setIsSterile(true);
      dog.setGender("girl");
      dog.setType("Poodle");
      dog.setWeight(50);
      System.out.println(dog);





   }
}
