package FacadeDesignPattern;

 
//The method doAnotherThing() doubles the cube of an integer and returns it.
public class Class2 {
public int doAnotherThing(Class1 class1, int x) {
return 2 * class1.doSomethingComplicated(x);
}
}