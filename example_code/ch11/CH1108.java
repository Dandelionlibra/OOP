package ch11;
import java.util.*;
public class CH1108 {
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
	    TreeSet<Integer> tset = new TreeSet<>();    //建立 tset 集合物件
	    System.out.println("將1~40的整數存入tset集合物件中...");
	    for(int i=1; i<=40; i++)
	      tset.add(i);
	    System.out.println("開始時，tset集合物件內元素個數為：" + tset.size());
	    Iterator<Integer> itera = tset.iterator();    //建立走訪器物件 itera
	    System.out.println("\n非質數移除中...");
	    int n1 = itera.next();
	    itera.remove();                 //1不是質數,先移除
	    while(itera.hasNext())
	    {
	      int num = itera.next();
	      for(int j=2; j<num; j++)
	      {
	        if(num % j == 0)
	        {
	          itera.remove();           //因有其它因數,故非質數
	          break;
	        }
	      }
	    }
	    System.out.println("非質數移除完畢");
	    System.out.println("最後，tset集合物件內元素個數為：" + tset.size());
	    System.out.println("1~40的質數有：" + tset);
	}
}
