package filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaExperience implements Criteria {

   @Override
   public List<Developer> meetCriteria(List<Developer> developers) {
      List<Developer> singlePersons = new ArrayList<Developer>(); 
      
      for (Developer developer : developers) {
         if(developer.getExperience().equalsIgnoreCase("10")){
            singlePersons.add(developer);
         }
      }
      return singlePersons;
   }
}
