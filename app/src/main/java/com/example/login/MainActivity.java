package com.example.login;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @SuppressLint("SetTextI18n")
    public void onSubmit(View view) {
        EditText name = findViewById(R.id.username);
        EditText pass = findViewById(R.id.password);

        TextView tv1 =(TextView) findViewById(R.id.textView1);
        TextView tv2 =(TextView) findViewById(R.id.textView2);

        tv1.setText("Name: " + (CharSequence) name.getText());
        tv2.setText("Password: " + (CharSequence) pass.getText());
    }

    public void onReset(View view) {
        EditText name = findViewById(R.id.username);
        EditText pass = findViewById(R.id.password);

        TextView tv1 = (TextView) findViewById(R.id.textView1);
        TextView tv2 =(TextView) findViewById(R.id.textView2);

        tv1.setText("");
        tv2.setText("");
        name.setText("");
        pass.setText("");
    }

    public void onNextLab(View view) {
        Intent intent = new Intent(MainActivity.this, Hungry.class);
        startActivity(intent);
    }
}