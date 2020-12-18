package com.samsung.itschool.fioexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText fio;
    Button writeButton;
    TextView surname, name, secondName;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fio =           findViewById(R.id.fio);
        writeButton =   findViewById(R.id.write);
        name =          findViewById(R.id.name);
        surname =       findViewById(R.id.surname);
        secondName =    findViewById(R.id.secondName);

        writeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                class DivideString{
                    String s;
                    //String []divS;
                    public DivideString(String s){
                        this.s = s;
                    }
                    public String [] divide(){
                        return s.split("");
                    }
                }
                DivideString s = new DivideString(fio.getText().toString());
                surname.append(s.divide()[0]);
                name.append(s.divide()[1]);
                secondName.append(s.divide()[2]);
            }
        });


    }
}
