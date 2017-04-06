package com.example.kathrynl.optionsmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public boolean onCreateOptionsMenu(Menu menu){
    menu.add(0,1,1,"保存");
    menu.add(0,2,2,R.string.exit);
    return super.onCreateOptionsMenu(menu);
}
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==2){
            finish();;
        }
        return super.onContextItemSelected(item);
    }
}
