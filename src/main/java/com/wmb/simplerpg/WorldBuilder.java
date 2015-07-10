package com.wmb.simplerpg;

import com.wmb.simplerpg.gameobject.GameObjectFactory;
import com.wmb.simplerpg.gameobject.GameObjectInterface;
import com.wmb.simplerpg.gameobject.InvalidGameObjectTypeException;
import com.wmb.simplerpg.map.MapContainerInterface;
import com.wmb.simplerpg.tile.InvalidTileTypeException;
import com.wmb.simplerpg.tile.Tile;
import com.wmb.simplerpg.tile.TileFactory;
import com.wmb.simplerpg.tile.TileType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

/**
 * Created by rob on 7/10/15.
 */
public class WorldBuilder {

    private static final Tile DEFAULT_TILE = new Tile(TileType.PLAIN);

    public static final Tile buildTileFromToken(String tileToken, List<GameObjectInterface> activeObjects) {
        Tile theBuiltTile = null;
        if(activeObjects ==null){
            throw new RuntimeException("active objects must be instantiated before method call");
        }

        if(tileToken == null || tileToken.trim().equals("")){
            return DEFAULT_TILE;
        }
        char tokenPart = ' ';

        // parse the token
        int length = tileToken.length();


        // 1. first part is tile type
        char[]tokenPartArray =tileToken.toCharArray();
        tokenPart = tokenPartArray[0];
        try {
            theBuiltTile =TileFactory.createTile(new Character(tokenPart));
        } catch (InvalidTileTypeException e) {
            // log and created default tile for now
            // TODO add in meaninful handling
            theBuiltTile= DEFAULT_TILE;
        }
        if(length<2){
            // all done
            return theBuiltTile;
        }

        // 2. remain characters are game objects
        GameObjectInterface goi=null;
        for(int index=1;index<length;index++) {
            tokenPart = tokenPartArray[index];
            try {
                goi =GameObjectFactory.createGameObject(new Character(tokenPart));
                goi.setGameObjectID(activeObjects.size());
                theBuiltTile.addGameObject(goi);
                activeObjects.add(goi);
            } catch (InvalidGameObjectTypeException e) {
                // log and ignore for now
                // TODO add in meaningful handling
            }
        }

        return theBuiltTile;
    }

    public static final WorldMap buildMap(MapContainerInterface mapContainer){

        Tile[][] map;
        int maxX;
        int maxY;
        List<GameObjectInterface> activeGameObjects;
        Random rand = new Random();

        // TODO validate mapContainer

        // init
        maxX=mapContainer.getMaxX();
        maxY=mapContainer.getMaxY();
        map = new Tile[maxX][maxY];
        activeGameObjects = new ArrayList<GameObjectInterface>();

        Tile wrkTile = null;

        String[] mapArray = mapContainer.retrieveMap();
        StringTokenizer st = null;
        int colIndex = 0;
        for (int rowIndex = 0; rowIndex < maxX; rowIndex++) {

            st = new StringTokenizer(mapArray[rowIndex]);

            while (st.hasMoreTokens()) {
                wrkTile = WorldBuilder.buildTileFromToken(st.nextToken(), activeGameObjects);
                map[rowIndex][colIndex++] = wrkTile;
            }
        }

        WorldMap wm = new WorldMap(maxX,maxY,map,activeGameObjects);

        return wm;
    }

}
