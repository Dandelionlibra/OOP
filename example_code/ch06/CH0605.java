package ch06;

public class CH0605 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int maxNumber = 0;
	    int score[]={35,22,46,19,7,12};  // 宣告一維陣列score
	    maxNumber = largest(score);    // 將一維陣列score傳入largest() method
	    System.out.print("最大數為 : "+ maxNumber);
	}
	public static int largest(int arr[])
	{
	    int max=arr[0];
	    for(int i=0;i<arr.length;i++)
	      if(max<arr[i])
	         max=arr[i];
	    return  max;
	}
}
