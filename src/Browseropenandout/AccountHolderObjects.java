package Browseropenandout;

public class AccountHolderObjects {
 
	public static void main(String[] args) {
		
		AccountHolder sachin = new AccountHolder();
		AccountHolder yuvi = new AccountHolder();
		AccountHolder vipul = new AccountHolder();
		AccountHolder farhan = new AccountHolder();
		
		sachin.firstName ="sachin";
		sachin.lastName ="Tendulkar";
		sachin.age =26;
		sachin.accountBalance= 125000f ;
		sachin.testEligibilityForCreditCard();
		System.out.println("Is eligible for credit card :"+ sachin.eligibleForCreditCard);
		
		if (sachin.eligibleForCreditCard==true) {
			System.out.println("Yes");
		}
	}
}


