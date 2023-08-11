package data_11_08_2023;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter no of units consume");
		int units=obj.nextInt();
		double amt=0.0;
		
	if(units<=200)
	{
		amt=units*3.0;
	}
	else if(units<=300)
	{
		amt=(200*3.0)+((units-200)+4.4);
	}
	else if(units<=400)
	{
		amt=(200*3.8)+(100*5.1)+((units-400)*5.8);
	}
	else
	{
		amt=(200*3.8)+(100*4.4)+(100*5.1)+((units-400)*5.8);
	}
	

	System.out.println("Units consumed:"+units);
	System.out.println("Bill Amount:"+amt);

	}

}
