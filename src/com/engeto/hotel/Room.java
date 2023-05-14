package com.engeto.hotel;

public class Room {
    private int roomNumber;
    private int numberOfBeds;
    private int price;
    private boolean gardenView;
    private boolean balcony;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isGardenView() {
        return gardenView;
    }

    public void setGardenView(boolean gardenView) {
        this.gardenView = gardenView;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public Room(int roomNumber, int numberOfBeds, int price, boolean gardenView, boolean balcony) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.gardenView = gardenView;
        this.balcony = balcony;
    }
}
