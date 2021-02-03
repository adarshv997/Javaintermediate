import java.util.ArrayList;//import array list class

public class mainarraylist {
  public static void main(String[] args) {
    ArrayList<String> players = new ArrayList<String>(); //creating array list object
    players.add("Dhoni");//add elements to array list
    players.add("Sachin");
    players.add("Rohith");
    players.add("Kholi");
    System.out.println(players);
    System.out.println(players.get(0));//acces first element in array list
    System.out.println(players.set(0,"yuvi"));//modify first element
    System.out.println(players);
    System.out.println(players.size());
  }
}
