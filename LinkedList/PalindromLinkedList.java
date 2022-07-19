package Linkedlist;

import java.util.*;
import java.util.LinkedList;
public class PalindromLinkedList{
	
	 static boolean Ispalindrome(LinkedList L1 , LinkedList L2 ) {
		 int lenth = L1.size();
		 for(int k=0; k<lenth ;k++ ) {
			 if(L1.get(k) ==L2.get(k)) {	 
				 return true;	 
			 }
		 }
		return false;
		 
		 }
	 public static void main(String[] args) {
		 LinkedList<String> link = new  LinkedList<String>();
		 LinkedList<String> link1 = new  LinkedList<String>();
		 
		 link.add("R");
		 link.add("A");
		 link.add("C");
		 link.add("E");
		 link.add("C");
		 link.add("A");
		 link.add("R");
		 
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
		 
		 if( Ispalindrome(link ,link1)== true) {
			 System.out.println(link+ "is Palindrom Word");
		 } 
		 else {
			 System.out.println(link+ "is Not Palindrom word");
		 }
			
		 }	 
		 
	 }
	

