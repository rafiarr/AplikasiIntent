package com.example.rafiar.aplikasiintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class KalkulatorActivity extends AppCompatActivity {
    Double currentNumberValue;
    Double countNumberValue;

    char operand;

    TextView currentNumber;
    TextView countNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        currentNumber = (TextView) findViewById(R.id.currentNumber);
        countNumber = (TextView) findViewById(R.id.countNumber);

        operand = ' ';

        currentNumberValue = Double.parseDouble("0") ;
        countNumberValue = Double.parseDouble("0") ;

        updateText();
    }

    private void updateText(){
        currentNumber.setText(operand + " " + currentNumberValue);
        countNumber.setText(""+countNumberValue);
    }

    public void tutup(View view){
        finish();
    }

    public void calculateNumber(){
        switch (operand){
            case '+': countNumberValue = countNumberValue + currentNumberValue;break;
            case '-': countNumberValue = countNumberValue - currentNumberValue;break;
            case '*': countNumberValue = countNumberValue * currentNumberValue;break;
            case '/': countNumberValue = countNumberValue / currentNumberValue;break;
            case ' ': break;
        }
        currentNumberValue = Double.parseDouble("0");
    }

    public void inputNumber(View view){
        Double number = null;
        switch (view.getId())
        {
            case R.id.btnNumber0:number = Double.parseDouble("0");break;
            case R.id.btnNumber1:number = Double.parseDouble("1");break;
            case R.id.btnNumber2:number = Double.parseDouble("2");break;
            case R.id.btnNumber3:number = Double.parseDouble("3");break;
            case R.id.btnNumber4:number = Double.parseDouble("4");break;
            case R.id.btnNumber5:number = Double.parseDouble("5");break;
            case R.id.btnNumber6:number = Double.parseDouble("6");break;
            case R.id.btnNumber7:number = Double.parseDouble("7");break;
            case R.id.btnNumber8:number = Double.parseDouble("8");break;
            case R.id.btnNumber9:number = Double.parseDouble("9");break;
        }

        currentNumberValue = currentNumberValue*10;
        currentNumberValue = currentNumberValue + number;

        if(operand == ' ') {
            countNumberValue = currentNumberValue;
        }

        updateText();
    }

    public void inputOperand(View view){
        calculateNumber();
        switch (view.getId()){
            case R.id.btnOpMultiple: operand = '*';break;
            case R.id.btnOpDevide: operand = '/';break;
            case R.id.btnOpSubstract :operand = '-';break;
            case R.id.btnOpSum: operand = '+';break;
        }

        updateText();
    }

    public void inputEquals(View view){
        calculateNumber();
        operand = ' ';
        updateText();
    }
}
