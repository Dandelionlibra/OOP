package ch07;
class Student {  // Student類別宣告
    // 成員變數
    public String name;       // 姓名
    public String address;    // 地址
    public int age;           // 年齡
    // 成員方法: 顯示學生名牌資料
    public void printNameInfo() {
        System.out.println("姓名: " + name);
        System.out.println("地址: " + address);
        System.out.println("年齡: " + age);
        System.out.println("-------------------");
    }
}
public class CH0701 {
	public static void main(String[] args) {
		// 宣告Student類別型態的變數
        Student Jacky, Peter, Copy;
        // 建立物件實例
        Jacky = new Student();
        Peter = new Student();
        Copy = Jacky;
        Jacky.name = "張無忌";  // 設定Jacky物件的變數
        Jacky.address = "冰火島";
        Jacky.age = 25;
        Peter.name = "張三豐"; // 設定Peter物件的變數
        Peter.address = "武當山";
        Peter.age = 100;
        Jacky.printNameInfo();  // 呼叫物件的方法
        Peter.printNameInfo();
        Copy.printNameInfo();
	}
}
