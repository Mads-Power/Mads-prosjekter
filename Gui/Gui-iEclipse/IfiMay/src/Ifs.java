import java.util.Scanner;
public class Ifs {

	
	public static void main(String[] args) {
		
		/*int number = 11;
		
		if(number < 10){
			System.out.println("The number was greater than 10");
		}else{
			System.out.println("The number was less than 10");
		}*/
		
		//positive elle ikke positive tall
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Type a number: ");
		
		int a = Integer.parseInt(sc.nextLine());
		if (a < 0){
			System.out.println("The number is not positive");
		}else{
			System.out.println("The number is positive");
		}*/
		
		//age og majority?
		
		/*Scanner sc = new Scanner(System.in);
		System.out.print("How old are you?");
		int a = Integer.parseInt(sc.nextLine());
		if(a <= 18){
			System.out.println("You have not reached the age of majority yet!");
		}else{
			System.out.println("You have reached the age of majority!");
		}*/
			
		//if else + equals
		/*String text = "course";
		if(text.equals("marzipan")){
			System.out.println("The variable text contains the text marzipan");
			}else{
				System.out.println("The variable text does not contain the text marzipan");
			}*/
		//Greater number + equals
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Type the first number: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("Type in second number: ");
		int b = Integer.parseInt(sc.nextLine());
		
		
		if(a > b){
			System.out.println("Greater number: "  + a);
		}else if(a == b){
			System.out.println("The numbers are equal!");
			}else {
			System.out.println("Greater number: " + b);
		}
		
		
		
		
		
	}

}
