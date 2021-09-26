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

public class MainActivity4 extends AppCompatActivity {
    final String SUMMARY_FILE = "summary_file.txt";
    final String BOOKING_FILE = "booking_time.txt";

    private TextView tvMain4LicenceNumber2, tvMain4LastName2, tvMain4DateOfBirth2, tvMain4BookingDate2, tvMain4AvailableTime2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        tvMain4LicenceNumber2 = findViewById(R.id.tvMain4LicenceNumber2);
        tvMain4LastName2 = findViewById(R.id.tvMain4LastName2);
        tvMain4DateOfBirth2 = findViewById(R.id.tvMain4DateOfBirth2);
        tvMain4BookingDate2 = findViewById(R.id.tvMain4BookingDate2);
        tvMain4AvailableTime2 = findViewById(R.id.tvMain4AvailableTime2);

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

            tvMain4LicenceNumber2.setText(licenceNumber);
            tvMain4LastName2.setText(lastName);
            tvMain4DateOfBirth2.setText(dateOfBirth);
            tvMain4BookingDate2.setText(bookingDate);
            tvMain4AvailableTime2.setText(availableTime);

        } catch(FileNotFoundException e){
            Toast.makeText(this, SUMMARY_FILE + " unable to open.",
                    Toast.LENGTH_LONG).show();

        } catch(IOException e){
            Toast.makeText(this, SUMMARY_FILE + " unable to read file.",
                    Toast.LENGTH_LONG).show();
        }
    }

    public void runActivity1(View view) {
        Intent i = new Intent(this, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}