package ch07;
class Student {  // Student���O�ŧi
    // �����ܼ�
    public String name;       // �m�W
    public String address;    // �a�}
    public int age;           // �~��
    // ������k: ��ܾǥͦW�P���
    public void printNameInfo() {
        System.out.println("�m�W: " + name);
        System.out.println("�a�}: " + address);
        System.out.println("�~��: " + age);
        System.out.println("-------------------");
    }
}
public class CH0701 {
	public static void main(String[] args) {
		// �ŧiStudent���O���A���ܼ�
        Student Jacky, Peter, Copy;
        // �إߪ�����
        Jacky = new Student();
        Peter = new Student();
        Copy = Jacky;
        Jacky.name = "�i�L��";  // �]�wJacky�����ܼ�
        Jacky.address = "�B���q";
        Jacky.age = 25;
        Peter.name = "�i�T��"; // �]�wPeter�����ܼ�
        Peter.address = "�Z��s";
        Peter.age = 100;
        Jacky.printNameInfo();  // �I�s���󪺤�k
        Peter.printNameInfo();
        Copy.printNameInfo();
	}
}
