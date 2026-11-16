public class ServiceRecord{
    private String description;
    private double cost;
    private boolean completed;


    public ServiceRecord(String description){
        this.description = description;
        cost = 0.0;
        completed = false;
    }

    public String getDescription(){
        return description;
    }


    public double getCost(){
        return cost;
    }

    public boolean isCompleted(){
        return completed;
    }

    private boolean isValidCharge(double amount){
        return amount > 0;
    }

    public void addCharge(double amount){
        if (isValidCharge(amount)){
            cost += amount;
        }
    }
}