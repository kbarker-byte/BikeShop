public class BikeShop{

    public static final double LABOR_RATE = 65.0;
    private static int totalRepairs = 0;

    private static double calculateLaborCost(double hours){
        return hours * LABOR_RATE;
    }

    public static void serviceBike(Bicycle bike, double hours){

        if (hours > 0){
            double cost = calculateLaborCost(hours);

            bike.getServiceRecord().addCharge(cost);
            bike.getServiceRecord().markComplete();

            totalRepairs++;


        }
    }

    public static int getRepairs(){
        return totalRepairs;
    }




} 