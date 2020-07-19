package com.example.analyticsdemo.Util.creator;

import com.example.analyticsdemo.Util.RandomUtil;
import com.example.analyticsdemo.model.CheckoutItem;
import com.example.analyticsdemo.model.Item;

import java.util.ArrayList;
import java.util.List;

public class CheckoutItemCreator implements ObjectCreator<CheckoutItem> {

    @Override
    public CheckoutItem createObject() {
        CheckoutItem checkoutItem = new CheckoutItem();
        checkoutItem.setItems(getItems());
        checkoutItem.setFlightType("OneWay");
        checkoutItem.setTravelClass("Economy");
        checkoutItem.setOrigin("DEL");
        checkoutItem.setDestination("DXB");
        checkoutItem.setAdultCount(5);
        checkoutItem.setChildCount(3);
        checkoutItem.setInfantCount(1);
        checkoutItem.setNumberOfPassengers(9);
        checkoutItem.setCoupon("QGSDUT");
        checkoutItem.setFareMode("Cash");
        checkoutItem.setAdvBookingDays("0");
        checkoutItem.setCheckoutStep("2");
        checkoutItem.setPosCurrency("AED");
        checkoutItem.setViewInCurrency("INR");
        checkoutItem.setFinalCurrency("AED");
        return checkoutItem;
    }

    private List<Item> getItems() {
        int totalItems = RandomUtil.random(4);
        List<Item> items = new ArrayList<>();
        for (int i = 1; i <= totalItems ; i++) {
            items.add(
                    new Item(
                        String.valueOf(RandomUtil.random(2000, 1000)),
                        "Item" + i,
                        "Flight",
                        "Variant" + i,
                        "Brand" + i,
                        RandomUtil.random(5000, 100),
                        "USD",
                        RandomUtil.random(100)
                    )
            );
        }
        return items;
    }
}
