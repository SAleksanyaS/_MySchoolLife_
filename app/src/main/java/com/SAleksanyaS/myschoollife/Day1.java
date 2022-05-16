package com.SAleksanyaS.myschoollife;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Day1 extends AppCompatActivity {
    Dialog dialog, dialog_test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);

        // создаем диалоговое окно (Начало)
        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);     // скрыть заголовок кода
        dialog.setContentView(R.layout.privie);   // путь к диалоговому окну
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable((Color.TRANSPARENT))); // прозрачный фон
        dialog.setCancelable(false); // окно нельзя закрыть назад
        dialog.show(); // показать диалоговое окно

        //кнопка
        TextView btclose = (TextView) dialog.findViewById(R.id.btclose);
        btclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Day1.this, DaysAndParts.class);
                    startActivity(intent);finish();
                }catch (Exception e){
                }
                dialog.dismiss();
            }
        });
        Button btncont = (Button)dialog.findViewById(R.id.btnnext);
        btncont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        // создаем диалоговое окно (Конец)




















    }
    // Системная Кнопка "Назад" (Начало)
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(Day1.this, DaysAndParts.class);   //переход с одной активити к дпугой
            startActivity(intent);finish();

        } catch (Exception ignored) {
        }
    }
    // Системная Кнопка "Назад" (Конец)
}