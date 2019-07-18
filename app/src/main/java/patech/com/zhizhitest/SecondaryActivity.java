package patech.com.zhizhitest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        Intent intent_accept = getIntent();
        Bundle bundle = intent_accept.getExtras();
        String name = bundle.getString("name");
        int age = bundle.getInt("age");
        Log.i("SecondaryActivity",name+" "+age);
    }

}
