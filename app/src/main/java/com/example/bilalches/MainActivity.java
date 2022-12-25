package com.example.bilalches;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    Cat myCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCat = new Cat(4,"Puma","Yaz","gray");
        myCat.talk();

        Cat murzik = new Cat(2,"Murza","Karas","blue");
        murzik.talk();

        Cat glasha = new Cat();
        glasha.age = 1;
        glasha.name = "Glasha";
    }
}