
public class Bank {

	int getRateOfInterest() {
		return 0;
	}
}

class SBIBank extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class AXISBank extends Bank {
	int getRateOfInterest() {
		return 11;
	}
}

class ICICIBank extends Bank {
	int getRateOfInterest() {
		return 10;
	}
}

class BankTest {
	public static void main(String[] args) {
		
		Bank b = new Bank();
		System.out.println("Bank Rate of Interest : " + b.getRateOfInterest() + "%");
		Bank b1 = new SBIBank();
		Bank b2 = new ICICIBank();
		Bank b3 = new AXISBank();
		System.out.println("SBI Rate of Interest : " + b1.getRateOfInterest() + "%");
		System.out.println("ICICI Rate of Interest : " + b2.getRateOfInterest() + "%");
		System.out.println("AXIS Rate of Interest : " + b3.getRateOfInterest() + "%");
	}

}
