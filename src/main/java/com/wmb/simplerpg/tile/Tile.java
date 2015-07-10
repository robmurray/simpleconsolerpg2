package com.wmb.simplerpg.tile;

import com.wmb.simplerpg.AsciiTextureConstant;
import com.wmb.simplerpg.gameobject.GameObjectInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rob on 7/6/15.
 */
public class Tile {

    private TileType type;
    private boolean visited;
    private String asciiTexture;
    private String imageTextureFileName;
    private int baseMovementPenalty;

    private List<GameObjectInterface> gameObjects = new ArrayList<GameObjectInterface>();

    public Tile() {
        this.type=TileType.PLAIN;
        this.asciiTexture= AsciiTextureConstant.PLAIN;
    }

    public Tile(TileType type) {
        this.type = type;
    }



    public TileType getType() {
        return type;
    }

    public void setType(TileType type) {
        this.type = type;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getAsciiTexture() {
        return asciiTexture;
    }

    public void setAsciiTexture(String asciiTexture) {
        this.asciiTexture = asciiTexture;
    }

    public String getImageTextureFileName() {
        return imageTextureFileName;
    }

    public void setImageTextureFileName(String imageTextureFileName) {
        this.imageTextureFileName = imageTextureFileName;
    }

    public int getBaseMovementPenalty() {
        return baseMovementPenalty;
    }

    public void setBaseMovementPenalty(int baseMovementPenalty) {
        this.baseMovementPenalty = baseMovementPenalty;
    }

    public List<GameObjectInterface> getGameObjects() {
        return gameObjects;
    }

    public void setGameObjects(List<GameObjectInterface> gameObjects) {
        this.gameObjects = gameObjects;
    }

    public void addGameObject(GameObjectInterface go){
        if(go !=null) {
            this.gameObjects.add(go);
        }
    }
    public void removeGameObject(GameObjectInterface go){
        if(go!=null){
            this.gameObjects.remove(go);
        }
    }


}
