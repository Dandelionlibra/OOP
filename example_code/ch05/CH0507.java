package ch05;

public class CH0507 {

	public static void main(String[] args) {
		int scores[][]={{85,78,65},
                		{75},
                		{63,95},
                		{94,92,88}};
		int array[][];
		array = scores.clone();      //�ƻs�}�C��������
		for(int[] row : array) {
			for(int element : row) {
				System.out.print(element + "\t");
			}
			System.out.println(); 
		}
		int array1[];
		array1 = scores[3].clone();  //�ƻs�ĥ|�C�}�C����
		for(int element : array1) {
			System.out.print(element + "\t");
		}
	}
}
