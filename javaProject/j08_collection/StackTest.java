package j08_collection;

import java.util.Random;
import java.util.Stack;

public class StackTest {
    public StackTest(){}
    public void start(){
        Random ran = new Random();
        //Stack은 (FILO, LIFO)먼저 저장된 데이터가 마지막에 출력된다.(꺼내진다)

        Stack<Integer> stack = new Stack();   //객체 생성

        for(int i=1; i<=10; i++){
            int n = ran.nextInt(100);
            stack.push(n);   //0~99 사이의 난수 생성
            System.out.print(n+"\t");
        }
        System.out.println();

        while(!stack.empty()){   //stack.empty() : stack에 객체가 있으면 false, 없으면 true.
            //pop() : 꺼낸 후 스택의 객체를 지운다.
            //peek() : 꺼낸 후 스택의 객체를 지우지 않는다.
            System.out.print(stack.pop()+"\t");
        }
    }

    public static void main(String[] args){
        new StackTest().start();
    }
}
