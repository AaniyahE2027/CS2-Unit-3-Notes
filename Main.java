public class Main {

   public static void main(String []args) {
      // Create a new String -> SHORTCUT
      String lebron = "GOAT";
      //But Strings are actually OBJECTS
      //The orginal way to create a String:
      String steph = new String("GOAT");

      //All objects can be created using this pattern:
      // ClassName objectName = new ClassName();
      BuildABear basicBear = new BuildABear();
      //"BuildABear basicBear" is DECLARING a varible of type BuildABear
      //"new BuildABear()" is CALLING a CONSTRUCTOR to set up the object

      //Look at our new object
      System.out.println(basicBear);

      //Create a new object with our own values
      //called the CONSTRUCTOR: ClassName(String, String, int)
      BuildABear hero = new BuildABear("Superhero", "Spider Man", 90);

      //Printing an OBJECT calls the CLASS' toString() method
      System.out.println(hero);

      // Test our method below by CALLING them on an object instance
      // GETTERS are NON-VOID (we need to handle output data)
      System.out.println(hero.getType ());
      // or, store the return value in a varible
      double price = hero.getPrice ();
      System.out.println(price);

      // SETTERS are VOIDS (means no return value)
      //Calling void methods: objectName.methodName();
      hero.setName("Batman");
      hero.setFillLevel(50);
      //setter (mutators) changed values. Let's see the effects:
      System.out.println(hero);

      // STATIC varibles & methods belong to a CLASS
      // get CALLED using the Class name, NOT an object
      BuildABear.showStore();
      // we've used static methods from the Math class!!
      double randNum = Math.random();
      //NOTE: the main method is STATIC bc there is 
      // ONLY ONE COPY of it per program


   }//dont delete
}//dont delete
