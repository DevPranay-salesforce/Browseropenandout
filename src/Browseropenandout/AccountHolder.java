package Browseropenandout;

public class AccountHolder {
String firstName;
String lastName;
int age;
float accountBalance;
boolean eligibleForCreditCard;

public void testEligibilityForCreditCard() {
	// TODO Auto-generated method stub
	if (age>=25 && accountBalance>=5000) {
		eligibleForCreditCard=true;
	}
	else 
	{
	System.out.println("you are not eligible");
	}
}
}

	