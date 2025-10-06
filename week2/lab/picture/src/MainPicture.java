public class MainPicture {

    public static void main(String[] args) {

        // Task 2.1-3: Create a picture and draw it.
	    Picture picture1 = new Picture();
        picture1.draw();
        // Task 2.4-5: Change the colour of the picture.
        pause();
        picture1.setBlackAndWhite();

    }

    private static void pause() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
    }
}
