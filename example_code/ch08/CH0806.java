package ch08;

class CCAnimal                  // 父類別CCAnimal
{
	protected void AnimalName() {
		System.out.println("這是一隻動物"); 
	}
}
class CCDog extends CCAnimal                    
{
	@Override protected void AnimalName() {
		System.out.println("這是一隻聖伯納犬"); 
	}
}
public class CH0806 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CCAnimal Animal = new CCDog();
		Animal.AnimalName();
	}
}
