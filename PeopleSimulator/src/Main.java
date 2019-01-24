class Main {
	public static void main(String[] args) {
        Society peopleTown = new Society(1000);
         for(int i = 0; i < 1000; i++) {
            peopleTown.cycleDay();
            //Write your print/tests in here if your feature should happen on a dialy basis

            if(!peopleTown.getDisaster().equals("none")){
                int preDisasterPop = peopleTown.population;
                //Shows Disater news report
                System.out.println(peopleTown.getDisaster() + " on " + peopleTown.time.dateToString());
            }
            if(false){
                //Jared and Sophia's Societal Happiness
                System.out.println(" Societal Happiness = " + peopleTown.societalHappiness() +"% on "+ peopleTown.time.dateToString());
            }
        }

        for(Person individual : peopleTown.people){

            //Logan's mating and wedlock methods
            if(individual.getSpouse() != null){
                System.out.println(individual.getName() + " married to " + individual.getSpouse().getName() );
                System.out.println(individual.getSpouse().getName() + " is married to " + individual.getName());
            }
            if(individual.getSpouse() == null && individual.getAge() > 10){
              System.out.println(individual.getName() + " got divorced " + individual.getNumOfTimesDivorced() + " time(s) because their happiness (or sometimes their spouse's) dropped to " + individual.getHappiness());
            }

            //Justin & Drew's income calculated on the bell curve... maybe too many poor people
            System.out.println(individual.getName() + "'s Income: " + individual.income);


        for(int i = 0; i<10000; i++)
        {
        System.out.println(peopleTown.people.get(i).getName() + " " + peopleTown.people.get(i).getImmuneStrength() + " " + peopleTown.people.get(i).getDisease());
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
            //Fiona's assigning personality numbers based on Dungeouns and Dragons alignments
            System.out.println(individual.getName() + " has personality number " + individual.getPersonalityNumber() + ", called "+ individual.getPersonalityString() + ". " + "isLawful = " + individual.getPersonalityBoolean("isLawful"));
            System.out.println(individual.getName() + " has personality number " + individual.getPersonalityNumber() + ", called "+ individual.getPersonalityString() + ". " + "isLawful = " + individual.getPersonalityBoolean("isLawful"));

        }

        //Miranda's Bank Accounts
        System.out.println(peopleTown.people.get(10).getName() +" Balance = " + peopleTown.people.get(10).acct.getBalance() );        System.out.println(peopleTown.people.get(10).getName() +" Balance = " + peopleTown.people.get(10).acct.getBalance() );

        //Robert's born with diseases
        public void diseasesBornWith();
    }




