package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();//overridden
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//individual
		b.engine();//inherited
		b.billing();//overridden
		
		System.out.println(b.maxSpeed);
		
		Car.carDisplay();
		BMW.carDisplay();
		
		System.out.println(Car.price);
		System.out.println(BMW.price);
		
		//final var and method:
		b.RunFourWheels();
		System.out.println(b.minSpeed);
		
		Car.loadCar();
		BMW.loadCar();
		
		b.showCar();
		
		System.out.println("--------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();//inherited
		
		
		
		System.out.println("--------");
		Audi au = new Audi();
		au.start();//inherited
		au.stop();//inherited
		au.refuel();//inherited
		au.theftSafety();//individual
		au.engine();//overridden
		au.billing();
		System.out.println(au.maxSpeed);
		
		
		System.out.println("--------");
		Truck tr = new Truck();
		tr.engine();//inherited
		tr.heavyLoading();//individual
		
		System.out.println("--------");

		
		Honda h = new Honda();
		h.stop();
		h.refuel();
		h.start();
		h.fuelEff();
		h.parking();
		
		System.out.println("--------");

		Car c1 = new Car();
		c1.start();
		c1.stop();
		c1.refuel();
		
		System.out.println("--------");

		//child class object can be referred by parent class ref variable
		//Top/Up Casting
		Car cr = new Honda();//IS-A relationship
		cr.start();//overridden
		cr.stop();//inherited
		cr.refuel();//inherited
		
		
		//child class object can be referred by grand parent class ref variable
		Vehicle v1 = new Honda();
		v1.engine();
		v1.billing();
		
		Vehicle v2 = new BMW();
		v2.start();

		
		//parent class object can be referred by child class ref variable?
		//down casting : ClassCastException
		Honda h1 = (Honda) new Car();
		
		Honda h2 = (Honda)new Vehicle();
		
		//
		//Honda h3 = (Honda) new BMW();
		
		Car c4 = new BMW();
		
		
	}

}
