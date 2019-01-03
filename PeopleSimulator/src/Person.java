class Person {
	public int age;
	private String name;
    private int immuneStrength;
    private int chanceOfDisease;
    private int wealth;
    private boolean disease;
    public double susceptibility;
	public Person(int age, String name) {
		this.name = name;
		this.age = age;
	}

	public Person() {
		this.name = "Brad";
		this.age = 37;
	}

	public boolean olderThan(int otherAge) {
		if (age > otherAge) {
			return true;
		} else {
			return false;
		}

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void hadBirthday() {
		age++;
	}

    public int getImmuneStrength()
  {
    return immuneStrength;
  }

  public int getChanceOfDisease()
  {
    return chanceOfDisease;
  }

  public int getWealth()
  {
    return wealth;
  }

  public boolean getDiseases()
  {
    return disease;
  }

}