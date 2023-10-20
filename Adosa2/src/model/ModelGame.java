package model;

/**
 *
 * @author Daniel Casvill
 */
public class ModelGame 
{
    private short hits;
    private short failures;
    private int punctuation;
    private byte lives;

    public ModelGame() 
    {
    
    }

    public ModelGame(short hits, short failures, int punctuation, byte lives) 
    {
        this.hits = hits;
        this.failures = failures;
        this.punctuation = punctuation;
        this.lives = lives;
    }

    public short getHits() 
    {
        return hits;
    }

    public void setHits(short hits) 
    {
        this.hits = hits;
    }

    public short getFailures() 
    {
        return failures;
    }

    public void setFailures(short failures) 
    {
        this.failures = failures;
    }

    public int getPunctuation() 
    {
        return punctuation;
    }

    public void setPunctuation(int punctuation) 
    {
        this.punctuation = punctuation;
    }

    public byte getLives() 
    {
        return lives;
    }

    public void setLives(byte lives) 
    {
        this.lives = lives;
    }                      
}
