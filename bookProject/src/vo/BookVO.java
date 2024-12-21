package vo;

public class BookVO {
    private int bookNum;  //도서번호(관리용 임의번호)
    private String bookName;    //도서이름
    private String writer;  //작가
    private String publisher;   //출판사
    private int stock;  //재고

    public BookVO(){}
    public BookVO(int bookNum, String bookName, String writer, String publisher, int stock){
        this.bookNum = bookNum;
        this.bookName = bookName;
        this.writer = writer;
        this.publisher = publisher;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return bookNum+"\t"+bookName+"\t"+writer+"\t"+publisher+"\t"+stock;
    }

    public int getBookNum() {
        return bookNum;
    }

    public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
