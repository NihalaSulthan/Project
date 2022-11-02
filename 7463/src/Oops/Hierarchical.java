package Oops;

class Employee
{
public void show()
{
System.out.println("I am a Employee");
}
}
class TeamManager extends Employee
{
public void show1()
{
System.out.println("I am a TeamManager  who is Employee ");
}
}
class Ops extends Employee
{

public void show2()
{
System.out.println("Ops Manager who is Employee ");
}
}
class Agent extends Employee
{
public void show3()
{
System.out.println("Agent who is Employee ");
}
}
public class Hierarchical
{
public static void main(String args[])
{
TeamManager  Tm = new TeamManager ();
Ops  op = new Ops();
Agent  Ag = new Agent ();
Tm.show();
Tm.show1();
op.show2();
Ag.show3();
}
}
