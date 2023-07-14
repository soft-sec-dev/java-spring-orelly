package jordan.tutorials.gammerRunnertutorial.Bussiness.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {
    @Autowired
    private BussinessLogic bussinessLogic;

    public MyWebController(BussinessLogic bussinessLogic){
        this.bussinessLogic = bussinessLogic;
    }

    public long returnValueFromBussinesServuce(){
        return bussinessLogic.calculateSum();
    }
}