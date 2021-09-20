package cs.daniel.bookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    final String SUMMARY_FILE = "summary_file.txt";

    private EditText edtLicenceNumber, edtLicenceVersion, edtLastName, edtDateOfBirthField;
    public ArrayList<String> users = new ArrayList<String>();
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void saveFile (View view){
        FileOutputStream fos;
        try {
            fos = openFileOutput(SUMMARY_FILE, MODE_PRIVATE);
            String licenceNumber = edtLicenceNumber.getText().toString().toUpperCase() + "\n";
            String lastName = edtLastName.getText().toString() + "\n";
            String dateOfBirth = edtDateOfBirthField.getText().toString();
            user = new User(licenceNumber, lastName, dateOfBirth);
            users.add(user);

            fos.write(licenceNumber.getBytes());
            fos.write(lastName.getBytes());
            fos.write(dateOfBirth.getBytes());
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void runActivity2 (View view){
        edtLicenceNumber = findViewById(R.id.edtLicenceNumber);
        edtLicenceVersion = findViewById(R.id.edtLicenceVersion);
        edtLastName = findViewById(R.id.edtLastName);
        edtDateOfBirthField = findViewById(R.id.edtDateOfBirthField);

        saveFile(view);

        if (TextUtils.isEmpty(edtLicenceNumber.getText()) || (edtLicenceNumber.length() != 8))
            edtLicenceNumber.setError("Please type a valid licence number.");

        else if (TextUtils.isEmpty(edtLicenceVersion.getText()) || (edtLicenceVersion.length() != 3))
            edtLicenceVersion.setError("Please type a valid licence version.");

        else if (TextUtils.isEmpty(edtLastName.getText()))
            edtLastName.setError("Please type your last name.");

        else if (TextUtils.isEmpty(edtDateOfBirthField.getText()) || (edtDateOfBirthField.length() != 10))
            edtDateOfBirthField.setError("Please type a valid date of birth in (DD-MM-YYYY).");

        else {
            Intent intent;
            intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }
    }
}