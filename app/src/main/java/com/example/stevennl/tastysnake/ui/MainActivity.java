package com.example.stevennl.tastysnake.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.stevennl.tastysnake.R;
import com.example.stevennl.tastysnake.ui.game.GameActivity;
import com.example.stevennl.tastysnake.ui.test.BluetoothTestActivity;
import com.example.stevennl.tastysnake.ui.test.DrawableGridTestActivity;
import com.example.stevennl.tastysnake.ui.test.PacketTestActivity;
import com.example.stevennl.tastysnake.ui.test.SensorTestActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBtns();
    }

    private void initBtns() {
        Button bluetoothBtn = (Button) findViewById(R.id.main_bluetooth_test_btn);
        bluetoothBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BluetoothTestActivity.class));
            }
        });

        Button drawableGridBtn = (Button) findViewById(R.id.main_drawableGrid_test_btn);
        drawableGridBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DrawableGridTestActivity.class));
            }
        });

        Button sensorBtn = (Button) findViewById(R.id.main_sensor_test_btn);
        sensorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SensorTestActivity.class));
            }
        });

        Button pktBtn = (Button) findViewById(R.id.main_pkt_test_btn);
        pktBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PacketTestActivity.class));
            }
        });

        Button gameBtn = (Button) findViewById(R.id.main_game_btn);
        gameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, GameActivity.class));
            }
        });
    }
}
