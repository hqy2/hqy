package com.example.firstactivity9;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    //Ctrl+o,点击按钮可以跳回原来的按钮，可以切换
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1:
                if (resultCode==RESULT_OK){
                    String returnedData=data.getStringExtra("data_return");
                    Log.d("hqy",returnedData);
                }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("hqy","onStar函数调用");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Log.d("hqy","FirstActivity的onCreate函数被调用");

        Button btn1=findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle=new Bundle();
                bundle.putString("name","hqyBundle");
                Intent intent1=new Intent(FirstActivity.this,SecondActivity.class);
                intent1.putExtra("message",bundle);
                startActivity(intent1);


       /* //实现点击跳转
        Button btn1=findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data="Hello Hello";
                Intent intent1=new Intent(FirstActivity.this,SecondActivity.class);
                intent1.putExtra("hello",data);//putExtra传递数据
                intent1.putExtra("id",134);
              //  startActivity(intent1);//Intent实现两个activity直接文件跳
                startActivityForResult(intent1,1);



                /*
                Intent intent2=new Intent("com.example.firstactivity9.hqy");//hqy是自己取名，一般可以在前面加上包名，这样更明确在哪里
                intent2.addCategory("android.intent.category.LAUNCHER");//实现隐形跳转，就相当于AndroidManifest里面的intent-filter都可以有，这样写就不可以让它实现运行，不用一个个的去弄
                startActivity(intent2);*/

                /*Intent intent1=new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("https://cn.bing.com/"));//跳转网址
                startActivity(intent1);*/

                /*Intent intent1=new Intent(Intent.ACTION_DIAL);
                intent1.setData(Uri.parse("tel:10086"));//打电话(只是模拟)
                startActivity(intent1);*/


            }

        });


    }
}