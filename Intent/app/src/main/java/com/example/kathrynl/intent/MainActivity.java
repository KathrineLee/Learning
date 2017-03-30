package com.example.kathrynl.intent;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioButton r1 = null;
    RadioButton r2 = null;
    RadioButton r3 = null;
    RadioButton r4 = null;
    RadioGroup radioGroup = null;
   // RadioButton currentRadioButton=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=(RadioGroup) findViewById(R.id.radioGroup);
        r1 = (RadioButton) findViewById(R.id.on);
        r2 = (RadioButton) findViewById(R.id.at);
        r3 = (RadioButton) findViewById(R.id.of);
        r4 = (RadioButton) findViewById(R.id.in);
        r1.setClickable(true);
       // radioGroup.setOnCheckedChangeListener();
        Button button1 =(Button)findViewById(R.id.Y);
        Button button2 =(Button)findViewById(R.id.N);
        button1.setOnClickListener(new button1());
        button2.setOnClickListener(new button2());

    }
    class button1 implements View.OnClickListener{
        public void onClick(View v){
            String ans=" ";
            if(r1.isChecked()){
                ans="on";
            }
            else if(r2.isChecked()){
                ans="at";
            }
            else if(r3.isChecked()){
                ans="of";
            }
            else if(r4.isChecked()){
                ans="in";
            }
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,otherActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("ans",ans);
            intent.putExtras(bundle);
           // MainActivity.this.startActivity(intent);
           /*if(currentRadioButton.getText().equals("in")){
                setTitle("你选择的答案是正确的");
            }else{
                setTitle("你选择的答案是错误的");
            }*/
            startActivityForResult(intent,0);
        }
    }
    class button2 implements View.OnClickListener{
        public void onClick(View v){
            radioGroup.clearCheck();
            setTitle(" ");
        }
    }
    protected void onActivityResule(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
       /* switch(resultCode){
            case RESULT_OK;*/
        if(requestCode==0 && resultCode==0){
                Bundle bunde=data.getExtras();
                String ans= bunde.getString("ans");
            /*    break;
            default:
                break;*/
        }
    }
}
