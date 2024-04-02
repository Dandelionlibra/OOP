package ch08;

class myObject1 {  
    int nNum = 100;  
    public void setNum(int nN) {  
       nNum = nN;  
    }  
    public int getNum() {  
       return nNum;  
    }  
    public void printNum() {  
       System.out.println(nNum);  
    }  
} 
class myObject2 {  
    int nNum = 100;  
    public void setNum(int nN) {  
       nNum = nN;  
    }  
    public int getNum() {  
      return nNum;  
    }  
    public void printNum() {  
      System.out.println(nNum);  
    }  
    public boolean equals(Object obj) {      //myObject2 ��g�F  equals ��k
      if (obj == null) return false;  
      if (!(obj instanceof myObject2)) return false;  
      return this.nNum == ((myObject2) obj).getNum();  
    }  
}  
public class CH0808 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		//�r�ꫬ�O  
        String sA = "ABC";  
        String sB = "ABC";  
        String sC = new String("ABC");  
       
        //==�����  
        if (sA == sB)  
          System.out.println("sA == sB (�]����̫��V String pool �P�@�r��)");  
        else  
          System.out.println("sA != sB");  
        
        if (sA == sC)  
          System.out.println("sA == sC");  
        else  
          System.out.println("sA != sC (�]�� sC �t�~�t�m�@���O����Ŷ�)"); 
        
        //equals�����  
        if (sA.equals(sB))  
          System.out.println("sA.equals(sB) = true (�]�����ۦP����)");  
        else  
          System.out.println("sA.equals(sB) = false");  
       
        if (sA.equals(sC))  
          System.out.println("sA.equals(sC) = true (�]�����ۦP����)");  
        else  
          System.out.println("sA.equals(sC) = false");  
        
        //�۩w���O  
        myObject1 m1A = new myObject1();  
        myObject1 m1B = new myObject1();  
        myObject2 m2A = new myObject2();  
        myObject2 m2B = new myObject2();  
        
        //==�����  
        if (m1A == m1B)  
          System.out.println("m1A == m1B");  
        else  
          System.out.println("m1A != m1B (�]���S���b�ۦP���O�����})");  
       
        if (m2A == m2B)  
          System.out.println("m2A == m2B");  
        else  
          System.out.println("m2A != m2B (�]���S���b�ۦP���O�����})");  
       
          //equals�����  
        if (m1A.equals(m1B))  
          System.out.println("m1A.equals(m1B) = true");  
        else  
          System.out.println("m1A.equals(m1B) = false (�S���Ƽg  equals method)");  
       
        if (m2A.equals(m2B))  
          System.out.println("m2A.equals(m2B) = true (�Ƽg  equals method)");  
        else  
          System.out.println("m2A.equals(m2B) = false");  
	}
}
