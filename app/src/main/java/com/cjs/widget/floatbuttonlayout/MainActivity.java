package com.cjs.widget.floatbuttonlayout;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    FloatButtonLayout mFloatButtonLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFloatButtonLayout=findViewById(R.id.fbl);
        mFloatButtonLayout.setAllowMoveBeyondScreen(false);
    }
}
