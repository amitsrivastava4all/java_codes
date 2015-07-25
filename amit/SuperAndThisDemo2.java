class X1
{
	int a;
	X1(){
		a=100;
	}
}
class Y1 extends X1
{
	int a = 200;
	Y1(int a){
		int b = super.a + this.a + a;
		System.out.println(b);
	}
}
public class SuperAndThisDemo2 {

	public static void main(String[] args) {
		Y1 obj =new Y1(300);

	}

}
