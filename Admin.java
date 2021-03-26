import java.util.ArrayList;
import java.util.Scanner;

public class Admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Library Management System!");
		Scanner as = new Scanner(System.in);
		System.out.println("username : ");
		String AccessName = as.nextLine();
		if(AccessName.equalsIgnoreCase("Admin"))
		{
			System.out.println("You have access");
		}
		else
		{
			System.out.println("You do not have access");
		}
		//password
		String password = "Qazxsw";
		System.out.println("Enter password: ");
		String Password;
		int n=3;
		while(n>0) {
			 Password = as.nextLine();
			if(Password.equals(password)) {
				System.out.println(" Successfully logged IN");
				break;
			}
			else {
				System.out.println(" Wrong password:");
				int m=n-1;
				System.out.println("You have only" +" "+ m +" "+"attempts");
				
			}
			n--;
		}
		
		ArrayList alist = new ArrayList();
		System.out.println("Enter Librarian ID: ");
		int x = as.nextInt();
		alist.add(x);
		System.out.println("Enter Librarian Name: ");
		as.nextLine();
		String lname = as.nextLine();
		alist.add(lname);
		System.out.println("Librarian Age: ");
		int age = as.nextInt();
		alist.add(age);
		System.out.println("Librarian Experience: ");
		int expe = as.nextInt();
		alist.add(expe);
		System.out.println(alist);
		System.out.println("updatation");
		System.out.println("Index position need to be update: ");
		int a = as.nextInt();
		System.out.println("update need to be done: ");
		int ab = as.nextInt();
		alist.set(a, ab);
		System.out.println(alist);
		System.out.println("delete");
		System.out.println("Enter the delete number in a list");
		int n1 = as.nextInt();
		alist.remove(n1);
		System.out.println(alist);

	}

}


