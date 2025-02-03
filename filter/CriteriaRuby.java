package filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaRuby implements Criteria {

   @Override
   public List<Developer> meetCriteria(List<Developer> developers) {
      List<Developer> femalePersons = new ArrayList<Developer>(); 
      
      for (Developer developer : developers) {
         if(developer.getLanguage().equalsIgnoreCase("RUBY")){
            femalePersons.add(developer);
         }
      }
      return femalePersons;
   }
}
