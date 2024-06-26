public class Restaurant {
    private Chef chef;

    public Restaurant(){
        chef=new Chef();
    }

    public void service(){
        System.out.println("영업 시작");
        chef.makeCook();
    }
}
