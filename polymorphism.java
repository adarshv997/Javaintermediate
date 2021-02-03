class Animal {
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }
  
  class Pig extends Animal { 
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
  }
  
  class D extends Animal {
    public void animalSound() {
      System.out.println("The dog says: bow wow");
    }
  }
  
class polymorphism {
    public static void main(String[] args) {
      Animal myAnimal = new Animal();  // Create a Animal object
      Animal myPig = new Pig();  // Create a Pig object
      Animal myDog = new D();  // Create a Dog object
      myAnimal.animalSound();
      myPig.animalSound();
      myDog.animalSound();
    }
  }
  //output
  //The animal makes a sound
 //The pig says: wee wee
 //The dog says: bow wow
