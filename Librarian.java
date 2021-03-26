import java.time.LocalDate;
import java.util.*;
public class Librarian {
	 static Scanner as = new Scanner(System.in);
	static LocalDate date = LocalDate.now();
	static LocalDate issuedate = date;
	static List alist = new ArrayList();
	static void AddBook() {
		List alist = new ArrayList();
		System.out.println("Enter the BookID, name and  Author");
		int BID = as.nextInt();
		String BName = as.next();
		String BAuthor = as.next();
		alist.add(BID);
		alist.add(BName);
		alist.add(BAuthor);
		System.out.println(alist);
		System.out.println("Enter the position & value");
		int pos =as.nextInt();
		int val = as.nextInt();
		alist.set(pos,val);
		
	} 
 static void IssueBook() {
		System.out.println("Enter the Book ID");
		int BID = as.nextInt();
		Random rand =  new Random();
		System.out.println("Students Enter ur UserID, Password");
		as.nextLine();
		String userID = as.nextLine();
		System.out.println("Enter password");
		String Password = as.nextLine();
		StudentIDCheck(userID , Password);
		int IID = rand.nextInt(10000);
		System.out.println("Issue Date :"+ issuedate);
		LocalDate returnDate = date.plusDays(10);
		System.out.println("The book returned within "+ returnDate+" "+ "this date");
		
	}
static void ReturnBook() {
		System.out.println(issuedate);
		LocalDate returndate = date.plusDays(10);
		System.out.println(returndate);
		LocalDate today = date.now();
		System.out.println(today);
		if(returndate.isBefore(today)) {
			System.out.println("You return the Book before return date ends");
		}
		else if(returndate.isAfter(today)) {
			System.out.println("You return the book after return date ends");
			System.out.println("You have penalty to pay");
		}
	}
	
static void StudentIDCheck(String A,String b) {
		if(A.equals("KCT")) {
			if(b.equals("kctlib")) {
				System.out.println("you are member of library");
			}
			else {
				System.out.println("your password is Wrong");
			}
		}
		else {
			System.out.println("you have to create Library ID to lend this book");
			StudentUserCreation();
		}
	}
	static void StudentUserCreation() {
		System.out.println("Enter your Name");
		int SId = as.nextInt();
		as.nextLine();
		String Sname = as.nextLine();
		System.out.println(SId+" "+Sname);
		System.out.println("Your UserID = KCT");
		System.out.println("Your Password = kctlib");
		IssueBook();
			
	}
	static void IsBookAvailable() {
		String a = as.nextLine();
		if(alist.contains(a)) {
			System.out.println("Book is Availble in the Library");
		}
		else System.out.println("Book is Not Available in the Library");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Library Management System!");
		System.out.println("Enter ur username and password ");
		System.out.println("username : ");
		String AccessName = as.nextLine();
		if(AccessName.equalsIgnoreCase("Librarian"))
		{
			System.out.println("You have access");
		}
		else
		{
			System.out.println("You do not have access");
		}
		
		String password = "Qwerty";
		System.out.println("Enter password: ");
		String Password;
		int n=3;
		while(n>0) {
			 Password = as.nextLine();
			if(Password.equals(password)) {
				System.out.println("Successfully logged IN");
				break;
			}
			else {
				System.out.println(" Wrong password:");
				int m=n-1;
				System.out.println("You have only" +" "+ m +" "+"attempts");
				System.out.println("Re-Enter the Password");
			}
			n--;
		}
		System.out.println("Enter 1 to Add Book");
		System.out.println("Enter 2 to Issue Book");
		System.out.println("Enter 3 to Return Book");
		System.out.println("Enter 4 to check Student ID");
		System.out.println("Enter 5 to check Book ");
		int choice = as.nextInt();
		do {
			switch (choice) {
			case 1:
				AddBook();
				System.out.println(alist);
				break;
			case 2:
				IssueBook();
				break;
			case 3:
				ReturnBook();
				break;
			case 4:

				break;
			case 5:
				StudentUserCreation();
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Invalid input");
				break;
			}
			choice = as.nextInt();
		} while (choice > 0 && choice < 6);
	}

	}


