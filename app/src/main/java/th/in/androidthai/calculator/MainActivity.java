package th.in.androidthai.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import th.in.androidthai.calculator.Fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentmainfragment, new MainFragment()).commit();

        }
    }
}
