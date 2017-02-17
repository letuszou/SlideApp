package letuszou.com.slideactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);


//        String type = getIntent().getStringExtra(getString(R.string.app_name));
//        if (getString(R.string.left).equals(type)) {
//            overridePendingTransition(0,R.anim.right_to_left);
//        } else if (getString(R.string.right).equals(type)) {
//            overridePendingTransition(0,R.anim.left_to_right);
//        } else if (getString(R.string.top).equals(type)) {
//            overridePendingTransition(0,R.anim.bottom_to_top);
//
//        } else if (getString(R.string.bottom).equals(type)) {
//            overridePendingTransition(0,R.anim.top_to_bottom);
//
//        }

    }
}
