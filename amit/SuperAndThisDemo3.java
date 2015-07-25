class A1
{
int a = 100;	
}
class B1 extends A1
{
	int a = 200;
}
class C1 extends B1
{
	int a = 300;
	C1(int a){
		A1 a1 = this;
		int b = a1.a + super.a + this.a + a;
		b = ((A1)this).a+ super.a + this.a + a;
		System.out.println(b);
	}
}
public class SuperAndThisDemo3 {

	public static void main(String[] args) {
		C1 obj = new C1(400);

	}

}
