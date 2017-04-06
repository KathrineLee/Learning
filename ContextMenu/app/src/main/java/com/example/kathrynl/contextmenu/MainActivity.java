package com.example.kathrynl.contextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=new TextView(this);
        tv.setText("长按");
        registerForContextMenu(tv);
        setContentView(tv);
    }

    public boolean onContextItemSelected(MenuItem item){
        super.onContextItemSelected(item);
        switch(item.getItemId()){
            case 1:
                break;
            case 2:
                break;
        }
        return super.onContextItemSelected(item);
    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        menu.add(0,1,1,R.string.news);
        menu.add(0,2,2,R.string.open);
        super.onCreateContextMenu(menu,v,menuInfo);
    }
}
