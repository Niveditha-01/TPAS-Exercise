package com.gl.array;

import java.text.DecimalFormat;

public class BillService {
		
		Integer finalPayment = 0;
		public static String billCalcultion(Consumer consumer) {
			String amount = null;
			DecimalFormat df = new DecimalFormat("0.00");
			Integer unitConsumed = consumer.getUnitConsumed();
			Double temp;
			if(unitConsumed <= 200)
				amount = "300";
			else if(unitConsumed > 201 && unitConsumed <=500)
			{
				 temp = 300 + (unitConsumed - 200) * 1.25;
				amount = df.format(temp);
			}
			else if(unitConsumed >=501 && unitConsumed <=1000)
			{
				temp = 300 + (300*1.25) + (unitConsumed - 500) * 1.00;	
			 amount = df.format(temp);
			}
			else if(unitConsumed > 1000) {
				temp = 300 + (300*1.25) + (500*1) + (unitConsumed - 1000) * 0.75;
			   amount = df.format(temp);
			}
			return amount;
	}
		
}