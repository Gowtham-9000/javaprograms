package programs;

class Author {
    //Implement your code here 
    String name;
    String emailId;
    char gender;
	public Author(String name, String emaiId, char gender) {
		super();
		this.name = name;
		this.emailId = emaiId;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emaiId) {
		this.emailId = emailId;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

}


class Book {
    //Implement your code here 
    String name;
    Author author;
    double price;
    int quantity;

    public Book(String name, Author author, double price, int quantity) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
    

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public void displayAuthorDetails(){
        System.out.println("Displaying author details");
        System.out.println("Author name: "+author.getName());
        System.out.println("Author email: "+author.getEmailId());
        System.out.println("Author gender: "+author.getGender());
    }
    
}


class Aggregation2 {
    public static void main(String[] args) {
        //Implement your code here
        Author author1 = new Author("Joshua Blouch","joshoua@email.com",'M');
        Book book1 = new Book("Effective Java",author1,45.00,15);
        book1.displayAuthorDetails();
    }
}
