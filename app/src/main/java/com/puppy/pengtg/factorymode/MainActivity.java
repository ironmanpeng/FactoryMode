package com.puppy.pengtg.factorymode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mTest = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTest = (Button)findViewById(R.id.test);
        mTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AudiFactory factory = new AudiCarFactory();

                AudiQ3 audiQ3 = factory.createAudiCar(AudiQ3.class);
                audiQ3.drive();
                audiQ3.selfNavigation();

                AudiQ5 audiQ5 = factory.createAudiCar(AudiQ5.class);
                audiQ5.drive();
                audiQ5.selfNavigation();

                AudiQ7 audiQ7 = factory.createAudiCar(AudiQ7.class);
                audiQ7.drive();
                audiQ7.selfNavigation();
            }
        });
    }
}
