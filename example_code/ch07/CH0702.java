package ch07;
class NewStudent {  // Student���O�ŧi
    // �����ܼ�
    private String name;   // �m�W
    private String address;// �a�}
    private int age;       // �~��
    // ������k: ��ܾǥͦW�P���
    public void printNameInfo() {
        System.out.println("�m�W: " + name);
        System.out.println("�a�}: " + address);
        System.out.println("�~��: " + age);
        System.out.println("-------------------");
    }
    // ������k: �]�w�m�W���
    public void setName(String n){ name = n; }
    // ������k: �]�w�a�}���
    public void setAddress(String a){ address = a; }
    // ������k: �]�w�~�ָ��
    public void setAge(int v) { age = v; }
    // ������k: �Ǧ^�m�W
    public String getName(){ return name; }
    // ������k: �Ǧ^�a�}
    public String getAddress(){ return address; }
    // ������k: �Ǧ^�~��
    public int getAge(){ return age; }
}
public class CH0702 {

	public static void main(String[] args) {
        // �ŧiStudent�����ܼƥB�إߪ���
		NewStudent Jacky = new NewStudent();
		NewStudent Peter = new NewStudent();
        Jacky.setName("�i�L��");  // �I�s��k�]�w Jacky ���
        Jacky.setAddress("�B���q");
        Jacky.setAge(25);
        Peter.setName("�i�T��"); // �I�s��k�]�wPeter���
        Peter.setAddress("�Z��s");
        Peter.setAge(100);
        Peter.printNameInfo();   // �I�s��k��ܾǥ͸��
        // ���o�ǥ͸��
        String name = Jacky.getName();
        String address = Jacky.getAddress();
        int age = Jacky.getAge();
        // ��ܾǥ͸��
        System.out.println("[�m�W]: " + name);
        System.out.println("[�a�}]: " + address);
        System.out.println("[�~��]: " + age);
	}
}
