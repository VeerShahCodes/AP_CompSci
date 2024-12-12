/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        greeting("Veer");
        printAnimal();
        double salary = raise(200000, 5);
        System.out.println(salary);
        salary = raise(salary, 5);
        System.out.println(salary);
        salary = raise(salary, 5);
        System.out.println(salary);
	}
	
	public static void greeting(String name) {
	    System.out.println("Hello, " + name);
	}
	
	public static void printAnimal() {
	    System.out.println("  __.------~~~-.");
	    System.out.println(",'/             `\\");
	    System.out.println(" \\  ,..__ | ,_   `\\_,");
	    System.out.println("   >/|/   ~~\\||`\\(`~,~'");
	    System.out.println("   | `\\     /'|   \\_");
	}
	
	public static double raise(double salary, int percent) {
	    return salary + (salary * (percent / 100.0));
	}
	
	
}