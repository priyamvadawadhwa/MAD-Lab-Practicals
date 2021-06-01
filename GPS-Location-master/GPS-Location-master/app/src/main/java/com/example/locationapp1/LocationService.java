package com.example.locationapp1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LocationService extends Service {
    public LocationService(){

    }

    @Override
    public IBinder onBind(Intent intent){
        throw new UnsupportedOperationException("Not Yet Implemented");
    }
}
