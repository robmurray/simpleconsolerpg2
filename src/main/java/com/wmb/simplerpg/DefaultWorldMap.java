package com.wmb.simplerpg;

/**
 * Created by rob on 7/9/15.
 */
public class DefaultWorldMap implements MapContainerInterface{

    private int maxX;

    private int maxY;

    private String[] map =
            {       "p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p",
                    "p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p",
                    "p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p",
                    "p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p",
                    "p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p",
                    "p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p",
                    "p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p",
                    "p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p",
                    "p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p",
                    "p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p",
                    "p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p",
                    "p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p",
                    "p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p",
                    "p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p",
                    "p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p",
                    "p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p",
                    "p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p",
                    "p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p",
                    "p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p",
                    "p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p",
            };

    public DefaultWorldMap(){
        maxY=map.length;
        maxX = map[0].length();
    }


    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    @Override
    public String[] retrieveMap() {
        return map;
    }
}
