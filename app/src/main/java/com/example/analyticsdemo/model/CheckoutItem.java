package com.example.analyticsdemo.model;

import java.util.List;

public class CheckoutItem {
    private String flightType;
    private String travelClass;
    private String origin;
    private String destination;
    private int adultCount;
    private int childCount;
    private int infantCount;
    private int numberOfPassengers;
    private String coupon;
    private String fareMode;
    private String advBookingDays;
    private String checkoutStep;
    private String posCurrency;
    private String viewInCurrency;
    private String finalCurrency;
    List<Item> items;

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getAdultCount() {
        return adultCount;
    }

    public void setAdultCount(int adultCount) {
        this.adultCount = adultCount;
    }

    public int getChildCount() {
        return childCount;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    public int getInfantCount() {
        return infantCount;
    }

    public void setInfantCount(int infantCount) {
        this.infantCount = infantCount;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public String getFareMode() {
        return fareMode;
    }

    public void setFareMode(String fareMode) {
        this.fareMode = fareMode;
    }

    public String getAdvBookingDays() {
        return advBookingDays;
    }

    public void setAdvBookingDays(String advBookingDays) {
        this.advBookingDays = advBookingDays;
    }

    public String getCheckoutStep() {
        return checkoutStep;
    }

    public void setCheckoutStep(String checkoutStep) {
        this.checkoutStep = checkoutStep;
    }

    public String getPosCurrency() {
        return posCurrency;
    }

    public void setPosCurrency(String posCurrency) {
        this.posCurrency = posCurrency;
    }

    public String getViewInCurrency() {
        return viewInCurrency;
    }

    public void setViewInCurrency(String viewInCurrency) {
        this.viewInCurrency = viewInCurrency;
    }

    public String getFinalCurrency() {
        return finalCurrency;
    }

    public void setFinalCurrency(String finalCurrency) {
        this.finalCurrency = finalCurrency;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
