package ch11;
class CLastClass
{
    public <M extends Number> M last(M a ,M b )
    {   
    	 return b;   
    }  
    public <N> N last(N a,N b, N c)
    {   
        return c;     
    }  
}
public class CH1101 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CLastClass obj1 = new CLastClass();
	  	
        System.out.println("最後一個為" + obj1.last(5.3D,2.7D));
        System.out.println("最後一個為" + obj1.last(2,4,6));
        System.out.println("最後一個為" + 
                             obj1.last("Hollo","My","Java"));
	}
}
