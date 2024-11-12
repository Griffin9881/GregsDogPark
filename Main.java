public class Main {
    public static void main(String[] args) {
        DogPark gregsDogPark = new DogPark("Greg's Dog Park");
        DogPark griffinDogPark = new DogPark("Griffin's Dog Park", 100);
        
        for(int i = 0; i < 49; i++) {
            gregsDogPark.addDog();
        }

        for(int i = 0; i < 20; i++){
            griffinDogPark.addDog();
        }

        System.out.println(gregsDogPark.getName() + " has a current capacity of " + gregsDogPark.getcurrentCapacity() + " out of a max capacity of " + gregsDogPark.getmaxCapacity());

        System.out.println(griffinDogPark.getName() + " has a current capacity of " + griffinDogPark.getcurrentCapacity() + ". Max Capacity is " + griffinDogPark.getmaxCapacity());
        
        for(int i=0; i < 5; i++){
            gregsDogPark.removeDog();
        }

        for(int i=0; i < 5; i++){
            griffinDogPark.removeDog();
        }

        System.out.println(gregsDogPark.getName() + " has a current capacity of " + gregsDogPark.getcurrentCapacity() + ".");

        System.out.println(griffinDogPark.getName() + " has a current capacity of " + griffinDogPark.getcurrentCapacity() + ".");









    }
}
