package com.wmb.simplerpg.tile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rob on 7/10/15.
 */
public class TileFactory {

    static final Map<Character, TileType> KEY_MAPPINGS = new HashMap<Character, TileType>() {{
        put('p', TileType.PLAIN);
        put('l', TileType.LAKE);
        put('m', TileType.MOUNTAIN);
    }};


    public static Tile createTile(Character tileType) throws InvalidTileTypeException {
        if (tileType == null) {
            throw new InvalidTileTypeException("tileType is null");
        }

        TileType tt = KEY_MAPPINGS.get(tileType);

        if (tt == null) {
            throw new InvalidTileTypeException("unknown tile type: " + tileType);
        }

        return new Tile(KEY_MAPPINGS.get(tileType));

    }


}
