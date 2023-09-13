package com.example.historicalandtouristicplacerecyclerview;

import java.io.Serializable;

class Places implements Serializable {

    String placeName;
    String placeDetails;
    int placeImage;

    public Places(String placeName,String placeDetails, int placeImage) {
        this.placeName = placeName;
        this.placeDetails = placeDetails;
        this.placeImage = placeImage;
    }
}
