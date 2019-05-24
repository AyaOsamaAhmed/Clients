package com.aya.app.clients;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by user on 1/1/2019.
 */

public class Clients_Management extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
