package kr.hs.study;

public class Testbean {
    private int a;
    private int b;
    private int c;

    public Testbean(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void prData(){
        if(a%2==0){
            System.out.println(a);
        }
        if(b%2==0){
            System.out.println(b);
        }
        if(c%2==0){
            System.out.println(c);
        }
    }
}
