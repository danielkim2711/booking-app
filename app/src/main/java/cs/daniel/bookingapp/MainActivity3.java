package cs.daniel.bookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity3 extends AppCompatActivity {
    final String SUMMARY_FILE = "summary_file.txt";
    final String BOOKING_FILE = "booking_time.txt";

    private TextView tvMain3LicenceNumber2, tvMain3LastName2, tvMain3DateOfBirth2, tvMain3BookingDate2, tvMain3AvailableTime2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tvMain3LicenceNumber2 = findViewById(R.id.tvMain3LicenceNumber2);
        tvMain3LastName2 = findViewById(R.id.tvMain3LastName2);
        tvMain3DateOfBirth2 = findViewById(R.id.tvMain3DateOfBirth2);
        tvMain3BookingDate2 = findViewById(R.id.tvMain3BookingDate2);
        tvMain3AvailableTime2 = findViewById(R.id.tvMain3AvailableTime2);

        FileInputStream fis1;
        FileInputStream fis2;

        try {
            fis1 = openFileInput(SUMMARY_FILE);
            BufferedReader user = new BufferedReader(new InputStreamReader(fis1));
            String licenceNumber = user.readLine();
            String lastName = user.readLine();
            String dateOfBirth = user.readLine();
            fis2 = openFileInput(BOOKING_FILE);
            BufferedReader timeSlot = new BufferedReader(new InputStreamReader(fis2));
            String bookingDate = timeSlot.readLine();
            String availableTime = timeSlot.readLine();

            tvMain3LicenceNumber2.setText(licenceNumber);
            tvMain3LastName2.setText(lastName);
            tvMain3DateOfBirth2.setText(dateOfBirth);
            tvMain3BookingDate2.setText(bookingDate);
            tvMain3AvailableTime2.setText(availableTime);

        } catch(FileNotFoundException e){
            Toast.makeText(this, SUMMARY_FILE +" unable to open ",
                    Toast.LENGTH_LONG).show();

        } catch(IOException e){
            Toast.makeText(this, SUMMARY_FILE +" unable to read file ",
                    Toast.LENGTH_LONG).show();
        }
    }

    public void runActivity1(View view) {
        Intent i = new Intent(this, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}