package library_management_system;

public class Members {
    private int regID;
    private String name;

    public Members(int regID, String name){
        this.regID = regID;
        this.name = name;
    }

    public int getRegID(){
        return this.regID;
    }

    public String getName(){
        return this.name;
    }

    public void displayMembers(){
        System.out.printf("ID: %d \nName: %s\n", getRegID(), getName());
    }
}
