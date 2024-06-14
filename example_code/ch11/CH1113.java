package ch11;
import java.util.*;      //�ϥ�Collections Framework�����O�ݸ��J
class CStudent
{
   public int id;
   public String name;
   public int score;
   public CStudent(int i,String j,int k){id = i; name = j; score = k;}
   public void showData()
   {
       System.out.print("�Ǹ�:" + id);
       System.out.print("\t�m�W:" + name);
       System.out.println("\t���Z:" + score);
   }
} 
class CMyComparator1 implements Comparator<Object>   
{
   public int compare(Object o1,Object o2) //��g
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
		// TODO �۰ʲ��ͪ���k Stub
		LinkedList<CStudent> objLList1 = new LinkedList<CStudent>();
        
		CStudent obj1 = new CStudent(0001,"�i�L��",100);
		CStudent obj2 = new CStudent(0002,"������",85);
		CStudent obj3 = new CStudent(0003,"�i�A�s",95);
		CStudent obj4 = new CStudent(0004,"����F",95);
        
        objLList1.add(obj1);  objLList1.add(obj2);
        objLList1.add(obj3);  objLList1.add(obj4);     
        CMyComparator1 objComp1= new CMyComparator1();  //�ƧǨ̾�1
        Collections.sort(objLList1,objComp1); 
        
        ListIterator<CStudent> objListItr1 = objLList1.listIterator();
        System.out.println("�Ǹ����W���:");
        while(objListItr1.hasNext())
        {
            objListItr1.next().showData();
        }
        CMyComparator2 objComp2= new CMyComparator2();  //�ƧǨ̾�2
        Collections.sort(objLList1,objComp2); 
        
        ListIterator<CStudent> objListItr2=objLList1.listIterator();        
        System.out.println("���Z���W���:");
        while(objListItr2.hasNext())
        {
            objListItr2.next().showData();
        }
	}
}
