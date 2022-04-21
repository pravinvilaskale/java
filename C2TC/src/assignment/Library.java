package assignment;

public class Library {
	int acc_num;
	String  Title;
	String Author;
	
	public void input()
	{
		acc_num = 10;
		Title = "Book_Title";
		Author = "Book_Author";
	}
	public void compute()
	{
		int days = 2;
		int fine = days*5;
		System.out.println("Your fine is "+fine);
	}
	public void display()
	{
		System.out.print("Accession Number = "+acc_num+"\tTitle = "+Title+"\tAuthor = "+Author);
	}

	public static void main(String[] args) {
		Library obj = new Library();
		obj.input();
		obj.compute();
		obj.display();
	}

}
