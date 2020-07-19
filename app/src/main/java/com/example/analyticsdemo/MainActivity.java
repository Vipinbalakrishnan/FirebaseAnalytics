package com.example.analyticsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;

import com.example.analyticsdemo.Util.FireBaseUtil;
import com.example.analyticsdemo.Util.creator.CheckoutItemCreator;
import com.example.analyticsdemo.Util.creator.ObjectCreator;
import com.example.analyticsdemo.model.CheckoutItem;
import com.example.analyticsdemo.model.Item;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private FirebaseAnalytics analytics;
    private ObjectCreator<CheckoutItem> objectCreator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        analytics = FirebaseAnalytics.getInstance(MainActivity.this);
        objectCreator = new CheckoutItemCreator();
    }

    public void onFireEvent(View view) {
        logCheckoutEvent();
    }

    private void logCheckoutEvent() {
        analytics.logEvent("checkout_progress", getCheckoutBundle());
    }

    private Bundle getCheckoutBundle() {
        CheckoutItem checkoutItem = objectCreator.createObject();
        Bundle bundle = new Bundle();

        if(null != checkoutItem) {
            bundle.putString("flight_type", checkoutItem.getFlightType());
            bundle.putString("travel_class", checkoutItem.getTravelClass());
            bundle.putString("origin", checkoutItem.getOrigin());
            bundle.putString("destination", checkoutItem.getDestination());
            bundle.putString("adult_count", String.valueOf(checkoutItem.getAdultCount()));
            bundle.putString("child_count", String.valueOf(checkoutItem.getChildCount()));
            bundle.putString("infant_count", String.valueOf(checkoutItem.getInfantCount()));
            bundle.putString("number_of_passengers", String.valueOf(checkoutItem.getNumberOfPassengers()));

            bundle.putString("coupon", checkoutItem.getCoupon());
            bundle.putString("fare_mode", checkoutItem.getFareMode());
            bundle.putString("adv_booking_days", checkoutItem.getAdvBookingDays());
            bundle.putString("checkout_step", checkoutItem.getCheckoutStep());

            bundle.putString("POSCurrency", checkoutItem.getPosCurrency());
            bundle.putString("ViewinCurrency", checkoutItem.getViewInCurrency());
            bundle.putString("FinalCurrency", checkoutItem.getFinalCurrency());

            if (null != checkoutItem.getItems() && !checkoutItem.getItems().isEmpty()) {
                bundle.putLong("Item_count", checkoutItem.getItems().size());
                bundle.putParcelableArrayList( "items", FireBaseUtil.getEcommerceItemArray(checkoutItem.getItems()));
                /** Tried the following methods too. */
//                bundle.putParcelableArray( "items", FireBaseUtil.getEcommerceParcelableItems(checkoutItem.getItems()));
//                bundle.putString( "items", new Gson().toJson(FireBaseUtil.getEcommerceItemArray(response.getSelectedFlights(), itemCategory, response.getSearchRequest())));
            }
        }
        return bundle;
    }
}