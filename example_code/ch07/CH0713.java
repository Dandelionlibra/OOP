package ch07;
enum WeekDay {
	  Sun("Sunday","�P����"),
	  Mon("Monday","�P���@"),
	  Tue("Tuesday","�P���G"),
	  Wed("Wednesday","�P���T"),
	  Thu("Thursday","�P���|"),
	  Fri("Friday","�P����"),
	  Sat("Saturday","�P����");
	  private WeekDay(String day, String chinese){
	    this.day = day;
	    this.chinese = chinese;
	    //System.out.println("WeekDay() ��k�Q�I�s");   �i�H�ոե[�J����
	  }
	  private String day;
	  private String chinese;
	  public static WeekDay getWeek(int i){
		  switch(i){
		      case 0:
		        return Sun;
		      case 1:
		        return Mon;
		      case 2:
		        return Tue;
		      case 3:
		        return Wed;
		      case 4:
		        return Thu;
		      case 5:
		        return Fri;
		      case 6:
		        return Sat;
		      default:
		        return null;
		    }
	  }
	  public String getDay(){
	    return this.day;
	  }
	  public String getChinese(){
	    return this.chinese;
	  }
}
public class CH0713 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
	    WeekDay weekDay = WeekDay.getWeek(0);
	    System.out.println(weekDay.getDay());
	    System.out.println(weekDay.getChinese());
	}
}
