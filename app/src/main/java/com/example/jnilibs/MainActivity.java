package com.example.jnilibs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // 步骤1:加载生成的so库文件
    // 注意要跟.so库文件名相同
    static {

        System.loadLibrary("hi_jni");
    }
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         final Button click =(Button)findViewById(R.id.click);
         click.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 click.setText(fun());
             }
         });
     }
    public native String fun();
}
