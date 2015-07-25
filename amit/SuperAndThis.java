class Parent
{
	int a,b;
	Parent(){
		a= 10;
		b= 20;
		System.out.println("Parent Class Default Cons "+a+ " "+b);
	}
	Parent(int x){
		this();
		System.out.println("Parent Class Param Cons");
	}
}
class Child extends Parent
{
	int c;
	Child(){
		super(100);
		//super(); // parent class default cons call
		c = a + b;
		System.out.println("Child Class Default Cons Call "+c);
	}
	Child(int x){
		this();
		//super(100);
		System.out.println("Child class Param Cons Call");
	}
}
public class SuperAndThis {

	public static void main(String[] args) {
		/*Parent obj = new Parent(100);*/
		Child child  = new Child(200);
	}

}
