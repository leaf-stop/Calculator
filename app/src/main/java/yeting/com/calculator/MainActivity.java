package yeting.com.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Date;

public class MainActivity extends Activity {
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button dot;
    private Button add;
    private Button sub;
    private Button mult;
    private Button division;
    private Button amount;
    private Button clear;
    private Button time;
    private Button sqrt;
    private Button pow;
    private EditText led;

    String num1 = "";
    String num2 = "";
    double num3 = 0;
    String result = "";
    String sign = null;
    int mark = 0;
    boolean flag = true;
    boolean dotmark = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero= (Button) findViewById(R.id.zero);
        one= (Button) findViewById(R.id.one);
        two= (Button) findViewById(R.id.two);
        three= (Button) findViewById(R.id.three);
        four= (Button) findViewById(R.id.four);
        five= (Button) findViewById(R.id.five);
        six= (Button) findViewById(R.id.six);
        seven= (Button) findViewById(R.id.seven);
        eight= (Button) findViewById(R.id.eight);
        nine= (Button) findViewById(R.id.nine);
        dot= (Button) findViewById(R.id.dot);
        add= (Button) findViewById(R.id.add);
        sub= (Button) findViewById(R.id.sub);
        mult= (Button) findViewById(R.id.mult);
        division= (Button) findViewById(R.id.division);
        clear= (Button) findViewById(R.id.clear);
        amount= (Button) findViewById(R.id.amount);
        time= (Button) findViewById(R.id.time);
        pow= (Button) findViewById(R.id.pow);
        sqrt= (Button) findViewById(R.id.sqrt);
        led= (EditText) findViewById(R.id.led);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark==0){
                    num1=num1+"0";
                    led.setText(num1);
                }else if(mark == 1){
                    num2=num2+"0";
                    led.setText(num1+sign+num2);
                }else{
                    num1=String.valueOf(num3);
                    num2=num2+"0";
                    led.setText(num1+sign+num2);
                }
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark==0){
                    num1 = num1 + "1";
                    led.setText(num1);
                }else if(mark == 1){
                    num2 = num2 + "1";
                    led.setText(num1+sign+num2);
                }else{
                    num1=String.valueOf(num3);
                    num2=num2+"1";
                    led.setText(num1+sign+num2);
                }
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark==0){
                    num1=num1+"2";
                    led.setText(num1);
                }else if(mark == 1){
                    num2=num2+"2";
                    led.setText(num1+sign+num2);
                }else{
                    num1=String.valueOf(num3);
                    num2=num2+"2";
                    led.setText(num1+sign+num2);
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark==0){
                    num1 = num1 + "3";
                    led.setText(num1);
                }else if(mark == 1){
                    num2 = num2 + "3";
                    led.setText(num1+sign+num2);
                }else{
                    num1=String.valueOf(num3);
                    num2=num2+"3";
                    led.setText(num1+sign+num2);
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark==0){
                    num1 = num1 + "4";
                    led.setText(num1);
                }else if(mark == 1){
                    num2 = num2 + "4";
                    led.setText(num1+sign+num2);
                }else{
                    num1=String.valueOf(num3);
                    num2=num2+"4";
                    led.setText(num1+sign+num2);
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark==0){
                    num1 = num1 + "5";
                    led.setText(num1);
                }else if(mark == 1){
                    num2 = num2 + "5";
                    led.setText(num1+sign+num2);
                }else{
                    num1=String.valueOf(num3);
                    num2=num2+"5";
                    led.setText(num1+sign+num2);
                }
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark==0){
                    num1 = num1 + "6";
                    led.setText(num1);
                }else if(mark == 1){
                    num2 = num2 + "6";
                    led.setText(num1+sign+num2);
                }else{
                    num1=String.valueOf(num3);
                    num2=num2+"6";
                    led.setText(num1+sign+num2);
                }
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark==0){
                    num1 = num1 + "7";
                    led.setText(num1);
                }else if(mark == 1){
                    num2 = num2 + "7";
                    led.setText(num1+sign+num2);
                }else{
                    num1=String.valueOf(num3);
                    num2=num2+"7";
                    led.setText(num1+sign+num2);
                }
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark==0){
                    num1 = num1 + "8";
                    led.setText(num1);
                }else if(mark == 1){
                    num2 = num2 + "8";
                    led.setText(num1+sign+num2);
                }else{
                    num1=String.valueOf(num3);
                    num2=num2+"8";
                    led.setText(num1+sign+num2);
                }
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark==0){
                    num1 = num1 + "9";
                    led.setText(num1);
                }else if(mark == 1){
                    num2 = num2 + "9";
                    led.setText(num1+sign+num2);
                }else{
                    num1=String.valueOf(num3);
                    num2=num2+"9";
                    led.setText(num1+sign+num2);
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    sign="+";
                    mark++;
                    flag=false;
                    dotmark=true;
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    sign="-";
                    mark++;
                    flag=false;
                    dotmark=true;
                }
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    sign="*";
                    mark++;
                    flag=false;
                    dotmark=true;
                }
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    sign="/";
                    mark++;
                    flag=false;
                    dotmark=true;
                }
            }
        });

        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag){
                    sign="^";
                    mark++;
                    flag=false;
                    dotmark=true;
                }
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dotmark){
                    if(mark == 0){
                        num1=num1+".";
                        led.setText(num1);
                    }else if(mark == 1){
                        num2=num2+".";
                        led.setText(num1+sign+num2);
                    }else {
                        num1=String.valueOf(num3);
                        num2=num2+".";
                        led.setText(num1+sign+num2);
                    }
                    dotmark=false;
                }
            }
        });

        //等于时发生的运算
        amount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = true;
                dotmark = true;
                if(sign.equals("+")){
                    double x=Double.parseDouble(num1);
                    double y=Double.parseDouble(num2);
                    num3=x+y;
                    result=String.valueOf(num3);
                    led.setText(num1+sign+num2+"="+result);
                    num2="";
                }else if (sign.equals("-")){
                    double x=Double.parseDouble(num1);
                    double y=Double.parseDouble(num2);
                    num3=x-y;
                    result=String.valueOf(num3);
                    led.setText(num1+sign+num2+"="+result);
                    num2="";
                }else if (sign.equals("*")){
                    double x=Double.parseDouble(num1);
                    double y=Double.parseDouble(num2);
                    num3=x*y;
                    result=String.valueOf(num3);
                    led.setText(num1+sign+num2+"="+result);
                    num2="";
                }else if (sign.equals("/")){
                    double x=Double.parseDouble(num1);
                    double y=Double.parseDouble(num2);
                    num3=x/y;
                    result=String.valueOf(num3);
                    led.setText(num1+sign+num2+"="+result);
                    num2="";
                }else if (sign.equals("^")){
                    double x=Double.parseDouble(num1);
                    double y=Double.parseDouble(num2);
                    num3=Math.pow(x,y);
                    result=String.valueOf(num3);
                    led.setText(num1+sign+num2+"="+result);
                    num2="";
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1="";
                num2="";
                num3=0;
                mark=0;
                sign="";
                led.setText("0");
                flag=true;
                dotmark=true;
            }
        });

        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mark == 0 && !num1.equals("") && num2.equals("")){
                    double parent=Double.parseDouble(num1);
                    double root=Math.sqrt(parent);
                    result=String.valueOf(root);
                    led.setText(result);
                    num1="";
                }
            }
        });

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date date=new Date();
                led.setText(date.toLocaleString());
            }
        });
    }
}
