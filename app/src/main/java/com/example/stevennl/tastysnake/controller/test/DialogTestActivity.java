package com.example.stevennl.tastysnake.controller.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.stevennl.tastysnake.R;
import com.example.stevennl.tastysnake.util.CommonUtil;

public class DialogTestActivity extends AppCompatActivity {
    private static final String TAG = "DialogTestActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diaglog_test);
        Button btn = (Button) findViewById(R.id.dialog_test_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommonUtil.showToast(DialogTestActivity.this, "Click");
            }
        });
    }
}
