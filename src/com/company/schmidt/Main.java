package com.company.schmidt;

public class Main {

    public static void main(String[] args) {
	String name = "Columbus";
	int zip = 43215;
		double avrTemp[] = {32,25,27,40,45};
		double total = 0;

		for(int i=0; i<avrTemp.length; i++){
			total = total + avrTemp[i];
		}

		double average = total / avrTemp.length;

		
        System.out.println("City: "+name+"| Zip Code: "+zip+"| Average high temperature: "+average+".");
    }
}
