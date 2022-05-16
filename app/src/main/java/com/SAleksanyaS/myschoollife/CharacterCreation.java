package com.SAleksanyaS.myschoollife;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class CharacterCreation extends AppCompatActivity {
    public static String person_name;
    public static String person_family;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_creation);


        ToggleButton button_Man = (ToggleButton) findViewById(R.id.button_Man);
        button_Man.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)  {
                    // Your code
                } else {
                    // Your code
                }
            }
        });

        // Кнопка "Назад" (Начало)
        Button button_back =(Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(CharacterCreation.this, MainActivity.class);
                    startActivity(intent);finish();

                } catch (Exception e) {
                }
            }
        });
        // Кнопка "Назад" (Конец)


        final EditText editText_name = findViewById(R.id.PersonName);
        editText_name.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event)
            {
                if(event.getAction() == KeyEvent.ACTION_DOWN && (keyCode == KeyEvent.KEYCODE_ENTER))
                {
                    // сохраняем текст, введённый до нажатия Enter в переменную
                    person_name = editText_name.getText().toString();
                    System.out.println(person_name);
                    return true;
                }
                return false;
            }
        }
        );

        final EditText editText_family = findViewById(R.id.PersonFamily);
        editText_family.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event)
            {
                if(event.getAction() == KeyEvent.ACTION_DOWN && (keyCode == KeyEvent.KEYCODE_ENTER))
                {
                    // сохраняем текст, введённый до нажатия Enter в переменную
                    person_family = editText_family.getText().toString();
                    System.out.println(person_family);
                    return true;
                }
                return false;
            }
        }
        );




        // Кнопка "Продолжить" (Начало)
        Button button_next =(Button) findViewById(R.id.button_next);
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(editText_name.getText().toString().trim().equals("") | editText_family.getText().toString().trim().equals("") ){
                        Toast.makeText(CharacterCreation.this, R.string.no_input, Toast.LENGTH_LONG).show();
                    }
                    else {
                        Intent intent = new Intent(CharacterCreation.this, DaysAndParts.class);
                        startActivity(intent);
                        finish();
                    }
                } catch (Exception e) {
                }
            }
        });
        // Кнопка "Продолжить" (Конец)
    }


    // Системная Кнопка "Назад" (Начало)
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(CharacterCreation.this, MainActivity.class);
            startActivity(intent);finish();

        } catch (Exception e) {
        }
    }
    // Системная Кнопка "Назад" (Конец)


}