package com.example.bluey.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int flag = 0;
    int flag1=0;
    public String str1=null;
    public String str2=null;
    public String str3=null;
    public String s="";

    public void reset(View view) {
        flag = 0;
        flag1=0;
        str1=null;
        str2=null;
        TextView vm = (TextView) findViewById(R.id.textView);
        vm.setText("0");

    }

    public void algorithm(View view) {
        TextView vm = (TextView) findViewById(R.id.textView);
        TextView textView = (TextView) findViewById(R.id.textView);
        int ID = view.getId();
        if (str1 == null)
        {
            str1 = (String) textView.getText();
        }
        else {
            str2 = (String) textView.getText();
        }
        if (ID == R.id.equal) {
            if( (str1==null) || (str2==null) ){
                flag = 0;
                Toast.makeText(getApplicationContext(), "输入错误", Toast.LENGTH_SHORT).show();
                reset(view);
            }
            else{
                int i=Integer.parseInt(str1);
                int j=Integer.parseInt(str2);
                long x;
                flag1=0;
                switch (flag) {
                    case 1:
                     x=i/j;
                    s=x+"";
                    vm.setText(s);
                        break;
                    case 2:
                        x=i+j;
                        s=x+"";
                        vm.setText(s);
                        break;
                    case 3:
                        x=i*j;
                        s=x+"";
                        vm.setText(s);
                        break;
                    case 4:
                        x=i-j;
                        s=x+"";
                        vm.setText(s);
                        break;
                }
            }
        }
        else if (flag != 0) {
            flag = 0;
            Toast.makeText(getApplicationContext(), "输入错误", Toast.LENGTH_SHORT).show();
            reset(view);
        }
        else {
            switch (ID) {
                case R.id.divide:
                    flag = 1;
                    flag1=0;
                    break;
                case R.id.add:
                    flag = 2;
                    flag1=0;
                    break;
                case R.id.multioly:
                    flag = 3;
                    flag1=0;
                    break;
                case R.id.subtract:
                    flag = 4;
                    flag1=0;
                    break;
            }
        }
    }

    public void number(View view) {
        TextView vm = (TextView) findViewById(R.id.textView);
        TextView textView = (TextView) findViewById(R.id.textView);
        int ID = view.getId();
        int j = 0;
        if (flag1 == 1) {
            str3 = (String) textView.getText();
            switch (ID) {
                case R.id.one:
                    vm.setText(str3+"1");
                    break;
                case R.id.two:
                    vm.setText(str3+"2");
                    break;
                case R.id.three:
                    vm.setText(str3+"3");
                    break;
                case R.id.four:
                    vm.setText(str3+"4");
                    break;
                case R.id.five:
                    vm.setText(str3+"5");
                    break;
                case R.id.six:
                    vm.setText(str3+"6");
                    break;
                case R.id.seven:
                    vm.setText(str3+"7");
                    break;
                case R.id.eight:
                    vm.setText(str3+"8");
                    break;
                case R.id.nine:
                    vm.setText(str3+"9");
                    break;
                case R.id.zero:
                    vm.setText(str3+"0");
                    flag1=1;
                    break;
            }
        } else {
            switch (ID) {
                case R.id.one:
                    vm.setText("1");
                    flag1 = 1;
                    break;
                case R.id.two:
                    vm.setText("2");
                    flag1 = 1;
                    break;
                case R.id.three:
                    vm.setText("3");
                    flag1 = 1;
                    break;
                case R.id.four:
                    vm.setText("4");
                    flag1 = 1;
                    break;
                case R.id.five:
                    vm.setText("5");
                    flag1 = 1;
                    break;
                case R.id.six:
                    vm.setText("6");
                    flag1 = 1;
                    break;
                case R.id.seven:
                    vm.setText("7");
                    flag1 = 1;
                    break;
                case R.id.eight:
                    vm.setText("8");
                    flag1 = 1;
                    break;
                case R.id.nine:
                    vm.setText("9");
                    flag1 = 1;
                    break;
                case R.id.zero:
                    vm.setText("0");
                    break;
            }

        }
    }
}