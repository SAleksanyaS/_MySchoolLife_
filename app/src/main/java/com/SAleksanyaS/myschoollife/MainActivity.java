package com.SAleksanyaS.myschoollife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private long backPressedTime;
    private  Toast backToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Кнопка "Начать игру" (Начало)
        Button buttonStartovoe = (Button)findViewById(R.id.buttonStartovoe);
        buttonStartovoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(MainActivity.this, CharacterCreation.class);
                    startActivity(intent);finish();
                } catch (Exception e) {
                }
            }
        });
        // Кнопка "Начать" (Конец)


        // Кнопка "Воспоминания" (Начало)
        Button button_memory = (Button)findViewById(R.id.button_memory);
        button_memory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(MainActivity.this, DaysAndParts.class);
                    startActivity(intent);finish();

                } catch (Exception e) {
                }
            }
        });
        // Кнопка "Воспоминания" (Конец)


        // Кнопка "Продолжить игру" (Начало)
        Button button_next = (Button)findViewById(R.id.button_next);
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(MainActivity.this, DaysAndParts.class); //////////////////  перенос на дейст уровень
                    startActivity(intent);finish();

                } catch (Exception e) {
                }
            }
        });
        // Кнопка "Продолжить игру" (Конец)


    }



    // Системная Кнопка "Назад" (Начало)
    @Override
    public void onBackPressed(){

        if(backPressedTime + 3000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        } else{
            backToast = Toast.makeText(getBaseContext(), "Нажмите еще раз, чтобы выйти",Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }
    // Системная Кнопка "Назад"  (Конец)

}