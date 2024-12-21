package data;

import vo.BookVO;

import java.util.ArrayList;
import java.util.List;

public class BookDataSet {
    //책 한권의 정보를 BookVO에 셋팅.
    //BookVO 객체를 List에 담음.
    public static List<BookVO> bookList = new ArrayList<>();

    //책정보 초기데이터 셋팅.(책번호, 책이름, 작가, 출판사, 재고)
    public static void setBook(){
        bookList.add(new BookVO(1, "자바의 정석", "정자바", "자바출판", 5));
        bookList.add(new BookVO(2, "SQL의 정석", "김쿼리", "쿼리출판", 5));
        bookList.add(new BookVO(3, "JS의 정석", "이자스", "JS출판", 5));
        bookList.add(new BookVO(4, "HTML의 정석", "박코딩", "DIV출판", 5));
        bookList.add(new BookVO(5, "JSP의 정석", "홍서버", "서버출판", 5));
    }
}
