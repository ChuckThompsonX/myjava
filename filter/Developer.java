package filter;

public class Developer {

	private String name;
	private String language;
	private String experience;

	public Developer(String name, String language, String experience) {
		this.name = name;
		this.language = language;
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public String getLanguage() {
		return language;
	}

	public String getExperience() {
		return experience;
	}
}
