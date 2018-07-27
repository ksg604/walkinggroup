package com.example.walkingschoolbus.model;


import android.graphics.Color;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class EarnedRewards {

    private boolean[][] stickers = new boolean[7][7];
//    private String title = "Dragon slayer";
//    private List<File> possibleBackgroundFiles = new ArrayList<>();
//    private Integer selectedBackground = 1;
//    private Integer titleColor = Color.BLUE;

    // Needed for JSON deserialization
    public EarnedRewards() {
    }

    public boolean[][] getStickers(){
        return stickers;
    }

    public void setStickers(boolean[][] newStickers){
        this.stickers = newStickers;
    }

    @Override
    public String toString() {
        return "EarnedRewards{" +
                "stickers='" + stickers +
                '}';
    }
}
