package com.example.stevennl.tastysnake.ui.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.PhoneAccount;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.stevennl.tastysnake.R;
import com.example.stevennl.tastysnake.model.Direction;
import com.example.stevennl.tastysnake.model.Packet;

public class PacketTestActivity extends AppCompatActivity {
    private TextView infoTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_packet_test);
        infoTxt = (TextView) findViewById(R.id.packet_test_infoTxt);
        Button btn = (Button) findViewById(R.id.packet_test_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoTxt.setText("");
                Packet[] pkts = new Packet[8];
                pkts[0] = Packet.food(0, 8, true);
                pkts[1] = Packet.food(35, 10, false);
                pkts[2] = Packet.direction(Direction.UP);
                pkts[3] = Packet.direction(Direction.DOWN);
                pkts[4] = Packet.direction(Direction.LEFT);
                pkts[5] = Packet.direction(Direction.RIGHT);
                pkts[6] = Packet.direction(Direction.NONE);
                pkts[7] = Packet.swap();
                for (Packet pkt : pkts) {
                    byte[] raw = pkt.toBytes();
                    Packet newPkt = new Packet(raw);
                    infoTxt.append(newPkt.toString() + " Bytes: " + raw.length + "\n\n");
                }
            }
        });
    }
}
