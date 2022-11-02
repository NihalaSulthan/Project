package Cloning;
 
public class Bike implements Cloneable {
private int gears;
private String bikeType;
private String model;
public Bike() {
bikeType="Standard";
model= "BSVI";
gears=4;
}
public Bike clone(){
return new Bike();
}
public void makeAdvanced(){
bikeType = "Advanced";
model = "HIMALAYA";
gears = 6;
}
public String getModel(){
return model;
}
@Override
public String toString() {
return "Bike [gears=" + gears + ", bikeType="
+ bikeType + ", model=" + model + "]";
}
}