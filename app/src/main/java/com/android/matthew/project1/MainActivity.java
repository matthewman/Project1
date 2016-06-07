package com.android.matthew.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button hi_button;
    private EditText users_input_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hi_button = (Button) findViewById(R.id.hiButton);
        users_input_name = (EditText) findViewById(R.id.userInput);
    }

    public void clickSayHi(View view) {

        String usersname = String.valueOf(users_input_name.getText());

        String response = "Hi " + usersname;

        Toast.makeText(this,response,Toast.LENGTH_SHORT).show();

    }
}
