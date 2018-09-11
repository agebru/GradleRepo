package grdl01;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		ApplicationContext context=new ClassPathXmlApplicationContext("context/applicationContext.xml");
		
		Passanger psgr=context.getBean("pasanger", Passanger.class);
		((ClassPathXmlApplicationContext)context).close();
		
		
		psgr.setPassangerid(101);
		psgr.setPassangerName("Johnson");		
		System.out.println(psgr);
		
		 Scanner airLineScanner = null;
		try {
			airLineScanner=new Scanner(new File("airlines.txt"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		String lineFromFile;
		String[] names=null;
		List<AirLine> airlines=new ArrayList<>();
		while(airLineScanner.hasNext()) {			
			names=airLineScanner.nextLine().split(",");
			
			//names=lineFromFile.split(",");
			/*for(String a:names) {
				airlines.add(a);
			}*/
			
			AirLine newAirline=new AirLine(names);
			airlines.add(newAirline);
		}
		
		//System.out.println(airlines);
		
		//String[] participants;
		for(AirLine al:airlines) {
			System.out.println(al);
		}
		
	}

}
