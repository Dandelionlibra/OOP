package ch11;

public class CH1114 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
        int arr[]={1,5,3,8,12};
        
        //�ǲ�for�j��
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
