
class Main {
	// I'll be using this main method for testing
	public static void main(String[] args) {

		Society peopleTown = new Society(10000);


        for(int i = 0; i<10000; i++)
        {
        System.out.println(peopleTown.people.get(i).getName() + " " + peopleTown.people.get(i).getImmuneStrength());
        }

            //System.out.println("CEMETARY:");
        //for(int i = 0; i<10000; i++)
       // {
       // if(peopleTown.people.get(i).isDead() == true);
       // {
         //   System.out.println(peopleTown.people.get(i).getName() + " " + peopleTown.people.get(i).getAge() + " Cause of death: ");
       // }
        //}
	}

}
