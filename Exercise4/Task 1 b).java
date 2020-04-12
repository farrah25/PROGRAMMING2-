public class QuestionOne {
private int count;
	
	public void setInit(){
		count = 1;
	}
	public void increment() {
		count = count + 1;
	}
	public int getCount() {
		return count;
	}
   
 }
   class Q1Main {


    public static void main(String[] args) {
    QuestionOne q1;
		q1 = new QuestionOne();
		q1.setInit();
		q1.increment();
		q1.increment();
		System.out.println(q1.getCount());
	}
}