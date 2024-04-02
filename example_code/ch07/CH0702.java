package ch07;
class NewStudent {  // Student類別宣告
    // 成員變數
    private String name;   // 姓名
    private String address;// 地址
    private int age;       // 年齡
    // 成員方法: 顯示學生名牌資料
    public void printNameInfo() {
        System.out.println("姓名: " + name);
        System.out.println("地址: " + address);
        System.out.println("年齡: " + age);
        System.out.println("-------------------");
    }
    // 成員方法: 設定姓名資料
    public void setName(String n){ name = n; }
    // 成員方法: 設定地址資料
    public void setAddress(String a){ address = a; }
    // 成員方法: 設定年齡資料
    public void setAge(int v) { age = v; }
    // 成員方法: 傳回姓名
    public String getName(){ return name; }
    // 成員方法: 傳回地址
    public String getAddress(){ return address; }
    // 成員方法: 傳回年齡
    public int getAge(){ return age; }
}
public class CH0702 {

	public static void main(String[] args) {
        // 宣告Student物件變數且建立物件
		NewStudent Jacky = new NewStudent();
		NewStudent Peter = new NewStudent();
        Jacky.setName("張無忌");  // 呼叫方法設定 Jacky 資料
        Jacky.setAddress("冰火島");
        Jacky.setAge(25);
        Peter.setName("張三豐"); // 呼叫方法設定Peter資料
        Peter.setAddress("武當山");
        Peter.setAge(100);
        Peter.printNameInfo();   // 呼叫方法顯示學生資料
        // 取得學生資料
        String name = Jacky.getName();
        String address = Jacky.getAddress();
        int age = Jacky.getAge();
        // 顯示學生資料
        System.out.println("[姓名]: " + name);
        System.out.println("[地址]: " + address);
        System.out.println("[年齡]: " + age);
	}
}
