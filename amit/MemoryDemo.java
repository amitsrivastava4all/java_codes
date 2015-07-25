import java.util.ArrayList;
class X
{
	int a=100;
	String b= new String("Hello");
	float c=90.20f;
}
public class MemoryDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program Starts....");
		X obj = null;
		ArrayList list = new ArrayList();
		while(true){
			obj = new X();
			Thread.sleep(50);
			list.add(obj);
		}

	}

}
