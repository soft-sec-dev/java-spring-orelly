package jordan.tutorials.gammerRunnertutorial.Enterprise.Data;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataService {
    public List<Integer> getData(){
        return Arrays.asList(10,20,30,40);
    }
    public List<String> getDataList(){return Arrays.asList("Hola", "Jordan", "comming soon");}
}
