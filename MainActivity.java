package com.example.tuelm_fptsoftware.myapplication1231233133;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/** Gives a simple example of an Android app where the layout
 *  and strings are defined in the Java code. A later example
 *  does a similar task with layout and strings defined in
 *  XML (res/layout/main.xml).

 */

public class MainActivity extends Activity {
    /** Initializes the app when it is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String appName = "SayHello Application";
        String windowText =
                "Press the button below to receive " +
                        "a friendly greeting from Android.";
        String buttonLabel = "Show Greeting";

        LinearLayout mainWindow = new LinearLayout(this);
        mainWindow.setOrientation(LinearLayout.VERTICAL);
        setTitle(appName);

        LinearLayout mainWindow2 = new LinearLayout(this);
        mainWindow2.setOrientation(LinearLayout.VERTICAL);

        //TextView
        TextView tv1 = new TextView(this);
        tv1.setText(windowText);
        mainWindow2.addView(tv1);
        // Button
        Button bt1  = new Button(this);
        bt1.setText("Click Button");
        mainWindow2.addView(bt1);
        setContentView(mainWindow2);
        //Toast

        bt1.setOnClickListener(new Toaster());


        TextView label = new TextView(this);
        label.setText(windowText);
        mainWindow.addView(label);

        Button greetingButton = new Button(this);
        greetingButton.setText(buttonLabel);
     //   greetingButton.setOnClickListener(new Toaster());
        mainWindow.addView(greetingButton);

        // Add new
        Button btAAAA = new Button(this);
        btAAAA.setText("AAAAAAAAAAAA");
        mainWindow.addView(btAAAA);
        setContentView(mainWindow);
        ///// Add Git Newv.2 test
        Button btBBBB = new Button(this);
        btBBBB.setText("AAAAAAAAAAAA");
        mainWindow.addView(btBBBB);

        setContentView(mainWindow);
    }

    /** Implements View.ClickListener. Uses the named inner class
     *  approach: see later tutorial section on handling GUI events.
     */
    private class Toaster implements OnClickListener {
        /** Creates a Toast (temporary message) when button is pressed. */
        @Override
        public void onClick(View v) {
            String greetingText = "Hello from Android!";
            Toast tempMessage =
                    Toast.makeText(MainActivity.this,
                            greetingText,
                            Toast.LENGTH_LONG);
            tempMessage.show();
        }
    }
}
