package ch05;

public class CH0502 {

	public static void main(String[] args) {
	      int i,min,max;
	      int a[]={20,50,10,70,20};  // 俱计皚a,砞﹚

	      min=max=a[0];
	      System.out.print("皚柑じ :   ");
	      for(i=0;i<a.length;i++)
	      {
	         System.out.print(a[i]+"  ");
	         if(a[i]>max)            // т程
	            max=a[i];
	         if(a[i]<min)            // т程
	            min=a[i];
	      }
	      System.out.println("\n程琌 : "+max);  // 程
	      System.out.println("程琌 : "+min);    // 程
	}
}
