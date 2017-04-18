package com.example.kathrynl.datepickerdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.widget.TextView;
import android.view.View;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import android.widget.Button;
import android.widget.DatePicker;
import android.view.View.OnClickListener;
import android.app.DatePickerDialog;

public class DatePickerDialogDemo extends AppCompatActivity {
    private TextView showdate;
    private Button setdate;
    private int year;
    private int month;
    private int day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker_dialog);
        showdate=(TextView)this.findViewById(R.id.showtime);
        setdate=(Button)this.findViewById(R.id.setdate);
        Calendar c =Calendar.getInstance(Locale.CHINA);
        Date mydate = new Date();
        c.setTime(mydate);
        year=c.get(Calendar.YEAR);
        month=c.get(Calendar.MONTH);
        day=c.get(Calendar.DAY_OF_MONTH);
        showdate.setText("当前日期："+year+"-"+(month+1)+"-"+day);
        setdate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog my_datePickerDialog = new DatePickerDialog(
                        DatePickerDialogDemo.this,DateListener,year,month,day);
               DatePicker datePicker= my_datePickerDialog.getDatePicker();
                datePicker.setMaxDate(new Date().getTime());
                my_datePickerDialog.show();

            }
        });
    }
    private DatePickerDialog.OnDateSetListener DateListener = new DatePickerDialog.OnDateSetListener(){
        public void onDateSet(DatePicker v,int y,int m,int d){
            year =y;
            month =m;
            day =d;
            updateDate();
        }
        private void updateDate(){
            showdate.setText("当前日期："+year+"-"+(month+1)+"-"+day);
        }
    };
}
