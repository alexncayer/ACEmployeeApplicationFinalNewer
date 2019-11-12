package com.example.accsc250hwp12application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickMeButtonPressed(View v)
    {
        EditText inputET = this.findViewById(R.id.firstname);
        String fn = inputET.getText().toString();

        EditText inputET2 = this.findViewById(R.id.lastname);
        String ln = inputET2.getText().toString();

        EditText inputET3 = this.findViewById(R.id.personsage);
        String psa = inputET3.getText().toString();

        EditText inputET4 = this.findViewById(R.id.numberweight);
        String nw = inputET4.getText().toString();

        EditText inputET5 = this.findViewById(R.id.numberheight);
        String nh = inputET5.getText().toString();

        EditText inputET6 = this.findViewById(R.id.printfirstname);
        String pfn = inputET6.getText().toString();

        EditText inputET7 = this.findViewById(R.id.lastnameprinted);
        String pln = inputET7.getText().toString();

        EditText inputET8 = this.findViewById(R.id.printage);
        String agep = inputET8.getText().toString();

        EditText inputET9 = this.findViewById(R.id.printweight);
        String pweight = inputET9.getText().toString();

        EditText inputET10 = this.findViewById(R.id.printheight);
        String pheight = inputET10.getText().toString();

        EditText inputET11 = this.findViewById(R.id.firstnamechecker);
        String fnchecker = inputET11.getText().toString();

        Employee one = new Employee (fn, ln, psa, nw, nh);

    }

    // public void onClickMeButtonSearcher(View v)
    {
        //EditText inputET = this.findViewById(R.id.firstname);
        //String fn = inputET.getText().toString();
        //EditText inputET11 = this.findViewById(R.id.firstnamechecker);
        //String fnchecker = inputET11.getText().toString();
        //Employee onesearcher(fn, fnchecker)
        //Can't include if statements or errors occur

    }
}
