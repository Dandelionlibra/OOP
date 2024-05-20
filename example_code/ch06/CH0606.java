// package ch06;

public class CH0606 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		int Array[][]={{10,20,30,40,50},{60,70,80,90}};    // �w�q�G���}�C
		System.out.println("Array[0]: "+Array[0]);
		System.out.println("Array[1]: "+Array[1]);
		// System.out.println(Array[2]);
		printArray(Array);
		fix(Array);
		printArray(Array);

		int a = 2;
		System.out.println(a);
		a ++;
		System.out.println(a);

		a = 2;
		System.out.println(a);
		++ a;
		System.out.println(a);
		float c = 2.0f;
		//a = c;
		c = a;
		System.out.println(a);
		System.out.println(c);
		

	}
	public static void printArray(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
	    	for(int j=0;j<arr[i].length;j++)
	    		System.out.print(arr[i][j]+" ");        // �L�X�}�C��
	    	System.out.print("\n");
		}
	}

	public static void fix(int arr[][]) {
		System.out.println("enter fix:");
		arr[0][2] = 2; 
		
	}
}
