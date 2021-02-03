// Abstract class
abstract class Anim {
    // Abstract method 
    public abstract void animalSound();//abstract method doesnt have body
    // Regular method
    public void sleep() {
      System.out.println("zzzzz....");
    }
  }
  
  // Subclass (inherit from anim)
  class dog extends Anim {
    public void animalSound() {
      // The body of animalSound() 
      System.out.println("The dog says: bow bow");
    }
  }
  
  class main {
    public static void main(String[] args) {
      dog mydog = new dog(); // Create a dog object
      mydog.animalSound();
      mydog.sleep();
    }
  }
