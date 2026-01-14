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
        this.name = n;
        this.age = a;
        this.weight = 10.0;
        this.type = t;
        this.isSterile = true;
        this.gender = "girl";
    }
     // 3. Define METHODS (getters, toString, setters)

    //(getters)
    public String getName (){
        return name;
    }
    public int getAge (){
        return age;
    }
    public double getWeight (){
        return weight;
    }
    public String getType (){
        return type;
    }
    public boolean getIsSterile (){
        return isSterile;
    }
    public String getGender (){
        return gender;
    }

    // toString
    public String toString (){
        String state = "Pet[" + name + "," + age + "," + weight + "," + type + "]";
        return state;
    }

    //setters
    public void setName (String newName){
        this.name = newName;
    }
    public void setAge (int newAge){
        this.age = newAge;
    }
    public void setWeight (double newWeight){
        this.weight = newWeight;
    }
    public void setType (String newType){
        this.type = newType;
    }
    public void setIsSterile (boolean newIsSterile){
        this.isSterile = newIsSterile;
    }
    public void setGender (String newGender){
        this.gender = newGender;
    }
    
 }// dont delete