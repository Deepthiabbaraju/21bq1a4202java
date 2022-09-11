
public class BookTest {
	public static void main(String args[]) {
		Book b[]=new Book[30];
		b[0]=new Book("wings of fire","1-23456-789-0","abdulkalam","universities press");
		b[0].getBookInfo();
		b[1]=new Book("the open boa","1-86092-025-x","stephen crane","uniersities press");
		b[1].getBookInfo();	
		b[2]=new Book("java:the complete reference","93-90491-62-2","herbert schildt","oracle press");
		b[2].getBookInfo();
	}
     
}
