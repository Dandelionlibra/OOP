package ch11;
import java.util.*;      //使用Collections Framework的類別需載入
public class CH1105 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		LinkedList<Integer> objLList1 = new LinkedList<>();
    	
        objLList1.add(25);  objLList1.add(18);  objLList1.add(41);
        objLList1.add(18);  objLList1.add(30);  objLList1.add(12);
        showList(objLList1);  
        System.out.println("第一個12的索引值為" + objLList1.indexOf(12));
        System.out.println("第一個元素為:" + objLList1.getFirst()); 
        System.out.println("最後一個元素為:" + objLList1.getLast());
        System.out.print("成功刪除前方第一個18:");
        System.out.println(objLList1.removeFirstOccurrence(18));
        System.out.print("成功刪除前方第一個12:");
        System.out.println(objLList1.removeFirstOccurrence(12));
        showList(objLList1);
        System.out.println("刪除第一個元素為:" + objLList1.pollFirst());
        showList(objLList1);
        System.out.println("第一個12的索引值為" +  objLList1.indexOf(12));  
	}
    public static void showList(LinkedList<Integer> objLList)
    {
        System.out.print("LinkedList目前長度為:" + objLList.size());
        System.out.print("   串列目前為:");
        for(int i=0;i<objLList.size();i++)
           System.out.print(objLList.get(i) + " ");
        System.out.println();  
    }
}
