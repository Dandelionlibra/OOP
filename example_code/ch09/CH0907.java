package ch09;
class UserException extends Exception {
    // �ܼƫŧi
    int data;
    // �غc�l
    public UserException(int data) {
        this.data = data;
    }
    // �мggetMessage()��k
    public String getMessage() {
        return ("�X�����ƤӦh: " + data);
    }
}
public class CH0907 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		try {
            int i;
            for ( i = 0; i < 10; i++ ) {
                if ( i == 5 ) {
                    // ��X�ۭq���ҥ~
                    throw new UserException(5);
                }
                System.out.println("�X������: " + i);
            }
        }
        catch( UserException e ) {
            // �B�z�ۭq���ҥ~
            System.out.println("�ҥ~����: "+e.getMessage());
            System.out.print("�ҥ~��]: ");
            e.printStackTrace();
            return;
        }
        finally {
            System.out.println("�ҥ~�B�z����!");
        }
	}
}
