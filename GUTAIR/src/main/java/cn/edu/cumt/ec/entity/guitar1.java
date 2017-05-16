package cn.edu.cumt.ec.entity;

public class guitar1 {
 

		  private String serialNumber;
		  private double price;
		  GuitarSpec spec;

		  public guitar1(String serialNumber, double price, GuitarSpec spec) {
		    this.serialNumber = serialNumber;
		    this.price = price;
		    this.spec = spec;
		  }

		  public String getSerialNumber() {
		    return serialNumber;
		  }

		  public double getPrice() {
		    return price;
		  }

		  public void setPrice(float newPrice) {
		    this.price = newPrice;
		  }

		  public GuitarSpec getSpec() {
		    return spec;
		  }
	}