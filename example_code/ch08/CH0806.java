package ch08;

class CCAnimal                  // �����OCCAnimal
{
	protected void AnimalName() {
		System.out.println("�o�O�@���ʪ�"); 
	}
}
class CCDog extends CCAnimal                    
{
	@Override protected void AnimalName() {
		System.out.println("�o�O�@���t�B�Ǥ�"); 
	}
}
public class CH0806 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CCAnimal Animal = new CCDog();
		Animal.AnimalName();
	}
}
