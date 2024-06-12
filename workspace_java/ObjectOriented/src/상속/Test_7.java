package 상속;

public class Test_7 {

}
class A{
    int n;
    String s;
    char c;
    int m;
    double d;

    public int getN(){
        return n;
    }
    public void setN(int i){
        n=i;
    }
    public char getC(){
        return c;
    }
    public void setC(char ch){
        c=ch;
    }
}
class B extends A{

}
class C extends A{

}
