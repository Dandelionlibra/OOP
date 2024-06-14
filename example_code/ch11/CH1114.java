package ch11;

public class CH1114 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
        int arr[]={1,5,3,8,12};
        
        //傳統for迴圈
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       
        //for-each loop
        for(int i:arr){
            System.out.print(i+" ");
        }
	}
}
