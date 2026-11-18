public class Main{

    public static void main(String[] args){

        Bicycle bikeA = new Bicycle("Sam", "Speedy Slicer");
        Bicycle bikeB = new Bicycle("Alex", "Dirt Champion");

        // starting bicyles
       System.out.println("\nINITIAL BICYCLES");

       System.out.println("Bike #" + bikeA.getId() + ": " +
        bikeA.getOwner() + "'s " + bikeA.getModel() + ", " +
        bikeA.getMileage() + " miles; " +
        bikeA.getServiceRecord());

       System.out.println("Bike #" + bikeB.getId() + ": " +
        bikeB.getOwner() + "'s " + bikeB.getModel() + ", " +
        bikeB.getMileage() + " miles; " +
        bikeB.getServiceRecord());


        System.out.println("\nBIKE OWNER NAMES");
        System.out.println(bikeA.getOwner().toUpperCase());
        System.out.println(bikeB.getOwner().toUpperCase());
        
        // After Travel

        System.out.println("\nAFTER Travel");

        bikeA.ride(475);
        bikeB.ride(600);

        bikeA.ride(-50);
        bikeB.ride(0);

        System.out.println("BikeA mileage after riding 475 miles: " + bikeA.getMileage());

        System.out.println("BikeB mileage after riding 600 miles: " + bikeB.getMileage());
        
        System.out.println("BikeB needs service: " + bikeB.needsService());

        System.out.println("BikeA needs service: " + bikeA.needsService());


        // Aliasing

        System.out.println("\n ALIASING");

        Bicycle alias = bikeA;
        alias.ride(50);

        System.out.println("BikeA mileage after alias rides 50 miles: " + bikeA.getMileage());

        // After Service\

        System.out.println("\nAFTER SERVICE");

        BikeShop.serviceBike(bikeA, -1);

        BikeShop.serviceBike(bikeA, 1.5);
        BikeShop.serviceBike(bikeB, 2.0);

        System.out.println("Bike #" + bikeA.getId() + ": " +
        bikeA.getOwner() + "'s " + bikeA.getModel() + ", " +
        bikeA.getMileage() + " miles; " +
        bikeA.getServiceRecord());

        System.out.println("Bike #" + bikeB.getId() + ": " +
        bikeB.getOwner() + "'s " + bikeB.getModel() + ", " +
        bikeB.getMileage() + " miles; " +
        bikeB.getServiceRecord());

        System.out.println("BikeA charge: "
        + bikeA.getServiceRecord().getCost());

        System.out.println("BikeB charge: "
        + bikeB.getServiceRecord().getCost());

        System.out.println("Completed repairs: "
        + BikeShop.getRepairs());






    }


}