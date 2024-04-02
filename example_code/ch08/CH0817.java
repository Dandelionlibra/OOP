package ch08;
interface ICircle_F        //定義介面
{
    public static final double pi=3.14;  
    public abstract void computeArea();
}

interface IColor_F        //定義介面
{
    public abstract void draw(int i);
}

interface IColorCircle extends IColor_F,ICircle_F  //繼承兩個父介面
{
    public abstract void show();
    public abstract void draw(int i);        //無意義的宣告
    //public abstract int draw(int i);       //錯誤的宣告,因為署名相同但回傳值不同
    public abstract void draw(int i,int j);  //新增的方法宣告
}
class CShape_F
{
    protected double area;
    public void show()
    {
        System.out.println("area=" + area);   	
    }
}
class CCircle_F extends CShape_F implements IColorCircle  //實作介面
{   
   protected double radius;
   public CCircle_F(double i){ radius = i; }   
   @Override public void computeArea()
   {
        area = radius * radius * pi;
   }
   @Override public void draw(int i)
   {
        if(i==0)      System.out.println("圖形為藍色圓形");
        else if(i==1) System.out.println("圖形為紅色圓形");
        else if(i==2) System.out.println("圖形為綠色圓形");
        else          System.out.println("顏色錯誤");
   }
   @Override public void draw(int i,int j)
   {
        draw(i);
        if(j==0)      System.out.println("圖形為空心");
        else if(j==1) System.out.println("圖形為實心");
        else          System.out.println("填入錯誤");
   }
}
public class CH0817 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
        CCircle_F obj = new CCircle_F(5.0);
        obj.computeArea();
        obj.show();
        obj.draw(2,1);        
	}
}
