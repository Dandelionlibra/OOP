package ch09;

public class CH0904 {
    static void printErrMsg(Exception e) {
        System.out.println("�ҥ~����: " + e.getMessage());
        System.out.print("�ҥ~��]: ");
        e.printStackTrace();
    }
	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		int i;
        int[] data = {22, 14, 36, 68, 87};
        // �ҥ~�B�z�{���ԭz
        try {
            int index = (int)(Math.random()*10);
            i = data[index];  // ���ͶW�L�}�C�d��ҥ~
            // ���Ͱ��H�s���ҥ~
            for ( i = 2; i > -1; i-- )
                System.out.println("�p�⵲�G: " +10/i);
        }
        catch ( ArithmeticException e ) {
            // �B�z���H�s���ҥ~
            printErrMsg(e);
        }
        catch ( ArrayIndexOutOfBoundsException e ) {
            // �B�z�W�L�}�C�d��ҥ~
            printErrMsg(e);
        }
        finally {
            System.out.println("�ҥ~�B�z����");
        }
	}
}
