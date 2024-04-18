package javasessions;

public class DataTypes {

	public static void main(String[] args) {

		//java: strict data type concept
		//data types:
		//1. primitive data types: 
			//no need to create object and class
		
		//2. non primitive data types: String, Class, Interfaces, Arrays, Object
		
		
		//primitive data types:
		//boolean type: true/false
		//Numeric Type:
				//Integral value:
					//1. Integer: byte, short, int, long
					//2. floating-point: float, double
				//character type: char
		
		
		//1. byte:
		//size: 1 byte = 8 bits
		//range: -128 to 127 --> -2^7 to 2^7-1
		byte b = 10;
		 b = 20;
		 b = 30;
		 byte b1 = 40;
		 byte b2 = -30;
		 byte b3 = -128;
		 byte b4 = 0;
		 byte age = 30;
		 //age, months, week
		 
		 System.out.println(b);
		 
		 //2. short:
		 //size: 2 bytes = 2x8 = 16 bits
		 //range: -32768 to 32767 --> -2^15 to 2^15-1
		 short s1 = 1000;
		 short s2 = 1;
		 System.out.println(s1+s2);
		
		//3. int:
		 //size: 4 bytes = 4x8 = 32 bits
		 //range: -2147483648 to 2147483647 --> -2^31 to 2^31-1
		 int i = 10;
		 //bill amount, price, salary
		 
		 //4. long:
		 //size: 8 bytes = 8x8 = 64 bits
		 //range: -2^63 to 2^63-1
		 
		 long l = 100029292;
		 long l1 = 9898555558L;
		 System.out.println(l1);
		 //world population, distance, medical ranges
		 
		 //string is the right data type:
		 long phone = 9876543212L;
		 long ssn = 987687654L;
		 long debit = 98765444443l;
		 
		 String telphone = "121212121";
		 
		 
		 
		 //5. float:
		 //size: 4 bytes = 32 bits
		 //range: after . can take upto 7 digits
		 float f1 = 54.987654f;
		 System.out.println(f1);
		 
		 float f2 = (float)45.66;
		 System.out.println(f2);
		 
		 float f3 = 100;
		 System.out.println(f3);
		 
		 //6. double:
		//size: 8 bytes = 64 bits
		 //range: after . can take upto 15 digits
		 double d1 = 12.3333d;
		 double buildNumber = 1.1;//not recommended
		 System.out.println(buildNumber + 1.0);
		 
		 //price, temp, weight, tax
		 //190.34.55.66
		 
		 
		 //7. char type: only single digit value
		 //range: a-z and A-Z
		 //size: 2 bytes = 16 bits
		 //a-z: 97 to 122
		 //A-Z: 65 to 90
		 //0-9: 48 to 57
		 char c = 'a';
		 char c1 = '1'; //0-9
		 char c2 = '$';
		 
		 char n1 = 'a';
		 char n2 = 'b';
		 System.out.println(n1);//a
		 System.out.println(n2);//b
		 System.out.println(n1+n2);//97+98=195
		 System.out.println(n1-n2);//97-98=-1
		 
		 //unicode ---> ASCII values 
		 System.out.println('1' + '2');//49+50=99
		 System.out.println('1');//1
		 System.out.println(1);//1
		 
		 System.out.println(c);
		 System.out.println((byte)c);//97
		 System.out.println((byte)'$');
		 
		 System.out.println(100 + 'a');
		 System.out.println('a'+'b');//97+98=195
		 System.out.println('a'+""+'b');//"a"+b= ab
		 System.out.println(n1);//a
		
		 //boolean: true/false
		 //size: ~ 1 bit
		 //range: no range
		 boolean flag = true;
		 boolean pop = false;
		 boolean isUserActive = true;
		 		 
		 int k;
		  k = 100;
		 System.out.println(k);
		 
		 String pc = "12%";
		 float pec1 = 12.33f;
		 
		 
		 byte tt = 'a';
		 System.out.println(tt);
		 
		 long g = 1000000999;
		 float gf = g;
		 System.out.println(gf);
		 
		 int kk = 200;
		 byte lk = (byte)kk;
		 System.out.println(lk);
		 
		 double yy = 12.33d;
		 int pp = (int)yy;
		 System.out.println(pp);
		 
		 
		 int x = 5;
		 int y = x++ + --x + x++; 
		 
		 
		 System.out.println(x);
		 System.out.println(y);
		
	}

}
