package jordan.tutorials.gammerRunnertutorial.Bussiness.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BussinessLogic {
        @Autowired
        private DataService dataService;
        public BussinessLogic(DataService dataService){
            super();
            System.out.printf("Constructor Injection");
            this.dataService = dataService;
        }
        public Integer calculateSum(){
            List<Integer> data = dataService.getData();
            return data.stream().reduce(Integer::sum).get();
        }

}
