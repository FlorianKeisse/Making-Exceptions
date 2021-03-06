public class Customer {

    private String name;
    private int age;
    private double euros;
    private boolean DTF;
    private boolean hasCondom;
    private int beersThatTheyDrunk;
    private final double tippingAmount = 1.50;

    public Customer() {
    }

    public Customer(String name, int age, double euros, boolean DTF, boolean hasCondom) {
        this.name = name;
        this.age = age;
        this.euros = euros;
        this.DTF = DTF;
        this.hasCondom = hasCondom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getEuros() {
        return euros;
    }

    public void setEuros(double euros) {
        this.euros = euros;
    }

    public boolean isDTF() {
        return DTF;
    }

    public void setDTF(boolean DTF) {
        this.DTF = DTF;
    }

    public boolean isHasCondom() {
        return hasCondom;
    }

    public void setHasCondom(boolean hasCondom) {
        this.hasCondom = hasCondom;
    }

    public int getBeersThatTheyDrunk() {
        return beersThatTheyDrunk;
    }

    public void setBeersThatTheyDrunk(int beersThatTheyDrunk) {
        this.beersThatTheyDrunk = beersThatTheyDrunk;
    }


    public boolean feelingConfident(){

        if (getBeersThatTheyDrunk()>5&&isHasCondom()&&isDTF()){
            System.out.println("Good job you're down to F's in chat");
        }
        return true;
    }
    //check if they drank more than 5 beers, if they have a condom and if they're DTF


    public double tipTheCuteStaff(Staff staff){

        System.out.println("Beers you had :" +getBeersThatTheyDrunk());
        double sumOrBill =getBeersThatTheyDrunk()*tippingAmount;
        System.out.println("You have " + getEuros() + " left");
        if (euros<sumOrBill){
            System.out.println("Amount is too low but i'll give it all");
            euros=-euros;
        }return getEuros();
    }
        // check how many drinks you had.
        //multiply that amount of drinks with the tippingAmount
        //check if you have enough money. If the amount is too low,
        //only give the amount that you have left
        //return the amount of money you have left
}
