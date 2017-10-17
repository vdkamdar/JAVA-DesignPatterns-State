package airportSecurityState.util;

import airportSecurityState.util.MyLogger;

public class CalculateAverage{

    public CalculateAverage(){
	MyLogger.writeMessage("CalculateAverage instance is created", MyLogger.DebugLevel.CONSTRUCTOR);
    }

    public float getAverageTraffic(int number_of_travellers, int number_of_days){
	float average_traffic = (float)number_of_travellers / number_of_days;
	return average_traffic;
    }

    public float getAverageProhibitedItems(int number_of_prohibited_items, int number_of_days){
	float average_prohibited_items = (float)number_of_prohibited_items / number_of_days;
	return average_prohibited_items;
    }
}