package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
      private Button exitbutton;
      private AlertDialog.Builder  alertDialogbuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exitbutton = (Button) findViewById(R.id.buttonId);
        exitbutton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        alertDialogbuilder = new AlertDialog.Builder(MainActivity.this);
     alertDialogbuilder.setTitle(R.string.title);
     alertDialogbuilder.setMessage(R.string.message_text);

   alertDialogbuilder.setIcon(R.drawable.question);
   alertDialogbuilder.setCancelable(false);
   alertDialogbuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
       @Override
       public void onClick(DialogInterface dialog, int which) {
           Toast.makeText(MainActivity.this,"Close your appllication",Toast.LENGTH_SHORT).show();
           finish();
       }
   });
   alertDialogbuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
       @Override
       public void onClick(DialogInterface dialog, int which) {
           Toast.makeText(MainActivity.this,"You have clicked on no button",Toast.LENGTH_SHORT).show();
       }
   });

   alertDialogbuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
       @Override
       public void onClick(DialogInterface dialog, int which) {
       dialog.cancel();

       }
   });
        AlertDialog alertDialog = alertDialogbuilder.create();
        alertDialog.show();

    }
}
