package com.example.analyticsdemo.Util;

import android.os.Bundle;
import android.os.Parcelable;

import com.example.analyticsdemo.model.Item;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.ArrayList;
import java.util.List;

public class FireBaseUtil {

    public static Bundle getEcommerceItemBundle(Item item) {
        Bundle product = new Bundle();
        product.putString( FirebaseAnalytics.Param.ITEM_ID, item.getId()); // ITEM_ID or ITEM_NAME is required
        product.putString( FirebaseAnalytics.Param.ITEM_NAME, item.getName());
        product.putString( FirebaseAnalytics.Param.ITEM_CATEGORY, item.getCategory());
        product.putString( FirebaseAnalytics.Param.ITEM_VARIANT, item.getVariant());
        product.putString( FirebaseAnalytics.Param.ITEM_BRAND, item.getBrand());
        product.putDouble( FirebaseAnalytics.Param.PRICE, item.getPrice());
        product.putString( FirebaseAnalytics.Param.CURRENCY, item.getCurrency()); // Item-level currency unused today
        product.putLong( FirebaseAnalytics.Param.QUANTITY, item.getQuantity());
        return product;
    }

    public static ArrayList<Bundle> getEcommerceItemArray(List<Item> items) {
        ArrayList<Bundle> itemsBundle = new ArrayList<Bundle>();
        try {
            if(null != items && !items.isEmpty()) {
                for (Item item : items) {
                    itemsBundle.add(getEcommerceItemBundle(item));
                }
            }
        } catch(Exception ex) {
        }
        return itemsBundle;
    }

    public static Parcelable[] getEcommerceParcelableItems(List<Item> items) {
        Parcelable[] itemsBundleArray = new Parcelable[items.size()];
        try {
            if(null != items && !items.isEmpty()) {
                for (int i = 0; i < items.size(); i++) {
                    itemsBundleArray[i] = getEcommerceItemBundle(items.get(i));
                }
            }
        } catch(Exception ex) {
        }
        return itemsBundleArray;
    }
}
