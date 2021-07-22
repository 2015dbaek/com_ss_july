package com_ss_july_day1;

public class com_ss_ex1 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 4; i++) {
			System.out.println(i+")");
			if(i % 2 == 0)
				System.out.println("..........");
			switch(i) {
			case 1: System.out.println("*\r\n" + 
					"**\r\n" + 
					"***\r\n" + 
					"****");
			break;
			case 2: System.out.println("****\r\n" + 
					"***\r\n" + 
					"**\r\n" + 
					"*");
			break;
			case 3: System.out.println("     *\r\n" + 
					"    ***\r\n" + 
					"   *****\r\n" + 
					"  *******");
			break;
			case 4: System.out.println("  *******\r\n" + 
					"   *****\r\n" + 
					"    ***\r\n" + 
					"     *");
			break;
			}
			if(i % 2 == 1)
				System.out.println("..........");
		}
	}

}
