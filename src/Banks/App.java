package Banks;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import Interfaces.IBank;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IBank bank = context.getBean("obc",IBank.class);
		IBank bank2 = context.getBean("pnb", IBank.class);
		IBank bank3 = context.getBean("hdfc", IBank.class);
		
		System.out.println("OBC");
		System.out.println(bank.getSavingsAccountDetails());
		System.out.println(bank.bankLocation());
		System.out.println(((OBC) bank).showServices());
		
		
		System.out.println("\n"+"PNB");
		System.out.println(bank2.getSavingsAccountDetails());
		System.out.println(((PNB) bank2).getFriends());
		System.out.println(bank2.bankLocation());
		
		System.out.println("\n"+"HDFC");
		System.out.println(bank3.getSavingsAccountDetails());
		System.out.println(bank3.bankLocation());
		
		
		
		
		
		

	}

}
