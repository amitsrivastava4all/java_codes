class FlipKart
{
	public void takeOrder(){
		checkStock(); // Delegation 
		checkDiscount();
		calcDelDate();
	}
	private void checkStock(){
		
	}
	private void checkDiscount(){
		
	}
	private void calcDelDate(){
		
	}
}
class Junglee {
	public void sellProduct(){
		FlipKart fk = new FlipKart();
		fk.takeOrder();
		
	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
		

	}

}
