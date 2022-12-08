package com.careerdevs.hellointernet;

public class Item {

    private int itemNum;
    private String itemName;


    public Item(int itemNum, String itemName) {
        this.itemNum = itemNum;
        this.itemName = itemName;
    }


    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public int getItemNum() {
        return itemNum;
    }

    public String getItemName() {
        return itemName;
    }



}


