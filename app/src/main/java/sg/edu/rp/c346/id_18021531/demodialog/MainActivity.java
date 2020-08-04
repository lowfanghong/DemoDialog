package sg.edu.rp.c346.id_18021531.demodialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
Button btnDemo1,btnDemo2,btnDemo3,btnEx3,btnDemo4,btnDemo5;
TextView tvDemo2,tvDemo3,tvEx3,tvDemo4,tvDemo5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDemo1 = findViewById(R.id.buttonDemo1);
        btnDemo2 = findViewById(R.id.buttonDemo2);
        tvDemo2 = findViewById(R.id.textViewDemo2);
        btnDemo3 = findViewById(R.id.buttonDemo3);
        tvDemo3 = findViewById(R.id.textViewDemo3);
        btnEx3 = findViewById(R.id.buttonEx3);
        tvEx3 = findViewById(R.id.textViewEx3);
        btnDemo4 = findViewById(R.id.buttonDemo4);
        tvDemo4 = findViewById(R.id.textViewDemo4);
        btnDemo5 = findViewById(R.id.buttonDemo5);
        tvDemo5 = findViewById(R.id.textViewDemo5);



        btnDemo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            /*    AlertDialog.Builder myBuilder = new AlertDialog.Builder
                        (MainActivity.this);
                myBuilder.setTitle("Demo 1 -Simple Dialog");
                myBuilder.setMessage("I can develop Android App.");
                myBuilder.setCancelable(false);
                myBuilder.setPositiveButton("Close",null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();*/
                AlertDialog.Builder myBuilder = new AlertDialog.Builder
                        (MainActivity.this);
                myBuilder.setTitle("Congratulations");
                myBuilder.setMessage("You have completed a simple Dialog Box");
                myBuilder.setCancelable(false);
                myBuilder.setPositiveButton("Dismiss",null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();


            }
        });

        btnDemo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder
                        (MainActivity.this);
                myBuilder.setTitle("Demo 2 Buttons Dialog");
                myBuilder.setMessage("Select one of the Buttons below.");
                myBuilder.setCancelable(false);
                myBuilder.setPositiveButton("Yes", new
                        DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tvDemo2.setText("You have selected Positive.");
                    }
                });
                myBuilder.setNeutralButton("Cancel",null);
                myBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tvDemo2.setText("You have selected Negative");
                    }
                });
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });

        btnDemo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService
                        (Context.LAYOUT_INFLATER_SERVICE);
                View viewDialog = inflater.inflate(R.layout.input,null);
                final EditText etInput = viewDialog.findViewById(R.id.editTextInput);
                AlertDialog.Builder myBuilder = new AlertDialog.Builder
                        (MainActivity.this);
                myBuilder.setView(viewDialog);
                myBuilder.setTitle("Demo 3 -Text Input Dialog");
                myBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String message = etInput.getText().toString();
                        tvDemo3.setText(message);
                    }
                });
                myBuilder.setNeutralButton("Cancel",null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });

        btnEx3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService
                        (Context.LAYOUT_INFLATER_SERVICE);
                View viewDialog3 = inflater.inflate(R.layout.inputforex3,null);
                final EditText etNumber1 = viewDialog3.findViewById(R.id.editTextNumber1);
                final EditText etNumber2 = viewDialog3.findViewById(R.id.editTextNumber2);
                AlertDialog.Builder myBuilder = new AlertDialog.Builder
                        (MainActivity.this);
                myBuilder.setView(viewDialog3);
                myBuilder.setTitle("Exercise 3");
                myBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Integer num1 = Integer.parseInt(etNumber1.getText().toString());
                        Integer num2 = Integer.parseInt(etNumber2.getText().toString());
                        Integer sum = num1 + num2;
                        tvEx3.setText("The sum is " + sum);
                    }
                });

                myBuilder.setNeutralButton("Cancel",null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();

            }
        });
        btnDemo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        tvDemo4.setText("Date:" + dayOfMonth + "/" + (month+1) + "/" + year);
                    }
                };
                Calendar CA = Calendar.getInstance();
                DatePickerDialog myDateDialog = new DatePickerDialog(MainActivity.this,
                        myDateListener,CA.get(Calendar.YEAR),CA.get(Calendar.MONTH),
                        CA.get(Calendar.DAY_OF_MONTH));
                myDateDialog.show();
            }
        });

        btnDemo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog.OnTimeSetListener myTimeListener = new
                        TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        tvDemo5.setText("Time: " + hourOfDay +":" + minute);
                    }
                };

                Calendar CA = Calendar.getInstance();
                TimePickerDialog myTimePickerDialog =
                        new TimePickerDialog(MainActivity.this,
                        myTimeListener,CA.get(Calendar.HOUR),CA.get(Calendar.MINUTE),
                                false);
                myTimePickerDialog.show();
            }
        });


    }
};