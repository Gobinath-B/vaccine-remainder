package com.mmcoe.pacem.ui.bmi;


import static android.content.Context.MODE_PRIVATE;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mmcoe.pacem.R;

import java.text.DecimalFormat;
import java.util.Objects;

public class BmiCalculator extends Fragment {



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_bmi, container, false);
        myButtonListenerMethod(root);//
        return root;
    }
//

    public void myButtonListenerMethod(final View root) {
        Button button = root.findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText heightText = root.findViewById(R.id.height);
                String heightStr = heightText.getText().toString();
                double height = Double.parseDouble(heightStr);
                double heightM = height/100;
                final EditText weightText = root.findViewById(R.id.weight);
                String weightStr = weightText.getText().toString();
                double weight = Double.parseDouble(weightStr);
                double BMI = (weight) / (heightM * heightM);
                DecimalFormat df = new DecimalFormat("#.#");
                double BMI_trimmed = Double.parseDouble(df.format(BMI));
                final TextView BMIResult = root.findViewById(R.id.result);
                BMIResult.setText(Double.toString(BMI_trimmed));
                String BMI_Cat;
                if (BMI < 15){
                    BMI_Cat = "Very severely underweight";
                }
                else if (BMI >= 15 && BMI < 16){
                    BMI_Cat = "Severely underweight";
                }
                else if (BMI >=16 && BMI < 18.5){
                    BMI_Cat = "Underweight";
                }
                else if (BMI >=18.5 && BMI < 25){
                    BMI_Cat = "Normal";
                }
                else if (BMI >= 25 && BMI < 30){
                    BMI_Cat = "Overweight";
                }
                else if (BMI>=30 && BMI < 35 ){
                    BMI_Cat = "Obese Class 1 - Moderately Obese";
                }
                else if (BMI>= 35 && BMI < 40){
                    BMI_Cat = "Obese Class 2 - Severely Obese";
                }
                else {
                    BMI_Cat = "Obese Class 3 - Very Severely Obese";

                }
                final TextView BMICategory = root.findViewById(R.id.bmiCat);
                BMICategory.setText(BMI_Cat);
            }
        });
    }
}
