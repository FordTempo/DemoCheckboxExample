package sg.edu.rp.c346.id22011555.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbenabled;
    Button btnCheck;
    TextView tvshow;

    Button btnToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbenabled = findViewById(R.id.checkBoxDiscount);
        btnCheck = findViewById(R.id.button);
        tvshow = findViewById(R.id.textView);
        btnToast = findViewById(R.id.buttonToast);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyActivity", "Inside onClick()");
                Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_LONG).show();
                if (cbenabled.isChecked()) {
                    double pay = calcPay(100, 20);
                    tvshow.setText("The discount is given. You need to pay " + pay);
                } else {
                    double pay = calcPay(100, 0);
                    tvshow.setText("The discount is not given. You need to pay " + pay);
                }
            }

            private double calcPay(double price, double discount) {
                double pay = price * (1 - discount / 100);
                return pay;
            }
        });
    };
}

        
        
