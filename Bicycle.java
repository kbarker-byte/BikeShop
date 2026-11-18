public class Bicycle {
    private String owner;
    private String model;
    private int mileage;
    private ServiceRecord serviceRecord;

    private static int nextId = 1;
    private final int id;


    public Bicycle(String owner, String model){
        this.owner = owner;
        this.model = model;
        mileage = 0;
        id = nextId;
        nextId++;

        serviceRecord = new ServiceRecord("Routine Record");
    }

    public void ride(int miles){
        if (miles > 0){
            mileage += miles;
        }
    }

    public boolean needsService(){
        return mileage >= 500;
    }


    // Getters

    public int getId(){
        return id;
    }

    public String getOwner(){
        return owner;
    }

    public String getModel(){
        return model;
    }

    public int getMileage(){
        return mileage;
    }

    public ServiceRecord getServiceRecord(){
        return  serviceRecord;
    }




}

