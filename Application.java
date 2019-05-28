package com.loan.start;

import com.loan.operation.Process;
import com.loan.utils.Utility;

public class Application {
	
	public static void main(String[] args) {
		Process process = new Process();
		while(true){
		System.out.println("Do u have Application Number or Not (Enter 0) Press -1 to Exit");
		int applicationNumber = Utility.scanner.nextInt();
		if(applicationNumber==-1){
			System.out.println("Thanks for Using");
			System.exit(0);
		}
		if(applicationNumber==0){
			// New Customer
			process.sourcing();
		}
		else{
			// Existing Customer
			process.checkStage(applicationNumber);
		}
		}
	}

}