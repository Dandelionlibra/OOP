package ch09;
import java.util.*;
public class CH0908 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

	      int num;
	      Scanner scn=new Scanner(System.in);
	      try
	      {
	         System.out.print("請輸入一個整數: ");
	         num=scn.nextInt();
	      }
	      catch(Exception e)
	      {
	         System.out.println("拋出"+e+"例外");
	      }
	      scn.close();
	}
}
