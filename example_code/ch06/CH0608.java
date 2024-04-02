package ch06;

public class CH0608 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int A[]={1,2,3,4,5};
		
		System.out.println("呼叫square() method之前...");
	    for(int i=0;i<A.length;i++)     // 印出陣列的內容
		   System.out.print(A[i]+" ");
	    System.out.println();
	    square(A);                 // 呼叫 square()，並傳遞陣列A

	    System.out.println("呼叫square() method之後...");
	    for(int i=0;i<A.length;i++)     // 印出陣列的內容
	       System.out.print(A[i]+" ");

	    System.out.println();
	}
	public static void square(int arr[])
	{
	    for(int i=0;i<arr.length;i++)
	       arr[i]=arr[i]*arr[i];         // 將陣列的元素值平方
	}
}
