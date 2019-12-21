package work4;

        public class ZhuRen {
            Elephant e=new Elephant();
            Loin l=new Loin();
            public void feed(Animal animal){
                animal.eat();

            }
    //让动物表演
        public Animal biaoYuan(){
            Animal animal=null;

            if (e.getForce()>l.getForce()){
                animal=e;
            }else {
                animal=l;
            }
            return animal;
        }

}
