package JavaProgram1;

import java.util.List;
import java.util.Scanner;
import java.util.*;
public class BookStore {
	
	//Let's start.....
	public String title;
	public String author;
	public int isbn;
	public double price;
	public double discount;
	public double total;
	
	public BookStore() {
		
	}
	public BookStore(String title, String author, int isbn, double price, double discount, double total) {
		super();
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		this.price=price;
		this.discount=discount;
		this.total=total;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getIsbn() {
		return isbn;
	}
	public double getPrice() {
		return price;
	}
	public double getDiscount() {
		return discount;
	}
	public double getTotal() {
		return total;
	}
   public class Books{
	   
   }
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
			double amount=0.0;
			double sum=0.0;
			int count=1;
			List list = new ArrayList();
			Scanner sc = new Scanner(System.in);
			int menu=0;
			System.out.println("Book Store");
			System.out.println();
			System.out.println("1. Buy Book");
			System.out.println("2. Receipt");
			System.out.println("3. Receive Payment ");
			System.out.println("4. Exit");
			boolean quit = false;
			do {
				if(count>5) {
					System.out.println("You cannot buy more than 5 books at a time.");
				}
				System.out.println("Please enter your choice : ");
				menu = sc.nextInt();
				sc.nextLine();
				System.out.println();
				switch(menu) {
				case 1:
					count++;
					System.out.println("Book Title: ");
					String booktitle=sc.nextLine();
					System.out.println("Author: ");
					String auth = sc.nextLine();
					System.out.println("ISBN: ");
					int no=sc.nextInt();
					System.out.println("Price: ");
					double p=sc.nextDouble();
					System.out.println("Discount: ");
					double dis = sc.nextDouble();
					double total=p-(dis*p)/100;
					list.add(new BookStore(booktitle, auth, no, p, dis, total));
					break;
					
				case 2:
					System.out.println("Title author ISBN price discount total");
					for(Iterator it = list .iterator();
							it.hasNext();) {
						BookStore s = (BookStore) it.next();
						System.out.println(s.getTitle()+" "+s.getAuthor()+" "+s.getIsbn()+" "+s.getDiscount()+" "+ s.getTotal());
						sum += s.getTotal();
						
					}
					System.out.println("Total = " +sum);
					break;
					
				case 3:
					System.out.println("Customer pays: ");
					amount=sc.nextDouble();
					double balance = amount - sum;
					System.out.println("Balance is: "+balance);
					quit=true;
				case 4:
					quit=true;
					break;
				default:
					System.out.println("Invalid Entry ! ");
							
				}
			}
	while(!quit);

}
}