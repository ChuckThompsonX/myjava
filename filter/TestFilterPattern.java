package filter;

import java.util.ArrayList;
import java.util.List;

public class TestFilterPattern {
	   public static void main(String[] args) {
	      List<Developer> developers = new ArrayList<Developer>();

	      developers.add(new Developer("Robert","JAVA", "10"));
	      developers.add(new Developer("John", "CPP", "8"));
	      developers.add(new Developer("Laura", "RUBY", "10"));
	      developers.add(new Developer("Diana", "JAVA", "4"));
	      developers.add(new Developer("Mike", "JAVA", "20"));
	      developers.add(new Developer("Bobby", "CPP", "10"));

	      Criteria java = new CriteriaJava();
	      Criteria cpp = new CriteriaCpp();
	      Criteria ruby = new CriteriaRuby();
	      
	      Criteria experience = new CriteriaExperience();
	      Criteria expAndJava = new AndCriteria(experience, java);
	      Criteria expOrCpp = new OrCriteria(experience, cpp);
	      Criteria expAndRuby = new AndCriteria(experience, ruby);

	      System.out.println("Java: ");
	      printPersons(java.meetCriteria(developers));

	      System.out.println("\nCpp: ");
	      printPersons(cpp.meetCriteria(developers));

	      System.out.println("\nRuby: ");
	      printPersons(ruby.meetCriteria(developers));

	      System.out.println("\nExp and Java: ");
	      printPersons(expAndJava.meetCriteria(developers));

	      System.out.println("\nExp or Cpp: ");
	      printPersons(expOrCpp.meetCriteria(developers));

	      System.out.println("\nExp and Ruby: ");
	      printPersons(expAndRuby.meetCriteria(developers));
	   }

	   public static void printPersons(List<Developer> developers){
	   
	      for (Developer developer : developers) {
	         System.out.println("Developer : [ Name : " + developer.getName() + ", Language : " + developer.getLanguage() + ", Experience : " + developer.getExperience() + " ]");
	      }
	   }      
	}
