public class InheritanceDemo {
    public static void main(String[] args) {
        Car Toyota = new Car(4,5, false);
        System.out.println("Number of doors on Toyota's Car : "+Toyota.getNumDoors());
        System.out.println("Number of wheels of Toyota's Car : "+Toyota.getWheels());
        String electric;
        electric=Toyota.getIsElectric() ? "yes" : "no";
        System.out.println("Is teh toyota's car electric ? "+electric);
    }
}
