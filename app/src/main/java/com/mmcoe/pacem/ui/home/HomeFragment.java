package com.mmcoe.pacem.ui.home;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.mmcoe.pacem.R;

import java.util.Objects;

import static android.content.Context.MODE_PRIVATE;

public class HomeFragment extends Fragment {
    private int age;
    private TextView remainDays;
    private TextView upVaccine;

    private TextView prevDays;
    private TextView upVaccine2;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        remainDays = root.findViewById(R.id.remainDays);
        upVaccine = root.findViewById(R.id.upVaccine);
        prevDays = root.findViewById(R.id.remainDays2);
        upVaccine2 = root.findViewById(R.id.upVaccine2);
        SharedPreferences sh = Objects.requireNonNull(getActivity()).getSharedPreferences("MySharedPref", MODE_PRIVATE);
        age = sh.getInt("age", -1);
        calculateDays();
        return root;
    }

    private void calculateDays(){
        prevDays.setText("");
        upVaccine2.setText("");
        Log.d("TAG", "calculateDays: "+age);

        if (age <= 42){

            String[] pv = getResources().getStringArray(R.array.vaccine_birth);
            for (String s : pv) {
                upVaccine2.append(s);
                upVaccine2.append("\n");
            }


            remainDays.setText(String.valueOf(42-age) + " Days");

            String[] vaccineArr = getResources().getStringArray(R.array.vaccine_week_6);

            for (String s : vaccineArr) {
                upVaccine.append(s);
                upVaccine.append("\n");
            }
        } else if (age <= 70){

            String[] pv = getResources().getStringArray(R.array.vaccine_week_6);
            for (String s : pv) {
                upVaccine2.append(s);
                upVaccine2.append("\n");
            }

            remainDays.setText(String.valueOf(70-age) + " Days");
            String[] vaccineArr = getResources().getStringArray(R.array.vaccine_week_10);
            for (String s : vaccineArr) {
                upVaccine.append(s);
                upVaccine.append("\n");
            }
        } else if (age <= 98){

            String[] pv = getResources().getStringArray(R.array.vaccine_week_10);
            for (String s : pv) {
                upVaccine2.append(s);
                upVaccine2.append("\n");
            }


            remainDays.setText(String.valueOf(98-age) + " Days");

            String[] vaccineArr = getResources().getStringArray(R.array.vaccine_week_12);
            for (String s : vaccineArr) {
                upVaccine.append(s);
                upVaccine.append("\n");
            }
        } else if (age <= 183){

            String[] pv = getResources().getStringArray(R.array.vaccine_week_12);
            for (String s : pv) {
                upVaccine2.append(s);
                upVaccine2.append("\n");
            }

            remainDays.setText(String.valueOf(183-age) + " Days");
            String[] vaccineArr = getResources().getStringArray(R.array.vaccine_week_14);
            for (String s : vaccineArr) {
                upVaccine.append(s);
                upVaccine.append("\n");
            }
        } else if (age <= 274){

            String[] pv = getResources().getStringArray(R.array.vaccine_week_14);
            for (String s : pv) {
                upVaccine2.append(s);
                upVaccine2.append("\n");
            }

            remainDays.setText(String.valueOf(274-age) + " Days");
            String[] vaccineArr = getResources().getStringArray(R.array.vaccine_month_6);
            for (String s : vaccineArr) {
                upVaccine2.append(s);
                upVaccine2.append("\n");
            }
        } else if (age <= 335) {

            String[] pv = getResources().getStringArray(R.array.vaccine_month_6);
            for (String s : pv) {
                upVaccine.append(s);
                upVaccine.append("\n");
            }

            remainDays.setText(String.valueOf(335-age) + " Days");
            String[] vaccineArr = getResources().getStringArray(R.array.vaccine_month_9);
            for (String s : vaccineArr) {
                upVaccine.append(s);
                upVaccine.append("\n");
            }
        } else if (age <= 365) {
            String[] pv = getResources().getStringArray(R.array.vaccine_month_9);
            for (String s : pv) {
                upVaccine2.append(s);
                upVaccine2.append("\n");
            }

            remainDays.setText(String.valueOf(365-age) + " Days");
            String[] vaccineArr = getResources().getStringArray(R.array.vaccine_month_9_12);
            for (String s : vaccineArr) {
                upVaccine.append(s);
                upVaccine.append("\n");
            }
        } else if (age <= 456){

            String[] pv = getResources().getStringArray(R.array.vaccine_month_9_12);
            for (String s : pv) {
                upVaccine2.append(s);
                upVaccine2.append("\n");
            }

            remainDays.setText(String.valueOf(456-age) + " Days");
            String[] vaccineArr = getResources().getStringArray(R.array.vaccine_month_12);
            for (String s : vaccineArr) {
                upVaccine.append(s);
                upVaccine.append("\n");
            }
        } else if (age <= 517){

            String[] pv = getResources().getStringArray(R.array.vaccine_month_12);
            for (String s : pv) {
                upVaccine2.append(s);
                upVaccine2.append("\n");
            }

            remainDays.setText(String.valueOf(517-age) + " Days");
            String[] vaccineArr = getResources().getStringArray(R.array.vaccine_month_15);
            for (String s : vaccineArr) {
                upVaccine2.append(s);
                upVaccine2.append("\n");
            }
        } else if (age <= 548){

            String[] pv = getResources().getStringArray(R.array.vaccine_month_15);
            for (String s : pv) {
                upVaccine2.append(s);
                upVaccine2.append("\n");
            }

            remainDays.setText(String.valueOf(548-age) + " Days");
            String[] vaccineArr = getResources().getStringArray(R.array.vaccine_month_16_18);
            for (String s : vaccineArr) {
                upVaccine.append(s);
                upVaccine.append("\n");
            }
        } else if (age <= 730){

            String[] pv = getResources().getStringArray(R.array.vaccine_month_16_18);
            for (String s : pv) {
                upVaccine2.append(s);
                upVaccine2.append("\n");
            }
            remainDays.setText(String.valueOf(730-age) + " Days");
            String[] vaccineArr = getResources().getStringArray(R.array.vaccine_year_2);
            for (String s : vaccineArr) {
                upVaccine.append(s);
                upVaccine.append("\n");
            }
        } else if (age <= 1460) {

                String[] pv = getResources().getStringArray(R.array.vaccine_year_2);
                for (String s : pv) {
                    upVaccine2.append(s);
                    upVaccine2.append("\n");
            }
            remainDays.setText(String.valueOf(1460-age) + " Days");
            String[] vaccineArr = getResources().getStringArray(R.array.vaccine_year_4_6);
            for (String s : vaccineArr) {
                upVaccine.append(s);
                upVaccine.append("\n");
            }
        }
    }
}