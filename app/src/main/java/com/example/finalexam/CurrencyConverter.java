package com.example.finalexam;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CurrencyConverter extends AppCompatActivity {
    Spinner currencyDrop;
    TextView result;
    EditText euro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currency_converter);
        currencyDrop = findViewById(R.id.spinnerCurrency);
        String[] items = new String[]{"USD", "R"};
        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        currencyDrop.setAdapter(ad);
    }

    public void Converter(View view) {
        euro = findViewById(R.id.editTextTextEuro);
        result = findViewById(R.id.textViewValue);
        try {
            Double euroValue = Double.parseDouble(String.valueOf(euro.getText()));
            switch (currencyDrop.getSelectedItem().toString())
            {
                case "USD":
                    euroValue = euroValue / 0.92;
                    result.setText(euroValue.toString());
                    break;
                case "R":
                    euroValue = euroValue / 0.18;
                    result.setText(euroValue.toString());
                    break;
            }

        }
        catch (NumberFormatException e){
            Toast.makeText(getApplicationContext(),"Invalid input please enter only numbers",Toast.LENGTH_SHORT).show();
        }


    }
}
