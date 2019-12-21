package work4;

public class Test {
    public static void main(String[] args) {
        Elephant elephant=new Elephant("胖胖",100,80);
        Loin loin=new Loin("酷酷",70,60);
        ZhuRen zhuRen=new ZhuRen();
        zhuRen.feed(loin);
        Animal animal = zhuRen.biaoYuan();
        if (animal instanceof Elephant){
            System.out.println("获胜："+elephant.getName());
        }else {
            System.out.println("获胜："+loin.getName());
        }

    }
}
