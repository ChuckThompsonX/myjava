package filter;

import java.util.List;

public class OrCriteria implements Criteria {

   private Criteria criteria;
   private Criteria otherCriteria;

   public OrCriteria(Criteria criteria, Criteria otherCriteria) {
      this.criteria = criteria;
      this.otherCriteria = otherCriteria; 
   }

   @Override
   public List<Developer> meetCriteria(List<Developer> developers) {
      List<Developer> firstCriteriaItems = criteria.meetCriteria(developers);
      List<Developer> otherCriteriaItems = otherCriteria.meetCriteria(developers);

      for (Developer developer : otherCriteriaItems) {
         if(!firstCriteriaItems.contains(developer)){
            firstCriteriaItems.add(developer);
         }
      }	
      return firstCriteriaItems;
   }
}
