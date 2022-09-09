package tic.tac;
// import java.util.*;
public class GamePage {
	UserClass user=new UserClass();
private char[] position= {' ',' ',' ',' ',' ',' ',' ',' ',' '}; 
	public void start(int given) {
		int pos=0;
		System.out.print("---------");
		System.out.println();
         for(int i=0; i<3; i++) {
        	 for (int j=1;j<3; j++) {
        		 System.out.print(position[pos]+" | ");
        		 pos++;
        	 }
        	 System.out.println(position[pos]);
        	 pos++;
        	 System.out.println("---------");
        	 
         }
         if(((position[0]=='X'&&position[1]=='X'&&position[2]=='X')||(position[0]=='O'&&position[1]=='O'&&position[2]=='O'))||((position[3]=='X'&&position[4]=='X'&&position[5]=='X')||(position[3]=='O'&&position[4]=='O'&&position[5]=='O'))||((position[6]=='X'&&position[7]=='X'&&position[8]=='X')||(position[6]=='O'&&position[7]=='O'&&position[8]=='O'))) {
        	 System.out.println("game Over");
        	 if(given==1) {
        		 System.out.println("O    is  a Winner");
        	 }
        	 else {
        		 System.out.println("X    is  a Winner");
        	 }
         }
         else if(((position[0]=='X'&&position[3]=='X'&&position[6]=='X')||(position[0]=='O'&&position[3]=='O'&&position[6]=='O'))||((position[1]=='X'&&position[4]=='X'&&position[7]=='X')||(position[1]=='O'&&position[4]=='O'&&position[7]=='O'))||((position[2]=='X'&&position[5]=='X'&&position[8]=='X')||(position[2]=='O'&&position[5]=='O'&&position[8]=='O'))) {
        	 System.out.println("game Over");
        	 if(given==1) {
        		 System.out.println("O    is  a Winner");
        	 }
        	 else {
        		 System.out.println("X    is  a Winner");
        	 }
         }
         else if(((position[0]=='X'&&position[4]=='X'&&position[8]=='X')||(position[0]=='O'&&position[4]=='O'&&position[8]=='O'))||((position[2]=='X'&&position[4]=='X'&&position[6]=='X')||(position[2]=='O'&&position[4]=='O'&&position[6]=='O'))) {
        	 System.out.println("game Over");
        	 if(given==1) {
        		 System.out.println("O    is  a Winner");
        	 }
        	 else {
        		 System.out.println("X    is  a Winner");
        	 }
         }
        	 
        	 
        	 
         else {
        	 boolean ch=true;
        	 for(int i=0; i<position.length; i++) {
        		 if(position[i]==' ') {
        			 ch=true;
        			 break;
        		 }
        		 else {
        			 ch=false;
        			
        		 }
        	 }
        	 
        	 if(ch) {
         myMethod(given);
         }
        	 else {
        		 System.out.println("-------game Over ------\n -------Mathch Draw");
        	 }
         }
	}
	public void myMethod(int given) {
		boolean check=user(given);
        if(given==1) {
       	 given=2;
        }
        else {
       	 given=1;
        }
        if(check) {
       	 start(given);
        }
        else {
       	 System.out.println(" Alredy Filled. Enter correct position");
       	if(given==1) {
          	 given=2;
           }
           else {
          	 given=1;
           }
       	 myMethod(given);
        }
	}
	
	public boolean user(int given) {
		if(given==1) {
			int x=user.userX();
			return userPosition(x,'X');
			
		}
		else {
			int o=user.userO();
			return userPosition(o,'O');
		}
		
		
	}
	public boolean  userPosition(int a,char c) {
		if(position[a]==' ') {
			position[a]=c;
			return true;
		}
		return false;
	}
	
}
