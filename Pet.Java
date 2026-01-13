public class Pet {
     // 1. Declare INSTANCE VARIABLES
     private String name;
     private int age;
     private double weight;
     private String type;
     private boolean isSterile;
     private String gender; 
    
     // 2. Define CONSTRUCTOR
     public Pet(String n, String t, int a){
        this.name = "n";
        this.age = a;
        this.weight = 10.0;
        this.type = "French BullDog";
        this.isSterile = true;
        this.gender = "girl";
    }
     // 3. Define METHODS (getters, toString, setters)

    //(getters)
    public String getName (){
        return type;
    }
    public String getAge (){
        return type;
    }
    public double getWeight (){
        return type;
    }
    public String getType (){
        return type;
    }
    public boolean getIsSterile (){
        return type;
    }
    public String getGender (){
        return type;
    }

    // toString
    public String toString (){
        "Pet[" + name + "," + age + "," + weight + "," + type + "]";
        return state;
    }

    //setters
    public void setName (String newName){
        this.name = newName;
    }
    public void setAge (int newAge){
        this.name = newAge;
    }
    public void setWeight (double newWeight){
        this.weight = newWeight;
    }
    public void setType (String newType){
        this.type = newType;
    }
    public void setIsSterile (boolean newIsSterile){
        this.isStrile = newIsStrile;
    }
    public void setGender (String newGender){
        this.gender = newGender;
    }
    
 }// dont delete