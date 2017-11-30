package com.animeshjain.assignment94;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView helloWorldTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloWorldTxt=(TextView)findViewById(R.id.helloWorldTxt);
//        Registering the View inthis case TextView to the ContextMenu inorder to open ContextMenu on Tap and Hold
        registerForContextMenu(helloWorldTxt);
    }

//    Creating ContextMenu using onCreateContextMenu method
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//        Inflating the Menu form the XML
        getMenuInflater().inflate(R.menu.context_menu, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

//    Setting action on the MenuItem(s) of the ContextMenu
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.option1:{
                Toast.makeText(this, "You just selected the "+ item.toString()+" option", Toast.LENGTH_SHORT).show();
            }break;
            case R.id.option2:{
                Toast.makeText(this, "You just selected the "+ item.toString()+" option", Toast.LENGTH_SHORT).show();
            }break;
            case R.id.option3:{
                Toast.makeText(this, "You just selected the "+ item.toString()+" option", Toast.LENGTH_SHORT).show();
            }break;
            case R.id.option4:{
                Toast.makeText(this, "You just selected the "+ item.toString()+" option", Toast.LENGTH_SHORT).show();
            }break;
        }
        return super.onContextItemSelected(item);
    }
}
