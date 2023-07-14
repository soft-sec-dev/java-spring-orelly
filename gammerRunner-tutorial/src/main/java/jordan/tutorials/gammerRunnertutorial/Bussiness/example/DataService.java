package jordan.tutorials.gammerRunnertutorial.Bussiness.example;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataService {
    public List<Integer> getData(){
        return Arrays.asList(10,20,30,40);
    }
}
