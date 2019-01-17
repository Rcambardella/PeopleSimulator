class Person {
	public int age;
	private String name;
    private double immuneStrength;
    private double chanceOfDisease;
    private int wealth;
    private boolean disease;
    private boolean depressed;
    public String diseaseName;
    public double susceptibility;
    public boolean deceased;
	public Person(int age, String name) {
		this.name = name;
		this.age = age;
        this.immuneStrength = Math.random();
        this.chanceOfDisease = Math.random();
        this.susceptibility = Math.random();
        this.diseaseName = " ";
        deceased = false;
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

    public String getDisease() {
		return diseaseName;
	}

	public int getAge() {
		return age;
	}

	public void hadBirthday() {
		age++;
	}

    public double getImmuneStrength()
  {
    return immuneStrength;
  }

  public double getChanceOfDisease()
  {
    return chanceOfDisease;
  }
public double num;
  public void setChanceOfDisease()
  {

      //people.get(i).getImmuneStrength()
      if(immuneStrength <= .3)
      {
      num = (Math.random() * 5) +4;

        chanceOfDisease = num/10;
      }
  }

  public int getWealth()
  {
    return wealth;
  }

  public boolean getDiseases()
  {
    return disease;
  }

  public boolean getDepressed()
  {
    return depressed;
  }

 public boolean isDead(){
		return deceased;
	}

  public void markAsDeceased()
  {
    deceased = true;
  }

}