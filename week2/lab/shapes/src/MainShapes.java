public class MainShapes {
    public static void main(String[] args) {
        // Create a circle and make it visible.
        Circle circle1 = new Circle();
        circle1.makeVisible();

        // Create a square and make it visible.
        Square square1 = new Square();
        square1.makeVisible();

        // Task 1.8: Call moveDown method of circle1
        circle1.moveDown();

        // Task 1.9: Call moveRight method of circle1 twice
        circle1.moveRight();
        circle1.moveRight();

        // Task 1.10: Call moveHorizontal method of square1
        square1.moveHorizontal(100);

        // Task 1.11: Move the square 10 pixels down and 50 pixels to the left,
        // with one method call for each
        square1.moveVertical(-10);
        square1.moveHorizontal(-50);

        // Task 1.12: Change the color of circle1 to green
        circle1.changeColor("green");

        // Task 1.13: Create a new circle and make it visible.
        Circle circle2 = new Circle();
        circle2.makeVisible();

        // Task 1.14: Print the details of objects
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(square1);

    }
}