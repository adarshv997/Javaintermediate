package asd;
//enum class
enum Level { //represent gorup of constants
    LOW,
    MEDIUM,
    HIGH
  }
  
  public class mainenum { 
    public static void main(String[] args) { 
      for (Level myVar : Level.values()) {  //enum type has a values() method it returns an array of all enum constants.
        System.out.println(myVar);
      }
    } 
  }
  