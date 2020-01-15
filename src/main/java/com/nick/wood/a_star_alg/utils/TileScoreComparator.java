package com.nick.wood.a_star_alg.utils;

import com.nick.wood.a_star_alg.map.Tile;

import java.util.Comparator;

public class TileScoreComparator implements Comparator<Tile> {
    @Override
    public int compare(Tile o1, Tile o2) {
        return o1.getScore() - o2.getScore();
    }
}
