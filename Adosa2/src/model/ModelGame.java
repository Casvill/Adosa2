package model;

/**
 *
 * @author Daniel Casvill
 */
public class ModelGame 
{
    private short hits;
    private short failures;
    private int score;
    private byte lives;

    public ModelGame() 
    {
        hits = 0;
        failures = 0;
        score = 0;
        lives = 3;
    }

    public ModelGame(short hits, short failures, int score, byte lives) 
    {
        this.hits = hits;
        this.failures = failures;
        this.score = score;
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

    public int getScore() 
    {
        return score;
    }

    public void setScore(int score) 
    {
        this.score = score;
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
