package asd;

import java.util.LinkedList;//import linkedlist class

public class mainlinkedlist {
  public static void main(String[] args) {
    LinkedList<String> players = new LinkedList<String>(); //creating linkedlist list object
    players.add("Dhoni");//add elements to linkedlist
    players.add("Sachin");
    players.add("Rohith");
    players.add("Kholi");
    System.out.println(players);
    players.addLast("yuvi"); //add element at last
    players.addFirst("Hardik");//add element at first
    System.out.println(players);
    System.out.println(players.getFirst());//get element at last
    System.out.println(players.getLast());//get element at last
    players.removeFirst();//remove element at last
    players.removeLast();//remove element at last
    System.out.println(players);

  }
}