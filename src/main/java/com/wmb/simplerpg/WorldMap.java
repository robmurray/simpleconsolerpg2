package com.wmb.simplerpg;

import com.wmb.simplerpg.gameobject.GameObjectInterface;
import com.wmb.simplerpg.tile.Tile;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

/**
 * Created by rob on 7/6/15.
 */
public class WorldMap {


    // the instantiated world map
    private Tile[][] map;

    private int maxX;

    private int maxY;

    // stores the game objects in play
    private List<GameObjectInterface> activeGameObjects;

    // used for semi random stuff
    private Random rand = new Random();

    private WorldMap() {

    }

    public WorldMap(int maxX, int maxY,Tile[][] map,List<GameObjectInterface> activeGameObjects) {
        this.maxX = maxX;
        this.maxY = maxY;
        this.map =map;
        this.activeGameObjects=activeGameObjects;
    }


    public ActionResponse pcAction(Control nav) {
        return null;
    }

    private String mapToString() {
        return null;
    }

    private void movePC(int x, int y) throws EdgeOfTheWorldException, ImpassableTerrainException {
    }

    private void liftFogOfWar() {

    }

    private int randomInt(int min, int max) {
        return rand.nextInt((max - min) + 1) + min;
    }

}
