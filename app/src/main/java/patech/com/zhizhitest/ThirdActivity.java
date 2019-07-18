package patech.com.zhizhitest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent intent_accept = getIntent();
        Bundle bundle = intent_accept.getExtras();
        String name = bundle.getString("name");
        int age = bundle.getInt("age");
        Log.i("3rdActivity",name+" "+age);
    }

}
