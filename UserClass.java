package tic.tac;
import java.util.*;
public class UserClass {
	static Scanner input=new Scanner(System.in);
	int pos;
	
	
	public int userX() {
       System.out.println("Enter your Position");
       pos=input.nextInt();
       if(pos<9) {
       return pos;
	}
    	   System.out.println("Enter correct position");
    	   userX();
       return 0;
	}
	public int userO() {
		System.out.println("Enter your position");
		pos=input.nextInt();
		if(pos<9) {
		       return pos;
			}
		    	   System.out.println("Enter correct position");
		    	   userX();
		       return 0;
	}
}