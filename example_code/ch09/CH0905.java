package ch09;

public class CH0905 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		try {  // �ҥ~�B�z�{���ԭz
            // ���o�üƭ�
            int index = (int)(Math.random()*10);
            if ( index < 10 ) // ��XArithmeticException�ҥ~
                throw new ArithmeticException("�Ȥp��10");
        }
        catch ( ArithmeticException e ) {
            // �B�zArithmeticException�ҥ~
            System.out.println("�ҥ~����: "+e.getMessage());
            System.out.print("�ҥ~��]: ");
            e.printStackTrace();
        }
        finally {
            System.out.println("�ҥ~�B�z����");
        }
	}
}
