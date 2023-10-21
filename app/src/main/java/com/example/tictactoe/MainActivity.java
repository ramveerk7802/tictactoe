package com.example.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
AppCompatButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnreset;
TextView txtview;
String b1,b2,b3,b4,b5,b6,b7,b8,b9;
boolean flage=false,bool =true;
int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                count=0;
                flage=false;
                bool=true;
                txtview.setText("");
            }
        });
    }
    private void init(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnreset = findViewById(R.id.btnreset);
        txtview = findViewById(R.id.txtview);
    }
    public void check(View view){
        AppCompatButton btnCurrent =  (AppCompatButton) view;
        if(btnCurrent.getText().toString().equals("") && bool){
            count++;
            if(flage==false){
                btnCurrent.setText("X");
                flage=!flage;
            }
            else {
                btnCurrent.setText("O");
                flage=!flage;
            }
            // condition
            if(count>4){
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                if(b1.equals(b2) && b2.equals(b3) && !b1.equals("")){
                    txtview.setText(b1+" is winner.");
                    bool=false;
                    return;

                }
                else if(b4.equals(b5) && b5.equals(b6) && ! b4.equals("")){
                    txtview.setText(b4+" is winner.");
                    bool=false;
                    return;

                }
                else if(b7.equals(b8) && b8.equals(b9) && !b7.equals("")){
                    txtview.setText(b7+" is winner.");
                    bool=false;
                    return;

                }
                else if(b1.equals(b4) && b4.equals(b7) && !b1.equals("")){
                    txtview.setText(b1+" is winner.");
                    bool=false;
                    return;

                }
                else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    txtview.setText(b2+" is winner.");
                    bool=false;
                    return;

                }
                else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    txtview.setText(b3+" is winner.");
                    bool=false;
                    return;
                }
                else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    txtview.setText(b1+" is winner.");
                    bool=false;
                    return;

                }
                else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")){
                    txtview.setText(b3+" is winner.");
                    bool=false;
                    return;

                }
                else if(count==9){
                    txtview.setText("Match is Draw.");
                    return;
                }
            }
        }

    }

}