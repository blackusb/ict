package j08_collection;

//K : key, V : value, E : element
//제너릭은 클래스 옆에 <>기호를 하고 대문자 1글자 기호를 정한다.
//제너릭을 설정하지 않으면 데이터형이 자동으로 Object로 설정된다.

public class GenericTest<E> {
    private E data; //Object 대신 E 넣음.

    public GenericTest(){}  //생성자

    public E getData() {
        return data;
    }
    public void setData(E data) {
        this.data = data;
    }

}
