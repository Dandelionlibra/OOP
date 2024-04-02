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
    public boolean equals(Object obj) {      //myObject2 改寫了  equals 方法
      if (obj == null) return false;  
      if (!(obj instanceof myObject2)) return false;  
      return this.nNum == ((myObject2) obj).getNum();  
    }  
}  
public class CH0808 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		//字串型別  
        String sA = "ABC";  
        String sB = "ABC";  
        String sC = new String("ABC");  
       
        //==的比較  
        if (sA == sB)  
          System.out.println("sA == sB (因為兩者指向 String pool 同一字串)");  
        else  
          System.out.println("sA != sB");  
        
        if (sA == sC)  
          System.out.println("sA == sC");  
        else  
          System.out.println("sA != sC (因為 sC 另外配置一塊記憶體空間)"); 
        
        //equals的比較  
        if (sA.equals(sB))  
          System.out.println("sA.equals(sB) = true (因為有相同的值)");  
        else  
          System.out.println("sA.equals(sB) = false");  
       
        if (sA.equals(sC))  
          System.out.println("sA.equals(sC) = true (因為有相同的值)");  
        else  
          System.out.println("sA.equals(sC) = false");  
        
        //自定型別  
        myObject1 m1A = new myObject1();  
        myObject1 m1B = new myObject1();  
        myObject2 m2A = new myObject2();  
        myObject2 m2B = new myObject2();  
        
        //==的比較  
        if (m1A == m1B)  
          System.out.println("m1A == m1B");  
        else  
          System.out.println("m1A != m1B (因為沒有在相同的記憶體位址)");  
       
        if (m2A == m2B)  
          System.out.println("m2A == m2B");  
        else  
          System.out.println("m2A != m2B (因為沒有在相同的記憶體位址)");  
       
          //equals的比較  
        if (m1A.equals(m1B))  
          System.out.println("m1A.equals(m1B) = true");  
        else  
          System.out.println("m1A.equals(m1B) = false (沒有複寫  equals method)");  
       
        if (m2A.equals(m2B))  
          System.out.println("m2A.equals(m2B) = true (複寫  equals method)");  
        else  
          System.out.println("m2A.equals(m2B) = false");  
	}
}
