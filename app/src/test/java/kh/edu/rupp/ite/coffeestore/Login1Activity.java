package kh.edu.rupp.ite.coffeestore;

import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Root LinearLayout
        LinearLayout rootLayout = new LinearLayout(this);
        rootLayout.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        rootLayout.setOrientation(LinearLayout.VERTICAL);
        rootLayout.setGravity(Gravity.CENTER);
        rootLayout.setPadding(16, 16, 16, 16);
        rootLayout.setBackgroundColor(Color.parseColor("#EBDDC8"));

        // Coffee Image
        ImageView coffeeImage = new ImageView(this);
        LinearLayout.LayoutParams imageParams = new LinearLayout.LayoutParams(200, 200);
        imageParams.setMargins(0, 0, 0, 24);
        coffeeImage.setLayoutParams(imageParams);
        coffeeImage.setImageResource(R.drawable.coffee_image); // Replace with your drawable resource
        coffeeImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        coffeeImage.setContentDescription("Coffee Image");

        // Welcome Text
        TextView welcomeText = new TextView(this);
        LinearLayout.LayoutParams welcomeTextParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        welcomeTextParams.setMargins(0, 0, 0, 24);
        welcomeText.setLayoutParams(welcomeTextParams);
        welcomeText.setText("Welcome\nBack!");
        welcomeText.setTextSize(28);
        welcomeText.setTextColor(Color.parseColor("#3E2723"));
        welcomeText.setGravity(Gravity.CENTER);
        welcomeText.setTypeface(null, android.graphics.Typeface.BOLD);

        // Email Input
        EditText emailInput = new EditText(this);
        LinearLayout.LayoutParams emailInputParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        emailInputParams.setMargins(0, 0, 0, 12);
        emailInput.setLayoutParams(emailInputParams);
        emailInput.setHint("Email");
        emailInput.setHintTextColor(Color.parseColor("#8A7B6D"));
        emailInput.setTextColor(Color.parseColor("#3E2723"));
        emailInput.setBackgroundTintList(getColorStateList(R.color.dark_brown));
        emailInput.setPadding(12, 12, 12, 12);

        // Password Input
        EditText passwordInput = new EditText(this);
        LinearLayout.LayoutParams passwordInputParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        passwordInputParams.setMargins(0, 0, 0, 24);
        passwordInput.setLayoutParams(passwordInputParams);
        passwordInput.setHint("Password");
        passwordInput.setHintTextColor(Color.parseColor("#8A7B6D"));
        passwordInput.setTextColor(Color.parseColor("#3E2723"));
        passwordInput.setBackgroundTintList(getColorStateList(R.color.dark_brown));
        passwordInput.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        passwordInput.setPadding(12, 12, 12, 12);

        // Login Button
        Button loginButton = new Button(this);
        LinearLayout.LayoutParams loginButtonParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        loginButtonParams.setMargins(0, 0, 0, 12);
        loginButton.setLayoutParams(loginButtonParams);
        loginButton.setText("Login");
        loginButton.setBackgroundColor(Color.parseColor("#3E2723"));
        loginButton.setTextColor(Color.WHITE);
        loginButton.setPadding(12, 12, 12, 12);

        // Create Account Button
        Button createAccountButton = new Button(this);
        LinearLayout.LayoutParams createAccountButtonParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        createAccountButtonParams.setMargins(0, 0, 0, 16);
        createAccountButton.setLayoutParams(createAccountButtonParams);
        createAccountButton.setText("Create an account");
        createAccountButton.setTextColor(Color.parseColor("#3E2723"));
        createAccountButton.setBackgroundResource(R.drawable.button_outline); // Add outline drawable if needed
        createAccountButton.setPadding(12, 12, 12, 12);

        // Forgot Password Text
        TextView forgotPasswordText = new TextView(this);
        LinearLayout.LayoutParams forgotPasswordTextParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        forgotPasswordTextParams.setMargins(0, 8, 0, 0);
        forgotPasswordText.setLayoutParams(forgotPasswordTextParams);
        forgotPasswordText.setText("Forgot your password?");
        forgotPasswordText.setTextSize(14);
        forgotPasswordText.setTextColor(Color.parseColor("#3E2723"));
        forgotPasswordText.setGravity(Gravity.CENTER);

        // Add all views to the root layout
        rootLayout.addView(coffeeImage);
        rootLayout.addView(welcomeText);
        rootLayout.addView(emailInput);
        rootLayout.addView(passwordInput);
        rootLayout.addView(loginButton);
        rootLayout.addView(createAccountButton);
        rootLayout.addView(forgotPasswordText);

        // Set the root layout as the content view
        setContentView(rootLayout);
    }
}

