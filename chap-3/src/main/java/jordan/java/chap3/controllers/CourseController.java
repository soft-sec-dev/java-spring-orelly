package jordan.java.chap3.controllers;

// Our Classes
import jordan.java.chap3.Courses.Course;

// From Spring
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Java utils
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn Aws", "Jordan"),
                new Course(1, "Learn Aws", "Jordan")
        );
    }
}
