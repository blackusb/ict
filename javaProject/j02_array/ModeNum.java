package j02_array;

public class ModeNum {
    int ranNum[]; //난수 1000개를 보관할 배열, 멤버변수
    public ModeNum(){   //생성자메서드. 안적으면 컴파일러가 알아서 만들어줌.
        //start();
    }
    void start(){
        createRandom();
        int count[] = ModeCount();    //돌아온 데이터를 보관해야 안없어짐
        maxSearch(count);
    }
    //1~100사이의 난수 1000개를 만들어 배열에 담는 메소드
    void createRandom(){
        ranNum = new int[1000];
        for(int i=0; i<ranNum.length; i++){
            ranNum[i] = (int)(Math.random()*(100-1+1))+1;   //(큰수-작은수+1)+작은수
        }
    }
    //배열 ranNum의 값의 갯수를 구한다. 1이 몇개인지, 2가 몇개인지....100이 몇개인지
    int[] ModeCount(){
        //갯수를 카운트할 배열
        int cnt[] = new int[101];   //0,1,2,.....100  //0번째는 사용x
        for(int i=0; i<ranNum.length; i++){ //0,1,2,3,.....999
            ++cnt[ranNum[i]];
        }
        return cnt; //배열전체를 가르킬때는 [] 사용x, cnt는 지역변수이므로 return을 해줘야 {} 외부에서 사용 가능
    }
    //최빈수 구하기 - 제일 큰 값을 가진 index를 구하면 최빈수가 된다.
    void maxSearch(int data[]){    //start() 안에 있는 int count[]를 사용하기 위해서는 매개변수 필요함. 변수 이름이 같을 필요는 x.
        int searchIndex = 1;
        for(int i=2; i<data.length; i++){   //2,3,4,......100
            if(data[searchIndex]<=data[i]){
                searchIndex = i;
            }
        }
        //최빈수 출력
        for(int i=0; i<data.length; i++){
            System.out.print("data["+i+"]="+data[i]+"\t");
            if(i%10==0) System.out.println();
        }
        System.out.println("\n최빈수="+searchIndex);
    }

    public static void main(String[] args) {
        ModeNum mn = new ModeNum(); //Scanner scan = new Scanner(System.in);    //객체 만들고
        mn.start();                 //scan.nextInt();                           //객체명.메소드로 필요한 기능 호출
    }
}
