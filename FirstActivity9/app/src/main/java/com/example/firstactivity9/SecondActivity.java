package com.example.firstactivity9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_second);

        Intent intent=getIntent();
        Bundle bundle=intent.getBundleExtra("message");
        String name =bundle.getString("name");
        int id=bundle.getInt("id",0);
        Log.d("hqy",name+id);

       /* Intent intent=getIntent();
        String data_get=intent.getStringExtra("hello");//得到名字是hello的数据
        int id1=intent.getIntExtra("id",0);//defaulValue表示没有接到数据就显示后面跟的值0，接到了就显示接到的数据
        Log.d("hqy",data_get+id1);//打印出来，看看究竟有没有得到数据

        //点按钮可以回到之前的按钮，可切换
        Button btn2=findViewById(R.id.button2);
        btn2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent();
                intent2.putExtra("data_return","hello First1");
                setResult(RESULT_OK,intent2);
                finish();//用finish销毁，才能回到之前按钮0*/
            }
        //}));
   // }
}