package kh.edu.rupp.ite.coffeestore;

import android.graphics.Color
import android.text.InputType
import android.widget.*

class MainActivity : void AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Root LinearLayout
        val rootLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(16, 16, 16, 16)
            setBackgroundColor(Color.parseColor("#EBDDC8"))
        }

        // Coffee Image
        val coffeeImage = ImageView(this).apply {
            layoutParams = LinearLayout.LayoutParams(200, 200).apply {
                setMargins(0, 0, 0, 24)
            }
            setImageResource(R.drawable.coffee_image)
            scaleType = ImageView.ScaleType.CENTER_CROP
            contentDescription = "Coffee Image"
        }

        // Welcome Text
        val welcomeText = TextView(this).apply {
            text = "Welcome\nBack!"
            textSize = 28f
            setTextColor(Color.parseColor("#3E2723"))
            gravity = Gravity.CENTER
            setTypeface(null, android.graphics.Typeface.BOLD)
            setPadding(0, 0, 0, 24)
        }

        // Email Input
        val emailInput = EditText(this).apply {
            hint = "Email"
            setText("oeurnsoknai321@email.com")
            setHintTextColor(Color.parseColor("#8A7B6D"))
            setTextColor(Color.parseColor("#3E2723"))
            backgroundTintList = getColorStateList(R.color.dark_brown)
            setPadding(12, 12, 12, 12)
        }

        // Password Input
        val passwordInput = EditText(this).apply {
            hint = "Password"
            setHintTextColor(Color.parseColor("#8A7B6D"))
            setTextColor(Color.parseColor("#3E2723"))
            backgroundTintList = getColorStateList(R.color.dark_brown)
            inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            setPadding(12, 12, 12, 12)
        }

        // Login Button
        val loginButton = Button(this).apply {
            text = "Login"
            setBackgroundColor(Color.parseColor("#3E2723"))
            setTextColor(Color.WHITE)
        }

        // Create Account Button
        val createAccountButton = Button(this).apply {
            text = "Create an account"
            setTextColor(Color.parseColor("#3E2723"))
        }

        // Forgot Password Text
        val forgotPasswordText = TextView(this).apply {
            text = "Forgot your password?"
            textSize = 14f
            setTextColor(Color.parseColor("#3E2723"))
        }

        // Add views to root layout
        rootLayout.apply {
            addView(coffeeImage)
            addView(welcomeText)
            addView(emailInput)
            addView(passwordInput)
            addView(loginButton)
            addView(createAccountButton)
            addView(forgotPasswordText)
        }

        // Set content view
        setContentView(rootLayout)
    }
}

