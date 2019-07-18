package patech.com.zhizhitest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends AppCompatActivity {
    private Button finishButton;
    public static final int RESULT_CODE = 2003;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        finishButton = (Button) findViewById(R.id.finish);
        finishButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = getIntent();
                        intent.putExtra("name", "ricky");
                        setResult(RESULT_CODE, intent);
                        finish();
                    }
                }
        );
    }
}