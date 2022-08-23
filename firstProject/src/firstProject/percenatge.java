package firstProject;
import java.util.Scanner;

public class percenatge {
	

		public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("enter first marks");
		 float a = sca.nextFloat();
		 System.out.println("enter second marks");
		 float b = sca.nextFloat();
		 System.out.println("enter third marks");
		 float c = sca.nextFloat();
		 float perc = ((a+b+c)/300 )*100;
		 System.out.println(perc);

	}

}
