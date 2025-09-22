
/**
 * Write a description of class Movie here.
 *
 * @author Jim
 * @version 1.0
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private String title;
    private int runningTime;
    private int timeReached;
    private boolean playing;

    /**
     * Constructor for objects of class Movie
     */
    public Movie(String title, int runningTime)
    {
        this.title = title;
        this.runningTime = runningTime;
        this.timeReached = 0;
        this.playing = false;
    }
    
    /**
     * Constructor for objects of class Movie
     */
    public Movie()
    {
        this("Some Movie", 100);
    }

    public void play()
    {
        if(!playing)
        {
             playing = true;
             timeReached = 10;
             System.out.println("Playing...");
        }
        else
            System.out.println("Already playing...");
    }
        
    public void stop()
    {
        if(playing)
        {
            playing = false;
            System.out.println("Stopped...");
        }
        else
            System.out.println("Can't stop, not playing...");
    }
    
    public void resume()
    {
        if(!playing)
        {
             playing = true;
             timeReached += 10;
             System.out.println("Playing...");
        }
        else
            System.out.println("Can't resume, currently playing...");
    }

    public String getTitle()
    {
        return title;
    }

    public int getRunningTime()
    {
        return runningTime;
    }
    
    public int getTimeReached()
    {
        return timeReached;
    }

    //overriding the toString() method
    @Override
    public String toString()
    {
        return "***************************" +
                "\nTITLE: " + this.title +
                "\nRUNNING TIME: " + this.runningTime +
                "\nTIME REACHED " + this.timeReached +
                "\nPLAYING " + this.playing +
                "\n***************************";
    }
            
}
