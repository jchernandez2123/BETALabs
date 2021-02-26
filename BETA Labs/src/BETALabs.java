
public class BETALabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a variable to hold the quantity of available plane seats left on a flight
int availablePlaneSeats = 6;//full numbers 	

//create a variable to hold the cost of groceries at checkout
double costOfGroceries = 23.64;//numbers with decimal points

//create a variable to hold a person's middle initial
char middleInitial = 'G';// 1 character a single character single quotes '' double quotes wont work""

//create a variable to hold true if it's hot outside and false if its cold outside
boolean isHotOutside = false;// boolean are used to make something true or false
boolean itsColdOutside = true; // there is no quotes on the booleans because they are true keys words in java and they hold their own values

//create a variable to hold a customer's first name
String customersFirstName = "Sally";//this is textual data alpha numeric data its more than one character

//create a variable to hold a street address
String streetAddress= "1234 W Easy St ";// multiple characters in quotes

//Print all variables to the console
System.out.println("Available seats left on the plane:" + availablePlaneSeats);
System.out.println(costOfGroceries + " is the price for groceries");
System.out.println("The person's middle initial is " + middleInitial);
System.out.println("It is hot outside - " + isHotOutside);
System.out.println("It is cold outside - " + itsColdOutside);
System.out.println("The customer's first name is " + customersFirstName);
System.out.println(streetAddress + " is where the person lives.");

//a customer booked 2 plane seats, remove 2 seats from the available seats variable
availablePlaneSeats = availablePlaneSeats -2;
availablePlaneSeats -= 2;//this is short hand for set availablePlaneSeats to its current value minus 2 or subtract 2 from available
System.out.println(availablePlaneSeats);
//System.out.println(availablePlaneSeats- 2 + " available plane seats"); this is the harder way to write this out


//impulse candy bar purchase , add 2.15 to the grocery total
//costOfGroceries = costOfGroceries + 2.15; another way to write it

costOfGroceries += 2.15;// another example on how it could be written "this is the short hand version"
System.out.println(costOfGroceries);

//birth certificate was printed incorrectly, change the middle initial to something else

middleInitial = 'C';//make sure to do single quotes
System.out.println(middleInitial);

// the season has changed, update the hot outside variable to be opposite of what it was
isHotOutside = !isHotOutside;// the "!" reverses any boolean value so if it was false it would make it true
//isHotOutside = true; another way to write it
System.out.println(isHotOutside);


//create a new variable called full name using the customers first name, the middle initial, and a last name of your choice

String fullName = customersFirstName + " " + middleInitial + "" + " Sue ";// this way is faster less code
//String lastName = " Sue"; it is a longer process you could add it ^^ up there has lastName


//print a line to the console that introduces the customer and says they live at the address variable given earlier
System.out.println("Hi my name is " + fullName + "And I live at " + streetAddress + ".");// you dont have to create a variable use the ones already created


	}

}
