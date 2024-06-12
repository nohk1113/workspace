package 상속;

public class Animal_1 {
    public static void main(String[] args) {
        Dog[] dogHouse=new Dog[5];
        Cat[] catHouse=new Cat[5];
        Cow[] cowHouse=new Cow[5];

        Dog d1=new Dog();
        dogHouse[0]=d1;
        Dog d2=new Dog();
        dogHouse[1]=d2;
        Dog d3=new Dog();
        dogHouse[2]=d3;

        Cat c1=new Cat();
        Cat c2=new Cat();
        catHouse[0]=c1;
        catHouse[1]=c2;

        Cow w1=new Cow();
        Cow w2=new Cow();
        cowHouse[0]=w1;
        cowHouse[1]=w2;

    }
}
