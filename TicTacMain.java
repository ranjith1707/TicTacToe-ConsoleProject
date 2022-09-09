package tic.tac;
import java.util.Scanner;
public class TicTacMain {
   static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Game ");
	    System.out.println("Who Start  Firts \n 1.X  \n 2.O");
	    int given=input.nextInt();
	    GamePage page=new GamePage();
		page.start(given);
	}

}
