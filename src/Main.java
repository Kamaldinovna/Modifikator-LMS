public class Main {
    public static void main(String[] args) {

        Sheep sheep = new Sheep(100,3,"male","Mu Mu");
        Sheep sheep1 = new Sheep(150,5,"famale","Mu Mu");
        Sheep sheep2 = new Sheep(130,4,"male","Mu Mu");

        Cow cow = new Cow(20,2,"male","Ma ma");
        Cow cow1 = new Cow(30,3,"famale","Ma ma");
        Cow cow2 = new Cow(40,4,"male","Ma ma");
        Cow cow3 = new Cow(50,5,"famale","Ma ma");
        Cow cow4 = new Cow(60,6,"male","Ma ma");

        Horse horse = new Horse(50,5,"male","igo go");
        Horse horse1 = new Horse(60,10,"famale","igo go");
        Sheep [] sheeps = {sheep,sheep1,sheep2};
        Cow [] cows = {cow1,cow2,cow3,cow4,cow};
        Horse [] horses =  {horse,horse1};
        Farm farm = new Farm("farm",cows,horses,sheeps,"Aizat");
        System.out.println(farm);
        System.out.println();

        Sheep [] sheepsy ={sheep};
        Cow [] cows1 = {cow};
        Horse[] horses1 = {horse};
        Farm farm1 = new Farm("jailoo",cows1,horses1,sheepsy,"Nazgul");
        System.out.println(farm1);


    }

}