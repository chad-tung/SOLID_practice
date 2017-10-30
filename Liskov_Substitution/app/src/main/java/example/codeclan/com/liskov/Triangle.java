package example.codeclan.com.liskov;

/**
 * Created by user on 27/06/2017.
 */

public class Triangle extends Shape {
    @Override
    public String draw() {
        return "I'm drawing a triangle!";
    }
}
