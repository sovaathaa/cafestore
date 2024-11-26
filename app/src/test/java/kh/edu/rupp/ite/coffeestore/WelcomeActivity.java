package kh.edu.rupp.ite.coffeestore;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create the root LinearLayout
        LinearLayout rootLayout = new LinearLayout(this);
        rootLayout.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        rootLayout.setOrientation(LinearLayout.VERTICAL);
        rootLayout.setGravity(Gravity.CENTER);
        rootLayout.setBackgroundColor(Color.parseColor("#EBDDC8"));

        // Create the ImageView
        ImageView coffeeImage = new ImageView(this);
        LinearLayout.LayoutParams imageParams = new LinearLayout.LayoutParams(200, 200);
        imageParams.setMargins(0, 0, 0, 24);
        coffeeImage.setLayoutParams(imageParams);
        coffeeImage.setImageResource(R.drawable.coffee_image); // Replace with your drawable resource
        coffeeImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        coffeeImage.setContentDescription("Coffee Image");

        // Create the Title TextView
        TextView titleText = new TextView(this);
        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        titleParams.setMargins(0, 0, 0, 12);
        titleText.setLayoutParams(titleParams);
        titleText.setText("COFFEE SHOP");
        titleText.setTextSize(24);
        titleText.setTextColor(Color.BLACK);
        titleText.setGravity(Gravity.CENTER);
        titleText.setTypeface(null, android.graphics.Typeface.BOLD);

        // Create the Subtitle TextView
        TextView subtitleText = new TextView(this);
        LinearLayout.LayoutParams subtitleParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        subtitleParams.setMargins(0, 0, 0, 24);
        subtitleText.setLayoutParams(subtitleParams);
        subtitleText.setText("Enjoy the drink coffee.");
        subtitleText.setTextSize(16);
        subtitleText.setTextColor(Color.BLACK);
        subtitleText.setGravity(Gravity.CENTER);

        // Create the Button
        Button shopNowButton = new Button(this);
        LinearLayout.LayoutParams buttonParams = new LinearLayout.LayoutParams(
                200,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        buttonParams.setMargins(0, 12, 0, 0);
        shopNowButton.setLayoutParams(buttonParams);
        shopNowButton.setText("SHOP NOW");
        shopNowButton.setBackgroundColor(Color.parseColor("#3E2723"));
        shopNowButton.setTextColor(Color.WHITE);

        // Add all views to the root layout
        rootLayout.addView(coffeeImage);
        rootLayout.addView(titleText);
        rootLayout.addView(subtitleText);
        rootLayout.addView(shopNowButton);

        // Set the root layout as the content view
        setContentView(rootLayout);
    }
}

