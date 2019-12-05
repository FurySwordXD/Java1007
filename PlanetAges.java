import java.util.*;
import java.lang.Math;

public class PlanetAges
{
    private double age;
    private HashMap<String, Double> planetDays = new HashMap<String, Double>();

    public PlanetAges(double age)
    {
        this.age = age;
        planetDays.put("Mercury", 87.97);
        planetDays.put("Venus", 224.70);
        planetDays.put("Earth", 365.26);
        planetDays.put("Mars", 686.98);
        planetDays.put("Jupiter", 4332.82);
        planetDays.put("Saturn", 10755.70);
        planetDays.put("Uranus", 30687.15);
        planetDays.put("Neptune", 60190.03);
    }

    private double CalculateNewPlanetAge(double numberOfDays)
	{
		double newPlanetAge = 365 * age / numberOfDays;
        return newPlanetAge;
    }
    
    public void AllPlanetAges()
    {
        for(Map.Entry<String, Double> m:planetDays.entrySet())
        {
            //System.out.println(m.getKey() + " " + m.getValue());  
            double newPlanetAge = CalculateNewPlanetAge(m.getValue());
            System.out.println("Your age in " + m.getKey() + " (" + Math.round(m.getValue()) + " Earth days): " + Math.round(newPlanetAge * 100)/100.0);
        }  
    }
}
