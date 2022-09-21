package core_java_project;

import java.util.Scanner;

class Vehicle
{
	//Encapulsation
	private String name;
	private int price;
	private String carType;
	private String colour;
	private String model;
	private String engine;
	private int mileage;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", price=" + price + ", carType=" + carType + ", colour=" + colour + ", model="
				+ model + ", engine=" + engine + ", mileage=" + mileage + "]";
	}
	
	
}

class TwoWheeler extends Vehicle
{
	public void settwowheeler(String carType)
	{
		this.setCarType(carType);
	}
}

class HondaActiva extends TwoWheeler
{
	public void setHondaActiva(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}

class HeroSplendor extends TwoWheeler
{
	public void setHeroSplendor(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}

class HeroHFDeluxe extends TwoWheeler
{
	public void setHeroHFDeluxe(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}

class BajajPulsar extends TwoWheeler
{
	public void setBajajPulsar(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}

class TVSXL100 extends TwoWheeler
{
	public void setTVSXL100(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}

class HondaCBShine extends TwoWheeler
{
	public void setHondaCBShine(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}

class SuzukiAccess125 extends TwoWheeler
{
	public void setSuzukiAccess125(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}

class RoyalEnfieldClassic350 extends TwoWheeler
{
	public void setRoyalEnfieldClassic350(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}

class HeroGlamour extends TwoWheeler
{
	public void setHeroGlamour(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}

class HeroPassion extends TwoWheeler
{
	public void setHeroPassion(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}

//Three Wheeler
class ThreeWheeler extends Vehicle
{
	public void setthreewheeler(String str)
	{
		this.setCarType(str);
	}
}

class Auto extends ThreeWheeler
{
	public void setAuto(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}

class Tumtum extends ThreeWheeler
{
	public void setTumtum(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}

class FourWheeler extends Vehicle
{
	public void setfourwheeler(String str)
	{
		this.setCarType(str);
	}
}

class MarutiAltoK10 extends FourWheeler
{
	public void setMarutiAltoK10(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}
class MarutiAlto800 extends FourWheeler
{
	public void setMarutiAlto800(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}
class MarutiBrezza extends FourWheeler
{
	public void setMarutiBrezza(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}
class MahindraBolero extends FourWheeler
{
	public void setMahindraBolero(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}
class MahindraThar extends FourWheeler
{
	public void setMahindraThar(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}
class MahindraXUV700 extends FourWheeler
{
	public void setMahindraXUV700(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}
class HyundaiCreta extends FourWheeler
{
	public void setHyundaiCreta(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}
class MahidraScorpioN extends FourWheeler
{
	public void setMahidraScorpioN(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}
class ToyotaFortuner extends FourWheeler
{
	public void setToyotaFortuner(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}
class TataHarrier extends FourWheeler
{
	public void setTataHarrier(String model,String engine,String colour,int mileage,String name,int price)
	{
		this.setModel(model);
		this.setEngine(engine);
		this.setColour(colour);
		this.setMileage(mileage);
		this.setPrice(price);
		this.setName(name);
	}
}

class InvalidInput extends Throwable
{
}

public class Project {

	public static void getFourWheeler(int selected) throws InvalidInput
	{
		if(selected==1) 
		{
			MarutiAltoK10 ref = new MarutiAltoK10();
			ref.setfourwheeler("Two Wheeler");
			System.out.println("1.Red");
			System.out.println("2.Blue");
			System.out.println("3.Black");
			System.out.println("4.White");
			Scanner scan = new Scanner(System.in);
			int Color = scan.nextInt();
			if(Color==1)
			{
			ref.setMarutiAltoK10("Maruti Alto K10","Diseal","Red",25,"Maruti Alto K10",500000);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==2)
			{
				ref.setMarutiAltoK10("Maruti Alto K10","Diseal","Blue",25,"Maruti Alto K10",500000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==3)
			{
				ref.setMarutiAltoK10("Maruti Alto K10","Black","Red",25,"Maruti Alto K10",500000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==4)
			{
				ref.setMarutiAltoK10("Maruti Alto K10","Diseal","White",25,"Maruti Alto K10",500000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}	
			else 
			{
				throw new InvalidInput();
			}
		}
		else if(selected==2) 
		{
			MarutiAlto800 ref = new MarutiAlto800();
			ref.setfourwheeler("Two Wheeler");
			System.out.println("1.Red");
			System.out.println("2.Blue");
			System.out.println("3.Black");
			System.out.println("4.White");
			Scanner scan = new Scanner(System.in);
			int Color = scan.nextInt();
			if(Color==1)
			{
			ref.setMarutiAlto800("Maruti Alto 800","Diseal","Red",25,"Maruti Alto 800",500000);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==2)
			{
				ref.setMarutiAlto800("Maruti Alto 800","Diseal","Blue",25,"Maruti Alto 800",500000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==3)
			{
				ref.setMarutiAlto800("Maruti Alto 800","Black","Red",25,"Maruti Alto 800",500000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==4)
			{
				ref.setMarutiAlto800("Maruti Alto 800","Diseal","White",25,"Maruti Alto 800",500000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}	
			else 
			{
				throw new InvalidInput();
			}
		}
		else if(selected==3) 
		{
			MarutiBrezza ref = new MarutiBrezza();
			ref.setfourwheeler("Two Wheeler");
			System.out.println("1.Red");
			System.out.println("2.Blue");
			System.out.println("3.Black");
			System.out.println("4.White");
			Scanner scan = new Scanner(System.in);
			int Color = scan.nextInt();
			if(Color==1)
			{
			ref.setMarutiBrezza("Maruti Brezza","Diseal","Red",25,"Maruti Brezza",1000000);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==2)
			{
				ref.setMarutiBrezza("Maruti Brezza","Diseal","Blue",25,"Maruti Brezza",1000000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==3)
			{
				ref.setMarutiBrezza("Maruti Brezza","Black","Red",25,"Maruti Brezza",1000000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==4)
			{
				ref.setMarutiBrezza("Maruti Brezza","Diseal","White",25,"Maruti Brezza",1000000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}	
			else 
			{
				throw new InvalidInput();
			}
		}
		else if(selected==4){
			MahindraBolero ref = new MahindraBolero();
			ref.setfourwheeler("Two Wheeler");
			System.out.println("1.Red");
			System.out.println("2.Blue");
			System.out.println("3.Black");
			System.out.println("4.White");
			Scanner scan = new Scanner(System.in);
			int Color = scan.nextInt();
			if(Color==1)
			{
			ref.setMahindraBolero("Mahindra Bolero","Diseal","Red",25,"Mahindra Bolero",1000000);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==2)
			{
				ref.setMahindraBolero("Mahindra Bolero","Diseal","Blue",25,"Mahindra Bolero",1000000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==3)
			{
				ref.setMahindraBolero("Mahindra Bolero","Black","Red",25,"Mahindra Bolero",1000000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==4)
			{
				ref.setMahindraBolero("Mahindra Bolero","Diseal","White",25,"Mahindra Bolero",1000000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}	
			else 
			{
				throw new InvalidInput();
			}
		}
		else if(selected==5){
			MahindraThar ref = new MahindraThar();
			ref.setfourwheeler("Two Wheeler");
			System.out.println("1.Red");
			System.out.println("2.Blue");
			System.out.println("3.Black");
			System.out.println("4.White");
			Scanner scan = new Scanner(System.in);
			int Color = scan.nextInt();
			if(Color==1)
			{
			ref.setMahindraThar("Mahindra Thar","Diseal","Red",25,"Mahindra Thar",1500000);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==2)
			{
				ref.setMahindraThar("Mahindra Thar","Diseal","Blue",25,"Mahindra Thar",1500000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==3)
			{
				ref.setMahindraThar("Mahindra Thar","Black","Red",25,"Mahindra Thar",1500000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==4)
			{
				ref.setMahindraThar("Mahindra Thar","Diseal","White",25,"Mahindra Thar",1500000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}	
			else 
			{
				throw new InvalidInput();
			}
		}
		else if(selected==6){
			MahindraXUV700 ref = new MahindraXUV700();
			ref.setfourwheeler("Two Wheeler");
			System.out.println("1.Red");
			System.out.println("2.Blue");
			System.out.println("3.Black");
			System.out.println("4.White");
			Scanner scan = new Scanner(System.in);
			int Color = scan.nextInt();
			if(Color==1)
			{
			ref.setMahindraXUV700("Mahindra XUV700","Diseal","Red",25,"Mahindra XUV700",1500000);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==2)
			{
				ref.setMahindraXUV700("Mahindra XUV700","Diseal","Blue",25,"Mahindra XUV700",1500000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==3)
			{
				ref.setMahindraXUV700("Mahindra XUV700","Black","Red",25,"Mahindra XUV700",1500000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==4)
			{
				ref.setMahindraXUV700("Mahindra XUV700","Diseal","White",25,"Mahindra XUV700",1500000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}	
			else 
			{
				throw new InvalidInput();
			}
		}
		else if(selected==7){
			HyundaiCreta ref = new HyundaiCreta();
			ref.setfourwheeler("Two Wheeler");
			System.out.println("1.Red");
			System.out.println("2.Blue");
			System.out.println("3.Black");
			System.out.println("4.White");
			Scanner scan = new Scanner(System.in);
			int Color = scan.nextInt();
			if(Color==1)
			{
			ref.setHyundaiCreta("HyundaiCreta","Diseal","Red",25,"HyundaiCreta",2000000);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==2)
			{
				ref.setHyundaiCreta("Hyundai Creta","Diseal","Blue",25,"Hyundai Creta",2000000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==3)
			{
				ref.setHyundaiCreta("Hyundai Creta","Black","Red",25,"Hyundai Creta",2000000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==4)
			{
				ref.setHyundaiCreta("Hyundai Creta","Diseal","White",25,"Hyundai Creta",2000000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}	
			else 
			{
				throw new InvalidInput();
			}
		}
		else if(selected==8){
			MahidraScorpioN ref = new MahidraScorpioN();
			ref.setfourwheeler("Two Wheeler");
			System.out.println("1.Red");
			System.out.println("2.Blue");
			System.out.println("3.Black");
			System.out.println("4.White");
			Scanner scan = new Scanner(System.in);
			int Color = scan.nextInt();
			if(Color==1)
			{
			ref.setMahidraScorpioN("Mahidra Scorpio N","Diseal","Red",25,"Mahidra Scorpio N",2000000);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==2)
			{
				ref.setMahidraScorpioN("Mahidra Scorpio N","Diseal","Blue",25,"Mahidra Scorpio N",2000000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==3)
			{
				ref.setMahidraScorpioN("Mahidra Scorpio N","Black","Red",25,"Mahidra Scorpio N",2000000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==4)
			{
				ref.setMahidraScorpioN("Mahidra Scorpio N","Diseal","White",25,"Mahidra Scorpio N",500000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}	
			else 
			{
				throw new InvalidInput();
			}
		}
		else if(selected==9){
			ToyotaFortuner ref = new ToyotaFortuner();
			ref.setfourwheeler("Two Wheeler");
			System.out.println("1.Red");
			System.out.println("2.Blue");
			System.out.println("3.Black");
			System.out.println("4.White");
			Scanner scan = new Scanner(System.in);
			int Color = scan.nextInt();
			if(Color==1)
			{
			ref.setToyotaFortuner("Toyota Fortuner","Diseal","Red",25,"Toyota Fortuner",2500000);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==2)
			{
				ref.setToyotaFortuner("Toyota Fortuner","Diseal","Blue",25,"Toyota Fortuner",2500000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==3)
			{
				ref.setToyotaFortuner("Toyota Fortuner","Black","Red",25,"Toyota Fortuner",2500000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==4)
			{
				ref.setToyotaFortuner("Toyota Fortuner","Diseal","White",25,"Toyota Fortuner",2500000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}	
			else 
			{
				throw new InvalidInput();
			}
		}
		else if(selected==10) 
		{
			TataHarrier ref = new TataHarrier();
			ref.setfourwheeler("Two Wheeler");
			System.out.println("1.Red");
			System.out.println("2.Blue");
			System.out.println("3.Black");
			System.out.println("4.White");
			Scanner scan = new Scanner(System.in);
			int Color = scan.nextInt();
			if(Color==1)
			{
			ref.setTataHarrier("Tata Harrier","Diseal","Red",25,"Tata Harrier",2500000);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==2)
			{
				ref.setTataHarrier("Tata Harrier","Diseal","Blue",25,"Tata Harrier",2500000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==3)
			{
				ref.setTataHarrier("Tata Harrier","Black","Red",25,"Tata Harrier",2500000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==4)
			{
				ref.setTataHarrier("Tata Harrier","Diseal","White",25,"Tata Harrier",2500000);
				System.out.println("Vehicle Type : "+ref.getCarType());
				System.out.println("Vehicle Colour : "+ref.getColour());
				System.out.println("Vehicle Engine : "+ref.getEngine());
				System.out.println("Vehicle Mileage : "+ref.getMileage());
				System.out.println("Vehicle Model : "+ref.getModel());
				System.out.println("Vehicle Name : "+ref.getName());
				System.out.println("Vehicle Price : "+ref.getPrice());
			}	
			else 
			{
				throw new InvalidInput();
			}
		}
		else 
		{
			throw new InvalidInput();
		}
		
	}
	
	public static void getThreeWheeler(int selected) throws InvalidInput 
	{
		if(selected==1) 
		{
			Auto ref = new Auto();
			ref.setthreewheeler("Three Wheeler");
			System.out.println("Choose Engine");
			System.out.println("1.Petrol");
			System.out.println("2.Gas");
			Scanner scan = new Scanner(System.in);
			int enginetype = scan.nextInt();
			String engine="";
			if(enginetype==1) 
			{ 
				engine = "Petrol";
			}
			else if(enginetype==2)
			{
				engine = "Gas";
			}
			else
			{
				throw new InvalidInput();
			}
			ref.setAuto("Auto",engine,"Black and Yellow",50,"Auto",150000);
		}
		if(selected==2) 
		{
			Tumtum ref = new Tumtum();
			ref.setthreewheeler("Three Wheeler");
			System.out.println("Choose Engine");
			System.out.println("1.Petrol");
			System.out.println("2.Gas");
			Scanner scan = new Scanner(System.in);
			int enginetype = scan.nextInt();
			String engine="";
			if(enginetype==1) 
			{
				engine = "Petrol";
			}
			else if(enginetype==2)
			{
				engine = "Gas";
			}
			else
			{
				throw new InvalidInput();
			}
			ref.setTumtum("Tumtum",engine,"Yellow",50,"Tumtum",250000);
		}
	}
	
	public static void getTwoWheeler(int selected) throws InvalidInput
	{
		if(selected==1) 
		{
			HondaActiva ref = new HondaActiva();
			ref.settwowheeler("Two Wheeler");
			System.out.println("1.Red");
			System.out.println("2.Blue");
			System.out.println("3.Black");
			System.out.println("4.White");
			Scanner scan = new Scanner(System.in);
			int Color = scan.nextInt();
			if(Color==1)
			{
			ref.setHondaActiva("Honda Activa","Petrol","Red",50,"Honda Activa",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==2)
			{
			ref.setHondaActiva("Honda Activa","Petrol","Blue",50,"Honda Activa",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==3)
			{
			ref.setHondaActiva("Honda Activa","Petrol","Black",50,"Honda Activa",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==4)
			{
			ref.setHondaActiva("Honda Activa","Petrol","White",50,"Honda Activa",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}	
			else 
			{
				throw new InvalidInput();
			}
		}
		else if(selected==2) 
		{
			HeroSplendor ref = new HeroSplendor();
			ref.settwowheeler("Two Wheeler");
			System.out.println("1.Red");
			System.out.println("2.Blue");
			System.out.println("3.Black");
			System.out.println("4.White");
			Scanner scan = new Scanner(System.in);
			int Color = scan.nextInt();
			if(Color==1)
			{
			ref.setHeroSplendor("Hero Splendor","Petrol","Red",50,"Hero Splendor",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==2)
			{
			ref.setHeroSplendor("Hero Splendor","Petrol","Blue",50,"Hero Splendor",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==3)
			{
			ref.setHeroSplendor("Hero Splendor","Petrol","Black",50,"Hero Splendor",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==4)
			{
			ref.setHeroSplendor("Hero Splendor","Petrol","White",50,"Hero Splendor",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			else 
			{
				throw new InvalidInput();
			}
		}
		else if(selected==3) 
		{
			HeroHFDeluxe ref = new HeroHFDeluxe();
			ref.settwowheeler("Two Wheeler");
			System.out.println("1.Red");
			System.out.println("2.Blue");
			System.out.println("3.Black");
			System.out.println("4.White");
			Scanner scan = new Scanner(System.in);
			int Color = scan.nextInt();
			if(Color==1)
			{
			ref.setHeroHFDeluxe("Hero HF Deluxe","Petrol","Red",50,"Hero HF Deluxe",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==2)
			{
			ref.setHeroHFDeluxe("Hero HF Deluxe","Petrol","Blue",50,"Hero HF Deluxe",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==3)
			{
			ref.setHeroHFDeluxe("Hero HF Deluxe","Petrol","Black",50,"Hero HF Deluxe",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==4)
			{
			ref.setHeroHFDeluxe("Hero HF Deluxe","Petrol","White",50,"Hero HF Deluxe",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			else 
			{
				throw new InvalidInput();
			}
		}
		else if(selected==4){
			BajajPulsar ref = new BajajPulsar();
			ref.settwowheeler("Two Wheeler");
			System.out.println("1.Red");
			System.out.println("2.Blue");
			System.out.println("3.Black");
			System.out.println("4.White");
			Scanner scan = new Scanner(System.in);
			int Color = scan.nextInt();
			if(Color==1)
			{
			ref.setBajajPulsar("Bajaj Pulsar","Petrol","Red",50,"Bajaj Pulsar",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==2)
			{
			ref.setBajajPulsar("Bajaj Pulsar","Petrol","Blue",50,"Bajaj Pulsar",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==3)
			{
			ref.setBajajPulsar("Bajaj Pulsar","Petrol","Black",50,"Bajaj Pulsar",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==4)
			{
			ref.setBajajPulsar("Bajaj Pulsar","Petrol","White",50,"Bajaj Pulsar",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			else 
			{
				throw new InvalidInput();
			}
		}
		else if(selected==5){
			TVSXL100 ref = new TVSXL100();
			ref.settwowheeler("Two Wheeler");
			System.out.println("1.Red");
			System.out.println("2.Blue");
			System.out.println("3.Black");
			System.out.println("4.White");
			Scanner scan = new Scanner(System.in);
			int Color = scan.nextInt();
			if(Color==1)
			{
			ref.setTVSXL100("TVS XL 100","Petrol","Red",50,"TVS XL 100",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==2)
			{
			ref.setTVSXL100("TVS XL 100","Petrol","Blue",50,"TVS XL 100",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==3)
			{
			ref.setTVSXL100("TVS XL 100","Petrol","Black",50,"TVS XL 100",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==4)
			{
			ref.setTVSXL100("TVS XL 100","Petrol","White",50,"TVS XL 100",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			else 
			{
				throw new InvalidInput();
			}
			
		}
		else if(selected==6){
			HondaCBShine ref = new HondaCBShine();
			ref.settwowheeler("Two Wheeler");
			System.out.println("1.Red");
			System.out.println("2.Blue");
			System.out.println("3.Black");
			System.out.println("4.White");
			Scanner scan = new Scanner(System.in);
			int Color = scan.nextInt();
			if(Color==1)
			{
			ref.setHondaCBShine("Honda CB Shine","Petrol","Red",50,"Honda CB Shine",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==2)
			{
			ref.setHondaCBShine("Honda CB Shine","Petrol","Blue",50,"Honda CB Shine",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==3)
			{
			ref.setHondaCBShine("Honda CB Shine","Petrol","Black",50,"Honda CB Shine",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==4)
			{
			ref.setHondaCBShine("Honda CB Shine","Petrol","White",50,"Honda CB Shine",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			else 
			{
				throw new InvalidInput();
			}
			
		}
		else if(selected==7){
			SuzukiAccess125 ref = new SuzukiAccess125();
			ref.settwowheeler("Two Wheeler");
			System.out.println("1.Red");
			System.out.println("2.Blue");
			System.out.println("3.Black");
			System.out.println("4.White");
			Scanner scan = new Scanner(System.in);
			int Color = scan.nextInt();
			if(Color==1)
			{
			ref.setSuzukiAccess125("Suzuki Access 125","Petrol","Red",50,"Suzuki Access 125",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==2)
			{
			ref.setSuzukiAccess125("Suzuki Access 125","Petrol","Blue",50,"Suzuki Access 125",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==3)
			{
			ref.setSuzukiAccess125("Suzuki Access 125","Petrol","Black",50,"Suzuki Access 125",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==4)
			{
			ref.setSuzukiAccess125("Suzuki Access 125","Petrol","White",50,"Suzuki Access 125",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			else 
			{
				throw new InvalidInput();
			}
			
		}
		else if(selected==8){
			RoyalEnfieldClassic350 ref = new RoyalEnfieldClassic350();
			ref.settwowheeler("Two Wheeler");
			System.out.println("1.Red");
			System.out.println("2.Blue");
			System.out.println("3.Black");
			System.out.println("4.White");
			Scanner scan = new Scanner(System.in);
			int Color = scan.nextInt();
			if(Color==1)
			{
			ref.setRoyalEnfieldClassic350("Royal Enfield Classic 350","Petrol","Red",50,"Royal Enfield Classic 350",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==2)
			{
			ref.setRoyalEnfieldClassic350("Royal Enfield Classic 350","Petrol","Blue",50,"Royal Enfield Classic 350",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==3)
			{
			ref.setRoyalEnfieldClassic350("Royal Enfield Classic 350","Petrol","Black",50,"Royal Enfield Classic 350",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}    
			if(Color==4)
			{
			ref.setRoyalEnfieldClassic350("Royal Enfield Classic 350","Petrol","White",50,"Royal Enfield Classic 350",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			else 
			{
				throw new InvalidInput();
			}
			
		}
		else if(selected==9){
			HeroGlamour ref = new HeroGlamour();
			ref.settwowheeler("Two Wheeler");
			System.out.println("1.Red");
			System.out.println("2.Blue");
			System.out.println("3.Black");
			System.out.println("4.White");
			Scanner scan = new Scanner(System.in);
			int Color = scan.nextInt();
			if(Color==1)
			{
			ref.setHeroGlamour("Hero Glamour","Petrol","Red",50,"Hero Glamour",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			else if(Color==2)
			{
			ref.setHeroGlamour("Hero Glamour","Petrol","Blue",50,"Hero Glamour",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==3)
			{
			ref.setHeroGlamour("Hero Glamour","Petrol","Black",50,"Hero Glamour",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==4)
			{
			ref.setHeroGlamour("Hero Glamour","Petrol","White",50,"Hero Glamour",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			else 
			{
				throw new InvalidInput();
			}
		}
		else if(selected==10) 
		{
			HeroPassion ref = new HeroPassion();
			ref.settwowheeler("Two Wheeler");
			System.out.println("1.Red");
			System.out.println("2.Blue");
			System.out.println("3.Black");
			System.out.println("4.White");
			Scanner scan = new Scanner(System.in);
			int Color = scan.nextInt();
			if(Color==1)
			{
			ref.setHeroPassion("Hero Passion","Petrol","Red",50,"Hero Passion",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==2)
			{
			ref.setHeroPassion("Hero Passion","Petrol","Blue",50,"Hero Passion",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==3)
			{
			ref.setHeroPassion("Hero Passion","Petrol","Black",50,"Hero Passion",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			if(Color==4)
			{
			ref.setHeroPassion("Hero Passion","Petrol","White",50,"Hero Passion",55934);
			System.out.println("Vehicle Type : "+ref.getCarType());
			System.out.println("Vehicle Colour : "+ref.getColour());
			System.out.println("Vehicle Engine : "+ref.getEngine());
			System.out.println("Vehicle Mileage : "+ref.getMileage());
			System.out.println("Vehicle Model : "+ref.getModel());
			System.out.println("Vehicle Name : "+ref.getName());
			System.out.println("Vehicle Price : "+ref.getPrice());
			}
			else 
			{
				throw new InvalidInput();
			}
			
		}
		else 
		{
			throw new InvalidInput();
		}
		
	}
	
	public static void main(String[] args) throws InvalidInput 
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Car Showroom");
		System.out.println("Choose your car");
		
		System.out.println("Which car type you want");
		System.out.println("1.Two Wheeler");
		System.out.println("2.Three Wheeler");
		System.out.println("3.Four Wheeler");
		
		int carType = scan.nextInt();
				
		//Switch case
		switch(carType) 
		{
			case 1:
					System.out.println("1.Honda Activa");
					System.out.println("2.Hero Splendor");
					System.out.println("3.Hero HF Deluxe");
					System.out.println("4.Bajaj Pulsar");
					System.out.println("5.TVS XL 100");
					System.out.println("6.Honda CB Shine");
					System.out.println("7.Suzuki Access 125");
					System.out.println("8.Royal Enfield Classic 350");
					System.out.println("9.Hero Glamour");
					System.out.println("10.Hero Passion");
					int a = scan.nextInt();
					getTwoWheeler(a);
					break;
			case 2:
					System.out.println("1.Auto");
					System.out.println("2.Tumtum");
					int b = scan.nextInt();
					getThreeWheeler(b);
					break;
			case 3:
				System.out.println("1.Maruti Alto K10");
				System.out.println("2.Maruti Alto 800");
				System.out.println("3.Maruti Brezza");
				System.out.println("4.Mahindra Bolero");
				System.out.println("5.Mahindra Thar");
				System.out.println("6.Mahidra XUV700");
				System.out.println("7.Hyundai Creta");
				System.out.println("8.Mahidra Scorpio-N");
				System.out.println("9.Toyota Fortuner");
				System.out.println("10.Tata Harrier");
				int c = scan.nextInt();
				getFourWheeler(c);
				break;
			default: throw new InvalidInput();
		}
	}
}