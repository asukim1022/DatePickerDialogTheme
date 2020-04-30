package com.asukim.datepickerdialogtheme;


import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RelativeLayout;
import android.app.DialogFragment;

import java.util.Calendar;

public class MainActivity extends Activity {

    public static int year, month, day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);

        Button defaultLightBtn = (Button) findViewById(R.id.defaultLightBtn);

        defaultLightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //DatePickerFragment 초기화
                DialogFragment datePickerFragment = new DatePickerDefaultLight();

                //DatePickerFragment 표시
                datePickerFragment.show(getFragmentManager(), "Date Picker");
            }
        });

        Button defaultDarkBtn = (Button) findViewById(R.id.defaultDarkBtn);

        defaultDarkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //DatePickerFragment 초기화
                DialogFragment datePickerFragment = new DatePickerDefaultDark();

                //DatePickerFragment 표시
                datePickerFragment.show(getFragmentManager(), "Date Picker");
            }
        });


        Button holoLightBtn = (Button) findViewById(R.id.holoLightBtn);

        holoLightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //DatePickerFragment 초기화
                DialogFragment datePickerFragment = new DatePickerHoloLight();

                //DatePickerFragment 표시
                datePickerFragment.show(getFragmentManager(), "Date Picker");
            }
        });


        Button holoDarkBtn = (Button) findViewById(R.id.holoDarkBtn);

        holoDarkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //DatePickerFragment 초기화
                DialogFragment datePickerFragment = new DatePickerHoloDark();

                //DatePickerFragment 표시
                datePickerFragment.show(getFragmentManager(), "Date Picker");
            }
        });


        Button TraditionalBtn = (Button) findViewById(R.id.TraditionalBtn);

        TraditionalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //DatePickerFragment 초기화
                DialogFragment datePickerFragment = new DatePickerTraditional();

                //DatePickerFragment 표시
                datePickerFragment.show(getFragmentManager(), "Date Picker");
            }
        });
    }


    public static class DatePickerDefaultLight extends DialogFragment implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {

            // DatePickerDialog THEME_DEVICE_DEFAULT_LIGHT
            DatePickerDialog theme_device_default_light = new DatePickerDialog(getActivity(), AlertDialog.THEME_DEVICE_DEFAULT_LIGHT, this, year, month, day);

            // Return the DatePickerDialog
            return theme_device_default_light;
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            //선택한 날짜 출력
        }
    }

    public static class DatePickerDefaultDark extends DialogFragment implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {

            // DatePickerDialog THEME_DEVICE_DEFAULT_DARK
            DatePickerDialog theme_device_default_dark = new DatePickerDialog(getActivity(), AlertDialog.THEME_DEVICE_DEFAULT_DARK, this, year, month, day);

            // Return the DatePickerDialog
            return theme_device_default_dark;
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            //선택한 날짜
        }
    }

    public static class DatePickerHoloLight extends DialogFragment implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {

            // DatePickerDialog THEME_HOLO_LIGHT
            DatePickerDialog theme_holo_light = new DatePickerDialog(getActivity(), AlertDialog.THEME_HOLO_LIGHT, this, year, month, day);

            // Return the DatePickerDialog
            return theme_holo_light;
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            //선택한 날짜
        }
    }

    public static class DatePickerHoloDark extends DialogFragment implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {

            // DatePickerDialog THEME_HOLO_DARK
            DatePickerDialog theme_holo_dark = new DatePickerDialog(getActivity(), AlertDialog.THEME_HOLO_DARK, this, year, month, day);

            // Return the DatePickerDialog
            return theme_holo_dark;
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            //선택한 날짜
        }
    }

    public static class DatePickerTraditional extends DialogFragment implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {

            // DatePickerDialog THEME_TRADITIONAL
            DatePickerDialog theme_traditional = new DatePickerDialog(getActivity(), AlertDialog.THEME_TRADITIONAL, this, year, month, day);

            // Return the DatePickerDialog
            return theme_traditional;
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            //선택한 날짜
        }
    }
}