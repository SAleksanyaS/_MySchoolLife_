package com.SAleksanyaS.myschoollife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DaysAndParts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.days);

        // Кнопка "Назад" (Начало)
        Button button_back_a =(Button) findViewById(R.id.button_back_a);
        button_back_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(DaysAndParts.this, MainActivity.class);
                    startActivity(intent);finish();

                } catch (Exception e) {
                }
            }
        });
        // Кнопка "Назад" (Конец)






        // Кнопка "Переход на день 1" (Начало)
        TextView buttondays_1 = (TextView) findViewById(R.id.buttondays_1);
        buttondays_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(DaysAndParts.this, Day1.class);
                    startActivity(intent);finish();
                } catch (Exception e) {
                }
            }
        });
        // Кнопка "Переход на день 1" (Конец)

    }








    // Системная Кнопка "Назад" (Начало)
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(DaysAndParts.this, CharacterCreation.class);
            startActivity(intent);finish();

        } catch (Exception e) {
        }
    }
    // Системная Кнопка "Назад" (Конец)
}