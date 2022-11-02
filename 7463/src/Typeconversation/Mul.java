package Typeconversation;


interface IFly {

    public void fly();
}
interface IHopp {

    public void hop();
}

class Sparrow implements IFly, IHopp {

    public void fly() {
        System.out.println("Flying");
    }
    public void hop() {
        System.out.println("Hopping");
    }
}

public class Mul {
    public static void main(String[] args) {
        Sparrow s1 = new Sparrow();
        s1.fly();
        s1.hop();
    }
}