package asd;
// Interface
interface Anim {
    // Abstract method 
    public void animalSound();//interface method doesnt have body
    public void sleep();//interface method doesnt have body
  }
  
  // dog implements anim inetrface
  class dog implements Anim {
    public void animalSound() {
      // The body of animalSound() 
      System.out.println("The dog says: bow bow");

    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
      }
  }
  
  class maininterface {
    public static void main(String[] args) {
      dog mydog = new dog(); // Create a dog object
      mydog.animalSound();
      mydog.sleep();
    }
  }