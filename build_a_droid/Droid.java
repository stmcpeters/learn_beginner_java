// create a class named Droid
public class Droid {
    // create instance fields
    String name;
    int batteryLevel;

    // create a constructor to create a new instance of Droid
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    // method to perform a task
    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }
    // method to display battery level
    public int energyReport(){
        return batteryLevel;
    }
    // method to introduce new droid
    public String toString(){
        return "Hello! I am a droid, my name is " + name + ":D";
    }

    // main method
    public static void main(String[] args){
        Droid droid = new Droid("Codey");
        // System.out.println(droid.toString());
        // System.out.println(droid.batteryLevel);
        droid.performTask("cleaning");
        System.out.println(droid.energyReport());
    }
}