package ch05;

public class CH0506 {

	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 3, 5, 8, 13 };
		int[] array2=array.clone();

		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " "); 
		}
		System.out.println(); 
		for(int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " "); 
		}
	}
}
