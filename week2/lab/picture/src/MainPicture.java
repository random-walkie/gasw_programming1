public class MainPicture {

    public static void main(String[] args) {

        // Task 2.1-3: Create a picture and draw it.
	    Picture picture1 = new Picture();
        picture1.draw();

    }

    private static void pause() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
    }
}
