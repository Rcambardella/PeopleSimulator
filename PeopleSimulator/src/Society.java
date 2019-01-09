import java.util.*;

class Society{
	//this declares a new instance variable... an ArrayList for people
	List<Person> people = new ArrayList<Person>();


	public int population;
	//these names came from https://nameberry.com/unisex-names
	private String[] firstNames = {"Avery","Riley","Jordan","Angel","Parker","Sawyer","Peyton","Quinn","Blake","Hayden","Taylor","Dakota","Reese","Zion","Remmington","Amari","Phoenix","Kendall","Harley","Rylan","Marley","Dallas"};
	private String[] lastNames = {"Hill","Carson","Ware","McMahon","Murray","Smith","Jones","Robinson","Morris","Brown","Meyers","Reed","Schmidt","Estrada","Huang","Patel","Gupta","Gomez","Ramirez","Thomas","Jordan","Samson","Samuels","Evans","Butts","Wright","Black","White"};

	Society(int numPeople){
		population = numPeople;
		String fullName;
		for(int i = 0; i < numPeople; i++){
			fullName = firstNames[(int)(Math.random()*firstNames.length)] + " " + lastNames[(int)(Math.random()*lastNames.length)];
			people.add(new Person((int)(Math.random()*100),fullName));
		}
	}

    public void diseasesBornWith()
{
  for( int i = 0; i < population; i++)
  {
    if(people.get(i).getImmuneStrength() <= .30)
    {
        if(people.get(i).getChanceOfDisease() >= .45)
        {
            //add potnetial diseases
        }
    }

    if(people.get(i).getImmuneStrength() >= .35)
    {
        if(people.get(i).getChanceOfDisease() >= .45)
        {
            //add potnetial diseases
        }
    }

  }
}


}

