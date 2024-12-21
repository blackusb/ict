package process;

import data.BookDataSet;
import vo.BookVO;

import java.util.Scanner;

public class BookList {
    Scanner sc = new Scanner(System.in);

    public BookList(){
        BookDataSet.setBook();
    }
    public void bookStart(){
        do{
            bookMenu();
        }while(true);
    }

    //메뉴선택
    public void bookMenu(){
        //메뉴 : 1.도서목록 2.도서등록 3.도서수정 4.도서삭제 5.종료
        System.out.print("메뉴 [1.도서목록 2.도서등록 3.도서수정 4.도서삭제 5.종료]=");
        String menu = sc.nextLine();

        switch(menu){
            case "1": bookPrint();break;
            case "2": bookInsert();break;
            case "3": bookEdit();break;
            case "4": bookDelete();break;
            case "5":
                System.out.println("프로그램 정상 종료");
                System.exit(0);
                break;
            default:
                System.out.println("메뉴를 잘못 입력하였습니다. 다시 선택하세요.");
        }
    }
    //도서목록
    public void bookPrint(){
        System.out.println("번호\t도서이름\t\t작가\t\t출판사\t재고");
        for(BookVO bvo:BookDataSet.bookList){
            System.out.println(bvo.toString());
        }
    }
    //도서등록
    public void bookInsert(){
        //도서정보 입력받아서 BookVO객체에 담기
        BookVO bvo = new BookVO();

        System.out.print("도서번호 입력=");
        int bookNum = Integer.parseInt(sc.nextLine());
        bvo.setBookNum(bookNum);

        System.out.print("도서이름 입력=");
        String bookName = sc.nextLine();
        bvo.setBookName(bookName);

        System.out.print("작가 입력=");
        String writer = sc.nextLine();
        bvo.setWriter(writer);

        System.out.print("출판사 입력=");
        String publisher = sc.nextLine();
        bvo.setPublisher(publisher);

        System.out.print("재고 입력=");
        int stock = Integer.parseInt(sc.nextLine());
        bvo.setStock(stock);

        //set으로 담은 데이터를 BookDataSet클래스의 List객체에 추가
        BookDataSet.bookList.add(bvo);
        System.out.println(bookName+" 도서 등록완료");
    }
    //도서수정(번호, 도서이름, 작가, 출판사, 재고)
    public void bookEdit(){
        //수정할 도서이름 입력
        System.out.print("수정할 도서이름 입력=");
        String bookName = sc.nextLine();

        //수정할 항목 선택(번호, 도서이름, 작가, 출판사, 재고)
        System.out.print("수정할 항목 선택(1.번호, 2.도서이름, 3.작가, 4.출판사, 5.재고)=");
        String field = sc.nextLine();

        //수정할 데이터 입력받기
        String editData = null;  //수정할 데이터 받을 변수.
        int editDataNum = 0;    //번호, 재고는 int타입이어서, int타입 변수 준비.

        if(field.equals("1")){
            System.out.print("수정할 번호 입력="); //////
            editData = sc.nextLine();
            editDataNum = Integer.parseInt(editData);   //String으로 받은 데이터 int로 변환.
        }else if(field.equals("2")){
            System.out.print("수정할 도서이름 입력=");
            editData = sc.nextLine();
        }else if(field.equals("3")){
            System.out.print("수정할 작가 입력=");
            editData = sc.nextLine();
        }else if(field.equals("4")){
            System.out.print("수정할 출판사 입력=");
            editData = sc.nextLine();
        }else if(field.equals("5")){
            System.out.print("수정할 재고 입력="); //////
            editData = sc.nextLine();
            editDataNum = Integer.parseInt(editData);   //String으로 받은 데이터 int로 변환.
        }

        for(int i=0; i<BookDataSet.bookList.size(); i++){  //수정할 대상인지 하나씩 확인.
            BookVO bvo = BookDataSet.bookList.get(i);
            if(bvo.getBookName().equals(bookName)){ //수정을 위해 입력한 도서이름과 같은지 확인.
                switch(field){
                    case "1":   //번호 수정
                        bvo.setBookNum(editDataNum);
                        break;
                    case "2":   //도서이름 수정
                        bvo.setBookName(editData);
                        break;
                    case "3":   //작가이름 수정
                        bvo.setWriter(editData);
                        break;
                    case "4":   //출판사 수정
                        bvo.setPublisher(editData);
                        break;
                    case "5":   //재고 수정
                        bvo.setStock(editDataNum);
                    case "6":
                        System.out.println("프로그램 정상 종료.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("메뉴를 잘못 입력하였습니다. 다시 선택하세요.");
                }
                break;  //for문에 대한 break.
            }
        }
        System.out.println(bookName+" 도서 수정완료");   /////////////////////////////////새이름 받은걸로 바꾸기
    }
    //도서삭제
    public void bookDelete(){
        //삭제할 도서이름 입력받아서 해당 bvo 객체 삭제.
        System.out.print("삭제할 도서이름 입력=");
        String delBook = sc.nextLine();

        for(int i=0; i<BookDataSet.bookList.size(); i++){  //입력받은 도서이름과 하나씩 대조.
            if(BookDataSet.bookList.get(i).getBookName().equals(delBook)){
                BookDataSet.bookList.remove(i);
                System.out.println(delBook+" 도서 삭제완료");
                break;  //ArrayList는 중간에 데이터가 삭제되면 뒤에서 앞으로 땡겨지므로, break 해줘야함.
            }
        }
    }
    //종료

    public static void main(String[] args){
        BookList bl = new BookList();
        bl.bookStart();
    }
}
