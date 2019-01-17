class Disease
{
public String name;
private double lethality;
private double infectious;
private double contagious;

public Disease(String name, double lethality, double infectious, double contagious)
{
   this.name = name;
   this.lethality = lethality;
   this.infectious = infectious;
   this.contagious = contagious;
}

public String getName()
{
    return name;
}

public double getLethality()
{
    return lethality;
}

public double getInfectious()
{
    return infectious;
}

public double getContagious()
{
    return contagious;
}

}