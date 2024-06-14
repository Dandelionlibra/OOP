package ch11;
import java.util.*;      //使用Collections Framework的類別需載入
class CStudent
{
   public int id;
   public String name;
   public int score;
   public CStudent(int i,String j,int k){id = i; name = j; score = k;}
   public void showData()
   {
       System.out.print("學號:" + id);
       System.out.print("\t姓名:" + name);
       System.out.println("\t成績:" + score);
   }
} 
class CMyComparator1 implements Comparator<Object>   
{
   public int compare(Object o1,Object o2) //改寫
   {
       if(o1 instanceof CStudent && o2 instanceof CStudent)
       {
          if(((CStudent)o1).id < ((CStudent)o2).id)
           return -1;
         else if(((CStudent)o1).id == ((CStudent)o2).id)
           return 0;
         else if(((CStudent)o1).id > ((CStudent)o2).id)
           return 1;         
       }
       return 0;    
   }
}
class CMyComparator2 implements Comparator<CStudent>   
{
   public int compare(CStudent o1,CStudent o2)
   {
       if(o1.score < o2.score)
           return -1;
       else if(o1.score == o2.score)
           return 0;
       else if(o1.score > o2.score)
           return 1;       
       return 0;    
   } 
}   
public class CH1113 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		LinkedList<CStudent> objLList1 = new LinkedList<CStudent>();
        
		CStudent obj1 = new CStudent(0001,"張無忌",100);
		CStudent obj2 = new CStudent(0002,"宋遠橋",85);
		CStudent obj3 = new CStudent(0003,"張翠山",95);
		CStudent obj4 = new CStudent(0004,"殷梨亭",95);
        
        objLList1.add(obj1);  objLList1.add(obj2);
        objLList1.add(obj3);  objLList1.add(obj4);     
        CMyComparator1 objComp1= new CMyComparator1();  //排序依據1
        Collections.sort(objLList1,objComp1); 
        
        ListIterator<CStudent> objListItr1 = objLList1.listIterator();
        System.out.println("學號遞增顯示:");
        while(objListItr1.hasNext())
        {
            objListItr1.next().showData();
        }
        CMyComparator2 objComp2= new CMyComparator2();  //排序依據2
        Collections.sort(objLList1,objComp2); 
        
        ListIterator<CStudent> objListItr2=objLList1.listIterator();        
        System.out.println("成績遞增顯示:");
        while(objListItr2.hasNext())
        {
            objListItr2.next().showData();
        }
	}
}
