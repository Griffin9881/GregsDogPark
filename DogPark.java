public class DogPark {
    private String name;
    private int currentCapacity;
    private int maxCapacity;

    public DogPark(String name) {
        this.name = name;
        this.currentCapacity = 0;
        this.maxCapacity = 50;
    }

    public DogPark(String name, int maxCapacity){
        this.name=name;
        this.currentCapacity=0;
        this.maxCapacity= maxCapacity;
    }

    public void addDog() {
        if (currentCapacity < maxCapacity) {
            currentCapacity++;
        }
    }

    public void removeDog() {
        if (currentCapacity > 0){
            currentCapacity--;
        }
    }

    public void closeDogPark() {
        while (currentCapacity > 0) {
            currentCapacity--;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getcurrentCapacity(){
        return currentCapacity;
    }

    public int getmaxCapacity(){
        return maxCapacity;
    }




}