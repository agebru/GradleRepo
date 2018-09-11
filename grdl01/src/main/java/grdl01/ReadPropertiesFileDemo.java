package grdl01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class ReadPropertiesFileDemo {
	

	public static void main(String[] args) throws FileNotFoundException{

		File file = new File("prop.properties");
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
			Properties props = System.getProperties();
			while (scanner.hasNextLine()) {

				String readLine = scanner.nextLine();
				if (!readLine.startsWith("#")) {

					if (readLine.contains("=")) {

						String[] split = readLine.split("=");
						if (split[0] != null && split[1] != null) {
							props.setProperty(split[0], split[1]);
						}
					}

				}

				System.setProperties(props);
			}

		} catch (FileNotFoundException ex) {
			throw new RuntimeException(" Trouble Reading prop.properties during start up ");
		} finally {
			scanner.close();
		}

		// calling the HashMap
		System.out.println("\n Printing prob.properties file into A map\n====================================\n");
			HashMap<String, String> propertiesInMap = getPropertiesInMap();
			System.out.println(propertiesInMap);
		
		
		
		
		
		//calling getAirlinesInMap	
			
			System.out.println("\n Printing Airline.txt into A map\n==================================\n");			
		Map<String, List<String>> airlinesInMap=getAirlinesInMap();
		System.out.println("====> "+airlinesInMap+"\n");
		
		Set<String> stringKey=airlinesInMap.keySet();
		for(String key:stringKey) {
			System.out.println(key+"==>"+airlinesInMap.get(key));
		}
		

	}
	
	
	

	// readig the prop.properties file and inserting the key value pairs in hashMap
	public static HashMap<String, String> getPropertiesInMap() throws FileNotFoundException {
		HashMap<String, String> map = new HashMap<>();
		File file = new File("prop.properties");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String nextLine = sc.nextLine();
			if (!nextLine.startsWith("#")) {
				String[] split = nextLine.split("=");
				map.put(split[0], split[1]);
			}

		}

		return map;
	}

	// read the airline .txt file and put the values in map:
	// the firt value of each line as key and the next as participant flight values

	public static Map<String, List<String>> getAirlinesInMap() throws FileNotFoundException {
		Map<String, List<String>> map = new HashMap<>();
		List<String> participants =null;
		File file = new File("airlines.txt");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String nextLine = sc.nextLine();
			participants = new ArrayList<>();
			if (nextLine != null) {
				String[] split = nextLine.split(","); // all the values in single line separeted by commas
				for (int i = 1; i < split.length; i++) {
					participants.add(split[i]);
				}

				map.put(split[0], participants);

			}
		}

		return map;
	}

}
