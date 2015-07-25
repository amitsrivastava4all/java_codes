
class Banking
{
public void deposit(){
	System.out.println("Banking Deposit");
}
public void withDraw(){
System.out.println("Common WithDraw");
}
public void roi(){
	System.out.println("Banking roi 6%");
}
}
class HDFC extends Banking
{
void doorToDoorService(){
System.out.println("Door to Door HDFC Banking ");
}
@Override
public void withDraw(){
	
System.out.println("If amount greater 50,000 than show PanCard");
super.withDraw();
}
}
class ICICI extends Banking
{
	@Override
	public void roi(){
		System.out.println("ICICI ROI 7%");
	}
}
class TestISA{
	public static void testUpcasting(Banking banking){
		banking.deposit();
		banking.withDraw();
		banking.roi();
		if(banking instanceof HDFC){
		HDFC hdfc = (HDFC) banking;// Downcasting
		hdfc.doorToDoorService();
		}
		
	}
public static void main(String args[])
{
	testUpcasting(new ICICI());  //Upcasting
	System.out.println("************************");
	testUpcasting(new HDFC());  //Upcasting
	//HDFC banking = new Banking();
/*Banking banking = new ICICI(); //Upcasting
banking.deposit();
banking.withDraw();
banking.roi();*/
//banking.doorToDoorService();
	
/*HDFC hdfc = new HDFC();
hdfc.withDraw();
hdfc.deposit();
hdfc.roi();
hdfc.doorToDoorService();
ICICI icici = new ICICI();
icici.withDraw();
icici.roi();
icici.deposit();*/

/*hdfc.withDraw();
hdfc.deposit();
hdfc.roi();
hdfc.doorToDoorService();*/
}
}