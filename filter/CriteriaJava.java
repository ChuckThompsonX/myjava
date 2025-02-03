package filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaJava implements Criteria {

   @Override
   public List<Developer> meetCriteria(List<Developer> developers) {
      List<Developer> malePersons = new ArrayList<Developer>(); 
      
      for (Developer developer : developers) {
         if(developer.getLanguage().equalsIgnoreCase("JAVA")){
            malePersons.add(developer);
         }
      }
      return malePersons;
   }
}
