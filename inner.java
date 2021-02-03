
class OuterClass {
    int x = 2;  //outerclass
  
    class InnerClass {
      int y = 3;  //innerclass
    }
  }
  
  public class inner {
    public static void main(String[] args) {
      OuterClass myOuter = new OuterClass(); //// Instantiating the outer class
      OuterClass.InnerClass myInner = myOuter.new InnerClass(); //// Instantiating the inner class
      System.out.println(myInner.y + myOuter.x);
    }
  }
  //output 5(2+3)
  
