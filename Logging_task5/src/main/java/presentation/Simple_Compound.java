package presentation;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import c_client.server;

import java.math.*;
import java.io.*;
public class Simple_Compound implements presented{
	private static Logger LOGGER =LogManager.getLogger(Material_Standard_Server.class);
	public static void main(String[] args) {
		Simple_Compound object=new Simple_Compound();
		Scanner scanObj=new Scanner(System.in);
		LOGGER.debug("Enter principle Amount");
		int Principle_Amount=scanObj.nextInt();
		LOGGER.info(Principle_Amount);
		LOGGER.debug("Enter Rate of Interest");
		int Rate_Of_Interest=scanObj.nextInt();
		LOGGER.info(Rate_Of_Interest);
		LOGGER.debug("Time");
		
		int Time=scanObj.nextInt();
		LOGGER.info(Time);
		LOGGER.debug("SIMPLE INTEREST");
		LOGGER.info(object.Simple_Interest_Action(Principle_Amount,Rate_Of_Interest,Time));
		
		LOGGER.debug("COMPOUND INTEREST");
		LOGGER.info(object.Compound_Interest_Action(Principle_Amount,Rate_Of_Interest,Time));
		

	}

	public int Simple_Interest_Action(int Principle_Amount, int Rate_Of_Interest, int Time) {
		int Simple_Interest_result=(Principle_Amount*Time*Rate_Of_Interest)/100;
		return Simple_Interest_result;
	}

	public int Compound_Interest_Action(int Principle_Amount, int Rate_Of_Interest, int Time) {
		double Compound_Interest_result=Principle_Amount*(Math.pow(1.0+Rate_Of_Interest/100.0,Time)-1.0);
				return (int)Math.round(Compound_Interest_result);
	}

}
