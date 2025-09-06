package com.example.sensortest;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        if(sensorManager!= null){
            Sensor acSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
            Sensor pxSensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
            Sensor alSensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);

            if (acSensor!=null){
                sensorManager.registerListener(this, acSensor, sensorManager.SENSOR_DELAY_NORMAL);
            }

            if (pxSensor!= null){
                sensorManager.registerListener(this, pxSensor, sensorManager.SENSOR_DELAY_NORMAL);
            }

            if (alSensor!=null){
                sensorManager.registerListener(this, alSensor, sensorManager.SENSOR_DELAY_NORMAL);
            }
        }

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType()==Sensor.TYPE_ACCELEROMETER){
            ((TextView)findViewById(R.id.accVal)).setText("X: "+event.values[0]+"\nY: "+event.values[1]+"\nZ: "+event.values[2]);
        }

        if (event.sensor.getType()==Sensor.TYPE_PROXIMITY){
            ((TextView)findViewById(R.id.pxVal)).setText("->>"+event.values[0]);
        }

        if (event.sensor.getType()==Sensor.TYPE_LIGHT){
            ((TextView)findViewById(R.id.alVal)).setText("->>"+event.values[0]);
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}