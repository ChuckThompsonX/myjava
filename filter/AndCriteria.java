package filter;

import java.util.List;

public class AndCriteria implements Criteria {

   private Criteria criteria;
   private Criteria otherCriteria;

   public AndCriteria(Criteria criteria, Criteria otherCriteria) {
      this.criteria = criteria;
      this.otherCriteria = otherCriteria; 
   }

   @Override
   public List<Developer> meetCriteria(List<Developer> developers) {
   
      List<Developer> firstCriteriaPersons = criteria.meetCriteria(developers);		
      return otherCriteria.meetCriteria(firstCriteriaPersons);
   }
}
