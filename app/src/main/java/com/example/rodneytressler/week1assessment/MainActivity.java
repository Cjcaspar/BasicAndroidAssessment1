package com.example.rodneytressler.week1assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button submit;
    private TextView text;
    private EditText input;
    private String textInput;
    private Button nextPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.button_submit);
        text = findViewById(R.id.text_view);
        input = findViewById(R.id.edit_text);
        nextPage = findViewById(R.id.next);
        submit.setOnClickListener(changeText);
        nextPage.setOnClickListener(changeScreen);


    }

    View.OnClickListener changeText = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textInput = input.getText().toString();
                text.setText(textInput);
                toastUser();
                input.getText().clear();
            }
        };

    View.OnClickListener changeScreen = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            changeScreen();
        }
    };

    private void toastUser() {
        Toast.makeText(this, "Android is Awesome!", Toast.LENGTH_SHORT).show();
    }

    private void changeScreen() {
        Intent screen2 = new Intent(this, Main2Activity.class);
        startActivity(screen2);
    }
}

//Questions:
//
//        1. In your activity_main.xml file, locate the TextView widget and horizontally align it as it appears above.
//        2. In activity_main.xml, locate the Button widget and align it to the bottom of the page.
//        3. In activity_main.xml, set the background color of the screen to colorPrimary.
//        4. In your MainActivity file, create 3 member variables representing your TextView, EditText, and Button widgets.
//        5. Then bind each of these via their id’s when the activity is first created.
//        6. In your MainActivity file, create a method that sets an onClickListener for your Button widget. This method should be called when the activity is first created.
//        7.  In your onClickListener, create a String variable called ‘textInput’ that’s equal to the text in your EditText widget.
//        8. In your onClickListener, Set the text value of your TextView widget equal to the value of ‘textInput’.
//        9. In your onClickListener, clear your EditText box so that it removes all text onClick.
//        10. Go to Github and create a repo for your project.
//        Use the integrated terminal in Android Studio to initialize your project, add your new repository as its remote origin, add all changes to the file, commit your changes with a commit message containing, “[YOUR NAME] Week 1 Assessment” as its text, and push your code to the newly-created repository.
//
//        *Bonus*
//
//        11. Create a Toast whenever the button is clicked saying, “Android is Fun!”
//        12 Send the user to another activity with a separate button. The other activity should have a single textview that has “[YOUR NAME] loves Android”
//        Message Input
//
//        Message #android
