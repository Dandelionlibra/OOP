package ch06;

public class CH0609 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int orgArr[] = new int[3];
        for(int i=0;i<orgArr.length;i++)
            orgArr[i] = i;
        func1(orgArr);
        for(int i=0;i<orgArr.length;i++)
            System.out.println("orgArr[" + i + "]=" + orgArr[i]);       

	}
    public static void func1(final int[] arr1)
    {
        int arr2[]={5,10,15};
        for(int i=0;i<arr1.length;i++)
            arr1[i] = arr1[i] * arr1[i];        
        //arr1=arr2;
    }
}
