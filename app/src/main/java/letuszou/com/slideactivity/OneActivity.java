package letuszou.com.slideactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class OneActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        initView();

    }


    private void initView() {

        Button btn_left_to_right = (Button) findViewById(R.id.btn_left_to_right);
        btn_left_to_right.setOnClickListener(this);
        Button btn_right_to_left = (Button) findViewById(R.id.btn_right_to_left);
        btn_right_to_left.setOnClickListener(this);
        Button btn_top_to_bottom = (Button) findViewById(R.id.btn_top_to_bottom);
        btn_top_to_bottom.setOnClickListener(this);
        Button btn_bottom_to_top = (Button) findViewById(R.id.btn_bottom_to_top);
        btn_bottom_to_top.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_left_to_right:
                left();
                break;
            case R.id.btn_right_to_left:
                right();
                break;
            case R.id.btn_top_to_bottom:
                top();
                break;
            case R.id.btn_bottom_to_top:
                bottom();
                break;

        }

    }

    //第一个参数化，第二个参数是退出这个界面的参数,两个界面跳转时只能有一个界面调用这个方法,否则没有效果
    private void left() {
        Intent intent = new Intent(OneActivity.this,  TwoActivity.class);
        intent.putExtra(getString(R.string.app_name),getString(R.string.left));
        startActivity(intent);

        overridePendingTransition(R.anim.left_to_right, 0);
    }

    private void right() {
        Intent intent = new Intent(OneActivity.this,  TwoActivity.class);
        intent.putExtra(getString(R.string.app_name),getString(R.string.right));
        startActivity(intent);
        overridePendingTransition(R.anim.right_to_left, 0);
    }

    private void top() {
        Intent intent = new Intent(OneActivity.this,  TwoActivity.class);
        intent.putExtra(getString(R.string.app_name),getString(R.string.top));
        startActivity(intent);
        overridePendingTransition(R.anim.top_to_bottom, 0);
    }

    private void bottom() {
        Intent intent = new Intent(OneActivity.this,  TwoActivity.class);
        intent.putExtra(getString(R.string.app_name),getString(R.string.bottom));
        startActivity(intent);
        overridePendingTransition(R.anim.bottom_to_top, 0);
    }


}
