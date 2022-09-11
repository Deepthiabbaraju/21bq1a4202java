class Book{
    String bookname;
    String ISBNnum,authorname,publishername;
    Book(String bn,String isbn,String an,String pn){
       this.bookname=bn;
        this.ISBNnum=isbn;
        this.authorname=an;
        this.publishername=pn;
    }
    void setbookname(String bookname) {
    	this.bookname=bookname;
    }
    String getbookname() {
    	return bookname;
    }
    void setISBNnum(String ISBNnum) {
    	this.ISBNnum=ISBNnum;
    }
    String getISBNnum() {
    	return ISBNnum;
    }
    void setauthorname(String authorname) {
    	this.authorname=authorname;
    }
    String getauthorname() {
    	return authorname;
    }
    void setpublishername(String publishername) {
    	this.publishername=publishername;
    }
    String getpublishername() {
    	return publishername;
    }
    void getBookInfo() {
    	System.out.println("name of the book:"+bookname);
    	System.out.println("ISBN number:"+ISBNnum);
    	System.out.println("author:"+authorname);
    	System.out.println("publisher:"+publishername);
    	
    	
    }
    
    
}
