package ch08;
interface ICircle_F        //�w�q����
{
    public static final double pi=3.14;  
    public abstract void computeArea();
}

interface IColor_F        //�w�q����
{
    public abstract void draw(int i);
}

interface IColorCircle extends IColor_F,ICircle_F  //�~�Ө�Ӥ�����
{
    public abstract void show();
    public abstract void draw(int i);        //�L�N�q���ŧi
    //public abstract int draw(int i);       //���~���ŧi,�]���p�W�ۦP���^�ǭȤ��P
    public abstract void draw(int i,int j);  //�s�W����k�ŧi
}
class CShape_F
{
    protected double area;
    public void show()
    {
        System.out.println("area=" + area);   	
    }
}
class CCircle_F extends CShape_F implements IColorCircle  //��@����
{   
   protected double radius;
   public CCircle_F(double i){ radius = i; }   
   @Override public void computeArea()
   {
        area = radius * radius * pi;
   }
   @Override public void draw(int i)
   {
        if(i==0)      System.out.println("�ϧά��Ŧ���");
        else if(i==1) System.out.println("�ϧά�������");
        else if(i==2) System.out.println("�ϧά������");
        else          System.out.println("�C����~");
   }
   @Override public void draw(int i,int j)
   {
        draw(i);
        if(j==0)      System.out.println("�ϧά��Ť�");
        else if(j==1) System.out.println("�ϧά����");
        else          System.out.println("��J���~");
   }
}
public class CH0817 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
        CCircle_F obj = new CCircle_F(5.0);
        obj.computeArea();
        obj.show();
        obj.draw(2,1);        
	}
}
