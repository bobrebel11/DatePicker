package com.example.rebelbob11.datepicker;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    private DatePickerDialog.OnDateSetListener dateListener;

    int mYear,mMonth,mDay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Log.d("CREATE","on create");
//
//
//        // TextView to display the current date and selected date.
//        final TextView Output = (TextView) findViewById(R.id.Output);
//
//
//        // Button for Date selection pop-up
//        Button changeDate = (Button) findViewById(R.id.changeDate);
//
//        //Displaying the current date
//
//
//        //Getting current Year, Month and Date
//        Calendar myCalendar = Calendar.getInstance();
//        mYear = myCalendar.get(Calendar.YEAR);
//        mMonth = myCalendar.get(Calendar.MONTH);
//        mDay = myCalendar.get(Calendar.DAY_OF_MONTH);
//
//        //Creating a format and setting it to textview
//        SimpleDateFormat dateFormat = new SimpleDateFormat("MM / dd / yyyy ");
//        String currentDate = dateFormat.format(myCalendar.getTime());
//        Output.setText(currentDate);
//
//
//
//        // On click of Change Date button display the DatePickerDialog and show the current date.
//
//        changeDate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                //Creating datepicker and showing current date in it
//                DatePickerDialog datePickerDialog = new DatePickerDialog(
//                        MainActivity.this,
//                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
//                        dateListener,
//                        mYear,mMonth,mDay);
//                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//                datePickerDialog.show();
//            }
//
//        });
//
//
//
//        // On selecting the date display the selection in the TextView.
//
//        dateListener = new DatePickerDialog.OnDateSetListener() {
//            @Override
//            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
//                month = month + 1;
//
//                String userSetDate = month + " / " + day + " / " + year;
//                Output.setText(userSetDate);
//            }
//        };














    }



    @Override
    protected void onStop(){
        super.onStop();
        setContentView(R.layout.hide);
        Log.d("STOP","in on Stop");

//    setContentView(R.layout.hide);
//        Log.d("STOP","in on Stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        ;setContentView(R.layout.hide);


        Log.d("PAUSE","in Pause");


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);

        Log.d("CREATE","on create");


        // TextView to display the current date and selected date.
        final TextView Output = (TextView) findViewById(R.id.Output);


        // Button for Date selection pop-up
        Button changeDate = (Button) findViewById(R.id.changeDate);

        //Displaying the current date


        //Getting current Year, Month and Date
        Calendar myCalendar = Calendar.getInstance();
        mYear = myCalendar.get(Calendar.YEAR);
        mMonth = myCalendar.get(Calendar.MONTH);
        mDay = myCalendar.get(Calendar.DAY_OF_MONTH);

        //Creating a format and setting it to textview
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM / dd / yyyy ");
        String currentDate = dateFormat.format(myCalendar.getTime());
        Output.setText(currentDate);



        // On click of Change Date button display the DatePickerDialog and show the current date.

        changeDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Creating datepicker and showing current date in it
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        MainActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        dateListener,
                        mYear,mMonth,mDay);
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }

        });



        // On selecting the date display the selection in the TextView.

        dateListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;

                String userSetDate = month + " / " + day + " / " + year;
                Output.setText(userSetDate);
            }
        };
    }
}
