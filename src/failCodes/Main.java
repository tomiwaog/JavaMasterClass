package failCodes;
import codingexercises.BarkingDog;
import ds.arraylistboxing.bankingapp.Customer;

public class Main {
	public static void main(String[] args) {

		Customer newCus = new Customer("Tomiwa", 50);
		System.out.println(newCus.getName());
		
		BarkingDog dog = new BarkingDog("Mr Penny");
		System.out.println(dog.getName());
		
		System.out.println(BarkingDog.bark(true,7));
	}
}
