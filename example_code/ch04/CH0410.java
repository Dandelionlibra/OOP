package ch04;
import java.util.Scanner;

public class CH0410 {

	public static void main(String[] args) {
		// TODO 笆玻ネよ猭 Stub
		Scanner keyboardInput = new Scanner(System.in);
	    int Score;
	     
	    System.out.print("叫块璸阀Θ罿:");
	    Score=Integer.parseInt(keyboardInput.nextLine());            
	    if((Score>=0) && (Score<=100))
	    	switch(Score / 10)
	         {
	           case 10:
	               System.out.println("Чだ计");
	           case 9:
	               System.out.println("だ计单纔单");
	           case 8:
	               System.out.println("だ计单ヒ单");
	           case 7:
	               System.out.println("だ计单单");
	           case 6:
	               System.out.println("だ计单单");
	           default:
	               System.out.println("だ计单单");
	         }
	    keyboardInput.close();
	}
}
