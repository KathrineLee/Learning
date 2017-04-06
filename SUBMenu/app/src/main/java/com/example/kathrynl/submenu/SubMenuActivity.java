package com.example.kathrynl.submenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SubMenu;
import android.view.Menu;

public class SubMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        SubMenu sub = menu.addSubMenu(R.string.title);
        sub.setIcon(android.R.drawable.ic_menu_search);
        sub.add(0,1,1,R.string.local);
        sub.add(0,2,2,R.string.network);
        return super.onCreateOptionsMenu(menu);
    }
}
