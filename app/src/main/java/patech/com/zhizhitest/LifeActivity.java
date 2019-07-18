package patech.com.zhizhitest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class LifeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life);
        Log.i("LifeActivity","onCreate");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("LifeActivity","onDestroy");
    }
    @Override
    protected  void onPause(){
        super.onPause();
        Log.i("LifeActivity","onPause");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("LifeActivity","onRestart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("LifeActivity","onResume");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("LifeActivity","onStart");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("LifeActivity","onStop");
    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
        Log.i("LifeActivity","onWindowFocusChanged");
    }
    @Override
    public void onSaveInstanceState(Bundle outState){
        Log.i("LifeActivity","onSaveInstanceState");
        super.onSaveInstanceState(outState);
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        Log.i("LifeActivity","onRestoreInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
    }
}
