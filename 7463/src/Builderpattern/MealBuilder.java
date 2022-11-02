package Builderpattern;

public interface MealBuilder {
  
public void buildStarter();
public void buildMainCourse();
public void buildDesserts();
public Meal getMeal();
}
