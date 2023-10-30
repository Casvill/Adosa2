package controller;

import model.ModelGame;
import view.ViewStats;

/**
 *
 * @author Daniel Casvill
 */
public final class ControllerStats 
{    
    private final ViewStats viewStats;
    private final ModelGame modelGame;

    public ControllerStats(ViewStats viewStats, ModelGame modelGame) 
    {
        this.modelGame = modelGame;
        this.viewStats = viewStats;
        this.viewStats.setVisible(true);
        this.viewStats.setSize(832, 555);
        initComponents();
    }
    
    public void initComponents()
    {
        viewStats.setJlFailures(modelGame.getFailures());
        viewStats.setJlHits(modelGame.getHits());
        viewStats.setJlScore(modelGame.getScore());
    }
    
    
}
