package Accessspecifier;


class Data {
    // private variable
    private String name;
    
    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}

public class Private1 {
  
    public static void main(String[] main){

        // create an object of Data
        Data d = new Data();
        d.setName("JAVA FULL STACK");
        System.out.println(d.getName());
    }
}
     