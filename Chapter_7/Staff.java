//Staff class
//author: Shardul Vaidya
//Date: 22/02/2018

import java.util.*;
import console.*;

public class Staff {

	private static List<StaffMember> Staff = new ArrayList<StaffMember>();

	public Staff (){
		Staff.add(new Executive("Mr. Hatcher", "Alpharetta", "70707070", "606060610", 100000));
		Staff.add(new Employee("Mr. Wong", "Alpharetta", "604507491", "98406210", 65000));
		Staff.add(new Employee("Mr. Schultz", "Georgia", "65405406", "789456046", 45000));
		Staff.add(new Hourly ("Mr. Estes", "Georgia", "4561231", "7895465132", 10));
		Staff.add(new Hourly("Mr. Elengickal", "Savannah", "1651321", "7894561", 12));
		Staff.add(new Commission("Mr. Tahliani", "Atlanta", "12345879", "78945641", 75000));
		Staff.add(new Commission("Mr. Gluck", "San Fransisco", "4561323", "846512354", 125000));
		Staff.add(new Volunteer("Mr. Kaplan", "Beijing", "1324567"));
		Staff.add(new Volunteer("Mr. Kumar", "Pune", "12345945"));
		Staff.add(new Commission("Mr. Sharma", "Auticity", "4456897", "3245978", 85000));
		Staff.add(new Employee("Mr. Vaidya", "Galactica", "12345879", "789456412", 30000));

		((Executive)Staff.get(0)).awardBonus(25000);
		((Hourly)Staff.get(3)).addHours(41);
		((Hourly)Staff.get(4)).addHours(38);
		((Commission)Staff.get(5)).setCommission(1500);
		((Commission)Staff.get(6)).setCommission(12000);
		((Commission)Staff.get(9)).setCommission(1000);
	}

	public void payday () {
		for (StaffMember s : Staff){
			double amount = s.pay();
			System.out.println(s + "\n" + ((amount > 0.0) ? "Paid: " + Console.currencyFormat(amount) : "Thanks"));
			System.out.println("----------------------------------------");
		}
		System.out.println ("Payroll created by Payroll Manager: Shardul Vaidya");
	}

}