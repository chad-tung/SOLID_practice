package example.codeclan.com.liskov;

/**
 * Created by user on 27/06/2017.
 */

class Circle extends Shape {

    @Override
    public String draw() {
        return "I'm drawing a circle!";
    }
}
