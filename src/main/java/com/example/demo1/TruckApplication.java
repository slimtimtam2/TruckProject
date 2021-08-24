package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TruckApplication {

	public static void main(String[] args) {
		SpringApplication.run(TruckApplication.class, args);
	}
//public static void main(String[] args) throws IOException {
//	// open file input stream
//	BufferedReader reader = new BufferedReader(new FileReader(
//			"src/main/java/com/example/demo1/Mobile_Food_Facility_Permit.csv"));
//
//	// read file line by line
//	String line = null;
//	Scanner scanner = null;
//	int index = 1;
//	List<Truck> truckList = new ArrayList<>();
//
//	while ((line = reader.readLine()) != null) {
//		Truck foodTruck = new Truck();
//		scanner = new Scanner(line);
//		scanner.useDelimiter(",");
//		String[] elem = line.split(",");
//		foodTruck.setLocationId(elem[0]);
//		foodTruck.setApplicant(elem[1]);
//		foodTruck.setFacilityType(elem[2]);
//		foodTruck.setAddress(elem[5]);
//		foodTruck.setBlocklot(elem[6]);
//		foodTruck.setBlock(elem[7]);
//		foodTruck.setLot(elem[8]);
////		foodTruck.setZipCodes(elem[27]);
//		truckList.add(foodTruck);
//	}
//
//	//close reader
//	reader.close();
//
//	System.out.println(truckList);
//
//}


}
