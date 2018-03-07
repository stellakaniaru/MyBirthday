package com.example.mybirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public int counter = 0;
    Boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //mess method is declared in XML file
    //This function will call when we click on button
    //and we have to pass View object in this method
    //which will take id of clicked button

    public void change_image(View v)
    {
        ImageView iv= (ImageView) findViewById(R.id.pic1);
        TextView message = (TextView) findViewById(R.id.text1);
        TextView message2 = (TextView) findViewById(R.id.text2);


//        //use flag to change image
//        if(flag==false)
//        {
//            iv.setImageResource(R.drawable.kelvin2);
//            flag=true;
//        }
//        else
//        {
//            iv.setImageResource(R.drawable.kelvin3);
//            flag=false;
//        }
        if(counter == 0){
            iv.setImageResource(R.drawable.kev3);
        }
        if(counter == 1){
            iv.setImageResource(R.drawable.kev4);
        }
        if(counter == 2){
            iv.setImageResource(R.drawable.kev2);
        }

        if(counter == 3){
            iv.setImageResource(R.drawable.kelvin2);
            message.setText("Amazing");
            message2.setText("Uniquely Weird...");
        }
        if(counter == 4){
            iv.setImageResource(R.drawable.kelvin3);
            message.setText("Calm and surprisingly cool,");
            message2.setText("Wise...");
        }
        if(counter == 5){
            iv.setImageResource(R.drawable.kelvin4);
            message.setText("Inquisitive,");
            message2.setText("Collected...");
        }
        if(counter == 6){
            iv.setImageResource(R.drawable.kelvin5);
            message.setText("Caring and Kind,");
            message2.setText("and last but not least...");
        }
        if(counter == 7){
            iv.setImageResource(R.drawable.kelvin);
            message.setText("I love you,");
            message2.setText("Just the way you are :)");

        }
        if(counter == 8){
            iv.setImageResource(R.drawable.kev5);
            message.setText("");
            message2.setText("");

        }
        if(counter == 9){
            iv.setImageResource(R.drawable.kev);
            counter = -1;
        }
        counter++;
    }
}
