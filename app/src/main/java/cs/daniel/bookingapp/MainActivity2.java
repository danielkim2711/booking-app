package cs.daniel.bookingapp;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener, DatePickerDialog.OnDateSetListener {
    final String BOOKING_FILE = "booking_time.txt";
    final Calendar CALENDAR = Calendar.getInstance();

    private ScrollView scrollView1;
    private TextView tvDatePicker, tvAvailable, tvWarning, tvTime1, tvTime2, tvTime3, tvTime4, tvTime5, tvTime6, tvTime7, tvTime8;
    private Button btnDate;
    private RelativeLayout rl1, rl2, rl3, rl4, rl5, rl6, rl7, rl8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvDatePicker = findViewById(R.id.tvDatePicker);
        btnDate = findViewById(R.id.btnDate);

        setRelativeLayout();

        /* Create an onClickListener for timeslot */

        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog();
            }
        });
    }

    /* Set an onClickListener for relativeLayouts */

    private void setRelativeLayout() {
        rl1 = (RelativeLayout) findViewById(R.id.timeSlot1);
        rl1.setOnClickListener(this);

        rl2 = (RelativeLayout) findViewById(R.id.timeSlot2);
        rl2.setOnClickListener(this);

        rl3 = (RelativeLayout) findViewById(R.id.timeSlot3);
        rl3.setOnClickListener(this);

        rl4 = (RelativeLayout) findViewById(R.id.timeSlot4);
        rl4.setOnClickListener(this);

        rl5 = (RelativeLayout) findViewById(R.id.timeSlot5);
        rl5.setOnClickListener(this);

        rl6 = (RelativeLayout) findViewById(R.id.timeSlot6);
        rl6.setOnClickListener(this);

        rl7 = (RelativeLayout) findViewById(R.id.timeSlot7);
        rl7.setOnClickListener(this);

        rl8 = (RelativeLayout) findViewById(R.id.timeSlot8);
        rl8.setOnClickListener(this);
    }

    /* When clicked, save selected date and time into a text file and colour coding for timeslots */

    @Override
    public void onClick(View view) {
        FileOutputStream fos;
        String bookingDate = tvDatePicker.getText().toString() + "\n";
        switch (view.getId()) {
            case R.id.timeSlot1:
                tvTime1 = findViewById(R.id.tvTime1);
                rl1.setBackgroundColor(Color.parseColor("#f5f5f5"));
                rl2.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl3.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl4.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl5.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl6.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl7.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl8.setBackgroundColor(Color.parseColor("#00ff2a"));
                try {
                    fos = openFileOutput(BOOKING_FILE, MODE_PRIVATE);
                    String time1 = tvTime1.getText().toString() + "\n";

                    fos.write(bookingDate.getBytes());
                    fos.write(time1.getBytes());
                    fos.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.timeSlot2:
                tvTime2 = findViewById(R.id.tvTime2);
                rl1.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl2.setBackgroundColor(Color.parseColor("#f5f5f5"));
                rl3.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl4.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl5.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl6.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl7.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl8.setBackgroundColor(Color.parseColor("#00ff2a"));
                try {
                    fos = openFileOutput(BOOKING_FILE, MODE_PRIVATE);
                    String time2 = tvTime2.getText().toString() + "\n";

                    fos.write(bookingDate.getBytes());
                    fos.write(time2.getBytes());
                    fos.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.timeSlot3:
                tvTime3 = findViewById(R.id.tvTime3);
                rl1.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl2.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl3.setBackgroundColor(Color.parseColor("#f5f5f5"));
                rl4.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl5.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl6.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl7.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl8.setBackgroundColor(Color.parseColor("#00ff2a"));
                try {
                    fos = openFileOutput(BOOKING_FILE, MODE_PRIVATE);
                    String time3 = tvTime3.getText().toString() + "\n";

                    fos.write(bookingDate.getBytes());
                    fos.write(time3.getBytes());
                    fos.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.timeSlot4:
                tvTime4 = findViewById(R.id.tvTime4);
                rl1.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl2.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl3.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl4.setBackgroundColor(Color.parseColor("#f5f5f5"));
                rl5.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl6.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl7.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl8.setBackgroundColor(Color.parseColor("#00ff2a"));
                try {
                    fos = openFileOutput(BOOKING_FILE, MODE_PRIVATE);
                    String time4 = tvTime4.getText().toString() + "\n";

                    fos.write(bookingDate.getBytes());
                    fos.write(time4.getBytes());
                    fos.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.timeSlot5:
                tvTime5 = findViewById(R.id.tvTime5);
                rl1.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl2.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl3.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl4.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl5.setBackgroundColor(Color.parseColor("#f5f5f5"));
                rl6.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl7.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl8.setBackgroundColor(Color.parseColor("#00ff2a"));
                try {
                    fos = openFileOutput(BOOKING_FILE, MODE_PRIVATE);
                    String time5 = tvTime5.getText().toString() + "\n";

                    fos.write(bookingDate.getBytes());
                    fos.write(time5.getBytes());
                    fos.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.timeSlot6:
                tvTime6 = findViewById(R.id.tvTime6);
                rl1.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl2.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl3.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl4.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl5.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl6.setBackgroundColor(Color.parseColor("#f5f5f5"));
                rl7.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl8.setBackgroundColor(Color.parseColor("#00ff2a"));
                try {
                    fos = openFileOutput(BOOKING_FILE, MODE_PRIVATE);
                    String time6 = tvTime6.getText().toString() + "\n";

                    fos.write(bookingDate.getBytes());
                    fos.write(time6.getBytes());
                    fos.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.timeSlot7:
                tvTime7 = findViewById(R.id.tvTime7);
                rl1.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl2.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl3.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl4.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl5.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl6.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl7.setBackgroundColor(Color.parseColor("#f5f5f5"));
                rl8.setBackgroundColor(Color.parseColor("#00ff2a"));
                try {
                    fos = openFileOutput(BOOKING_FILE, MODE_PRIVATE);
                    String time7 = tvTime7.getText().toString() + "\n";

                    fos.write(bookingDate.getBytes());
                    fos.write(time7.getBytes());
                    fos.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            default:
                tvTime8 = findViewById(R.id.tvTime8);
                rl1.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl2.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl3.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl4.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl5.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl6.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl7.setBackgroundColor(Color.parseColor("#00ff2a"));
                rl8.setBackgroundColor(Color.parseColor("#f5f5f5"));
                try {
                    fos = openFileOutput(BOOKING_FILE, MODE_PRIVATE);
                    String time8 = tvTime8.getText().toString() + "\n";

                    fos.write(bookingDate.getBytes());
                    fos.write(time8.getBytes());
                    fos.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    /* Show a data picker dialog for booking */

    private void showDatePickerDialog() {
        int year =  CALENDAR.get(Calendar.YEAR);
        int month = CALENDAR.get(Calendar.MONTH);
        int day = CALENDAR.get(Calendar.DAY_OF_MONTH);

        int defaultSeconds = 1_000;
        int sevenDaysInMilliSeconds = 518_400_000;

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, this, year, month, day);

        datePickerDialog.getDatePicker().setMinDate(CALENDAR.getTimeInMillis() - defaultSeconds);
        datePickerDialog.getDatePicker().setMaxDate(CALENDAR.getTimeInMillis() + sevenDaysInMilliSeconds);

        datePickerDialog.show();
    }

    /* Based on selected date, show selected date and time to users.
    * If weekends, disable */

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
        scrollView1 = (ScrollView)findViewById(R.id.scrollView1);
        tvAvailable = findViewById(R.id.tvAvailable);
        tvWarning = findViewById(R.id.tvWarning);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
        Date date = new Date(year, month, dayOfMonth - 1);
        String dayOfTheWeek = simpleDateFormat.format(date);

        String selectedDate = dayOfTheWeek + " " + dayOfMonth + "/" + (month + 1) + "/" + year;
        tvDatePicker.setText(selectedDate);

        if (dayOfTheWeek.equals("Saturday") || dayOfTheWeek.equals("Sunday")) {
            tvWarning.setVisibility(View.VISIBLE);
            tvDatePicker.setVisibility(View.INVISIBLE);
            tvAvailable.setVisibility(View.INVISIBLE);
            scrollView1.setVisibility(View.INVISIBLE);
        }

        else {
            tvWarning.setVisibility(View.GONE);
            tvDatePicker.setVisibility(View.VISIBLE);
            tvAvailable.setVisibility(View.VISIBLE);
            scrollView1.setVisibility(View.VISIBLE);
            rl1.setVisibility(View.VISIBLE);
            rl2.setVisibility(View.VISIBLE);
            rl3.setVisibility(View.VISIBLE);
            rl4.setVisibility(View.VISIBLE);
            rl5.setVisibility(View.VISIBLE);
            rl6.setVisibility(View.VISIBLE);
            rl7.setVisibility(View.VISIBLE);
            rl8.setVisibility(View.VISIBLE);
        }
    }

    /* Go to the summary page once the button clicked */

    public void runActivity3(View view) {
        Intent intent;
        intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}