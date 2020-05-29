import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class PolymorphismDemo {

    public static void main(String[] args) {
        List<FlyingMachine> machines = new ArrayList<FlyingMachine>();
        machines.add(new FlyingMachine());
        machines.add(new Jet());
        machines.add(new Helicopter());
        machines.add(new Jet());

        new MakeThingsFly().letTheMachinesFly(machines);
    }
}

class MakeThingsFly {
    public void letTheMachinesFly(List<FlyingMachine> flyingMachines) {
        for (FlyingMachine flyingMachine : flyingMachines) {
           // flyingMachine.fly();
            flyingMachine.landPlane(flyingMachine);
        }
    }
}

class FlyingMachine {
    public void fly() {
        out.println("No implementation");
    }
    public void codeReuse()
    {
    	System.out.println("Using the same code");
    }
    public void landPlane(FlyingMachine fm)
    {
    	Airport.AllowPlaneToLand(fm);
    }
}

class Jet extends FlyingMachine {
    @Override
    public void fly() {
        out.println("Start, taxi, fly");
        FlyingMachine f1 = new Jet();
        f1.codeReuse();
    }
    
    public void bombardment() {
        out.println("Fire missile");
    }
    public void landPlane(FlyingMachine fm)
    {
    	Airport.AllowPlaneToLand(fm);
    }
}

class Helicopter extends FlyingMachine {
    @Override
    public void fly() {
        out.println("Start vertically, hover, fly");
    }
    public void landPlane(FlyingMachine fm)
    {
    	Airport.AllowPlaneToLand(fm);
    }
    
    
}

class Airport
{
	public static  void AllowPlaneToLand(FlyingMachine fm)
	{
	  System.out.println("Please land");
	  fm.fly();
	}
}