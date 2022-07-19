package Linkedlist;
import java.util.*;
import java.util.LinkedList;

public class ReverseLinkedlist {
  public static void main(String[] args) {
		 LinkedList<String> link = new  LinkedList<String>();
		 LinkedList<String> link1 = new  LinkedList<String>();
		 
		 link.add("A");
		 link.add("B");
		 link.add("C");
		 link.add("A");
		 link.add("D");
		 link.add("E");
		 System.out.println("Original Linked List :" +  link);
		 
		 link1 =((LinkedList)link.clone());
		 int size = link1.size();
		 for(int i=0; i<= size-1; i++) {
			 for(int j=0; j< size-i-1; j++) {
				 String value1 = link1.get(j);
				 String value2 = link1.get(j+1);
				 link1.set(j, value2);
				 link1.set(j+1, value1);
			 }
		 }
		 
		 System.out.println("Reverse Linked List :" + link1);
 }
}
