package it.enterprise.foundation.DemoJacksonLibrary;

import java.util.logging.Logger;

public class Car {
	
	private static Logger log = Logger.getLogger(Car.class.getSimpleName());
	
	private String brand = null;
	private int doors = 0;

	public Car() {
		super();
		log.info("constructor Car() - START");
		log.info("constructor Car() - END");
	}
	
	public String getBrand() {
		log.info("method getBrand() - START");
		String brand = this.brand;
		log.info("method getBrand() - RETURNED: this.brand = " + brand);
		log.info("method getBrand() - END");		
		return brand;
	}

	public void setBrand(String brand) {
		log.info("method setBrand(String brand) - START");
		log.info("method setBrand(String brand) - PARAM: \n\n\t{\n\t  brand: " + brand + "\n\t}\n\n");
		this.brand = brand;
		log.info("method setBrand(String brand) - DEBUG: \n\nitem: {\n\t  this.brand: " + this.brand + "\n\t}\n\n:");
		log.info("method setBrand(String brand) - RETURNED:this.brand = " + brand);
		log.info("method setBrand(String brand) - END");
		this.brand = brand;
	}

	public int getDoors() {
		log.info("method getDoors() - START");
		int doors = this.doors;
		log.info("method getDoors() - RETURNED: this.doors = " + doors );
		log.info("method getDoors() - END");	
		return doors;
	}

	public void setDoors(int doors) {
		log.info("method setDoors(int doors) - START");
		log.info("method setDoors(int doors) - PARAM: \n\n\t{\n\t  doors: " + doors + "\n\t}\n\n");
		this.doors = doors;
		log.info("method setDoors(int doors) - DEBUG: \n\nitem: {\n\t  this.doors: " + this.doors + "\n\t}\n\n:");
		log.info("method setDoors(int doors) - RETURNED:this.brand = " + brand);
		log.info("method setDoors(int doors) - END");
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", doors=" + doors + "]";
	}
}