package com.example.myoriginalcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    boolean starting=true;
    String mynumber="";
    String temp="";
    String tempRes="";
    Double result=0.0;
    boolean resultFlag=false;
    boolean addFlag=false;
    boolean subFlag=false;
    boolean multFlag=false;
    boolean divFlag=false;




    public void number(View view){

        Button b = (Button) view;
        TextView t = (TextView) findViewById(R.id.textView3);

        if (resultFlag==true){
            starting=true;
            resultFlag=false;
        }
        mynumber+=b.getText().toString();
        t.setText(mynumber);


    }

    public void add(View view){
        TextView t = (TextView) findViewById(R.id.textView3);
        Button fp=(Button)findViewById(R.id.floatingPoint);
        fp.setEnabled(true);
        temp=mynumber;
        mynumber="";

        if(starting==true){
            result=Double.valueOf(temp);
            starting=false;

        }
        else if (resultFlag==true){

            resultFlag=false;

        }
        else if (subFlag==true){
            result=result-Double.valueOf(temp);
            subFlag=false;
        }
        else if (multFlag==true){
            result=result*Double.valueOf(temp);
            multFlag=false;
        }
        else if (divFlag==true){
            result=result/Double.valueOf(temp);
            divFlag=false;
        }
        else{
            result=result+Double.valueOf(temp);
            mynumber="";
        }
         t.setText(result.toString());

        addFlag=true;
        subFlag=false;
        multFlag=false;
        divFlag=false;
    }

    public void sub(View view){
        TextView t = (TextView) findViewById(R.id.textView3);
        Button fp=(Button)findViewById(R.id.floatingPoint);
        fp.setEnabled(true);
        temp=mynumber;
        mynumber="";
        if (starting==true){
            result=Double.valueOf(temp);
            starting=false;
        }
        else if (resultFlag==true){
            resultFlag=false;
        }
        else if(addFlag==true){
            result=result+Double.valueOf(temp);
            addFlag=false;
        }
        else if (multFlag==true){
            result=result*Double.valueOf(temp);
            multFlag=false;
        }
        else if (divFlag==true){
            result=result/Double.valueOf(temp);
            divFlag=false;
        }
        else{
            result=result-Double.valueOf(temp);
        }
        t.setText(result.toString());
        addFlag=false;
        subFlag=true;
        multFlag=false;
        divFlag=false;

    }

    public void mult(View view){
        TextView t = (TextView) findViewById(R.id.textView3);
        Button fp=(Button)findViewById(R.id.floatingPoint);
        fp.setEnabled(true);
        temp=mynumber;
        mynumber="";
        if (starting==true){
            result=Double.valueOf(temp);
            starting=false;
        }
        else if (resultFlag==true){
            resultFlag=false;
        }
        else if(addFlag==true){
            result=result+Double.valueOf(temp);
            addFlag=false;
        }
        else if (subFlag==true) {
            result = result - Double.valueOf(temp);
            subFlag = false;
        }
        else if (divFlag==true){
            result=result/Double.valueOf(temp);
            divFlag=false;
        }
        else{
            result=result*Double.valueOf(temp);
        }
        t.setText(result.toString());
        addFlag=false;
        subFlag=false;
        multFlag=true;
        divFlag=false;
    }

    public void div(View view){
        TextView t = (TextView) findViewById(R.id.textView3);
        Button fp=(Button)findViewById(R.id.floatingPoint);
        fp.setEnabled(true);
        temp=mynumber;
        mynumber="";
        if (starting==true){
            result=Double.valueOf(temp);
            starting=false;
        }
        else if (resultFlag==true) {
            resultFlag = false;
        }
        else if(addFlag==true){
            result=result+Double.valueOf(temp);
            addFlag=false;
        }
        else if (subFlag==true) {
            result = result - Double.valueOf(temp);
            subFlag = false;
        }
        else if (multFlag==true) {
            result = result * Double.valueOf(temp);
            multFlag = false;
        }

        else{
            result=result/Double.valueOf(temp);

        }
        t.setText(result.toString());
        addFlag=false;
        subFlag=false;
        multFlag=false;
        divFlag=true;

    }


    public void result(View view){
        TextView t = (TextView) findViewById(R.id.textView3);
        Button fp=(Button)findViewById(R.id.floatingPoint);
        fp.setEnabled(true);
        temp=mynumber;
        mynumber="";
        if (starting==true){
            result=Double.valueOf(temp);
            starting=false;
        }
        else if(addFlag==true){
            result=result+Double.valueOf(temp);
            addFlag=false;
        }
        else if(subFlag==true){
            result=result-Double.valueOf(temp);
            subFlag=false;
        }
        else if(multFlag==true){
            result=result*Double.valueOf(temp);
            multFlag=false;
        }
        else if (divFlag==true){
            result=result/Double.valueOf(temp);
            divFlag=false;
        }
        t.setText(result.toString());
        resultFlag=true;


    }

    public void clear(View view){
        TextView t = (TextView) findViewById(R.id.textView3);
        Button fp=(Button)findViewById(R.id.floatingPoint);
        fp.setEnabled(true);
        addFlag=false;
        subFlag=false;
        multFlag=false;
        divFlag=false;
        starting=true;
        resultFlag=false;
        mynumber=" ";
        result=0.0;
        t.setText("0");
    }
    public void floatingPoint(View view){
        TextView t = (TextView) findViewById(R.id.textView3);
        Button fp=(Button)view;
        fp.setEnabled(false);
        if (resultFlag==true){
            starting=true;
            resultFlag=false;
        }
        mynumber+=fp.getText().toString();
        t.setText(mynumber);

    }
}
