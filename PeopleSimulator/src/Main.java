
class Main {
	public static void main(String[] args) {

		Society peopleTown = new Society(10000);
		for(int i = 0; i < peopleTown.population; i++){

			System.out.println(i + " " + peopleTown.people.get(i).getName() + " age = "+ peopleTown.people.get(i).getAge());
		}

	}

}
