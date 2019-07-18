package patech.com.zhizhitest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button2LifeActivity;
    private Button button2ndActivity;
    private Button button3rdActivity;
    private int RequestCode = 1023;
    private Button button4thActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2LifeActivity=(Button)findViewById(R.id.go2LifeActivity);
        button2LifeActivity.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        go2LifeActivity();
                    }
                }
        );
        button2ndActivity=(Button)findViewById(R.id.go2ndActivity);
        button2ndActivity.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        go2ndActivity();
                    }
                }
        );
        button3rdActivity=(Button)findViewById(R.id.go3rdActivity);
        button3rdActivity.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        go3rdActivity();
                    }
                }
        );
        button4thActivity=(Button)findViewById(R.id.go4thActivity);
        button4thActivity.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        go4thActivity();
                    }
                }
        );
    }
    @Override
    protected  void onActivityResult(int requestCode,int resultCode,Intent data){
        if(requestCode == RequestCode &&
                resultCode == FourthActivity.RESULT_CODE){
            Bundle bundle = data.getExtras();
            String name = bundle.getString("name");
            Log.i("mainActivity",name);
        }
    }
    /**
     * 显示意图Intent
     */
    private void go2LifeActivity(){
        Intent toLife= new Intent();
        toLife.setClass(this,LifeActivity.class);
        toLife.putExtra("string","Ricky");
        toLife.putExtra("int",25);
        startActivity(toLife);
    }
    private void go2ndActivity(){
        Intent to2nd= new Intent();
        to2nd.setClass(this,SecondaryActivity.class);
        to2nd.putExtra("name","Ricky");
        to2nd.putExtra("age",25);
        startActivity(to2nd);
    }

    /**
     * 隐式意图
     */
    private void go3rdActivity(){
        Intent to3rd= new Intent();
        //同Manifest.xml
        to3rd.setAction("patech.com.zhizhitest.ThirdActivity");
        to3rd.putExtra("name","Ricky");
        to3rd.putExtra("age",25);
        startActivity(to3rd);
    }
    /**
     * 带回调的intent
     */
    private void go4thActivity(){
        Intent to4th= new Intent();
        //同Manifest.xml
        to4th.setAction("patech.com.zhizhitest.FourthActivity");
//        to4th.setClass(this,FourthActivity.class);
        startActivityIfNeeded(to4th,RequestCode);
    }
}
