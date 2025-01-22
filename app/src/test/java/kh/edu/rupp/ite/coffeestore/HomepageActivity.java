package kh.edu.rupp.ite.coffeestore;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class HomepageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Root layout (LinearLayout)
        LinearLayout rootLayout = new LinearLayout(this);
        rootLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));
        rootLayout.setOrientation(LinearLayout.VERTICAL);
        rootLayout.setPadding(16, 16, 16, 16);
        rootLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.milk));

        // Search and notification bar
        LinearLayout searchBarLayout = new LinearLayout(this);
        searchBarLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        searchBarLayout.setOrientation(LinearLayout.HORIZONTAL);

        EditText searchBar = new EditText(this);
        searchBar.setLayoutParams(new LinearLayout.LayoutParams(
                0,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                1
        ));
        searchBar.setHint("Good day, soknai");
        searchBar.setPadding(12, 12, 12, 12);
        searchBar.setTextColor(Color.parseColor("#3E2723"));
        searchBar.setHintTextColor(Color.parseColor("#8A7B6D"));
        searchBar.setBackground(ContextCompat.getDrawable(this, R.drawable.search_background));
        searchBarLayout.addView(searchBar);

        ImageView searchIcon = new ImageView(this);
        searchIcon.setLayoutParams(new LinearLayout.LayoutParams(
                60,
                60
        ));
        searchIcon.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.search_icon));
        searchBarLayout.addView(searchIcon);

        rootLayout.addView(searchBarLayout);

        // Title
        TextView title = new TextView(this);
        title.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        title.setText("What would you like to drink today?");
        title.setTextColor(Color.BLACK);
        title.setTextSize(18);
        rootLayout.addView(title);

        // Horizontal tabs
        HorizontalScrollView tabScrollView = new HorizontalScrollView(this);
        tabScrollView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));

        LinearLayout tabLayout = new LinearLayout(this);
        tabLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        tabLayout.setOrientation(LinearLayout.HORIZONTAL);

        // Tabs
        String[] tabs = {"Popular", "Black coffee", "Winter special", "Decaf"};
        for (String tab : tabs) {
            TextView tabText = new TextView(this);
            tabText.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));
            tabText.setPadding(12, 12, 12, 12);
            tabText.setText(tab);
            tabText.setTextSize(16);
            tabText.setTextColor(Color.WHITE);
            tabText.setBackground(ContextCompat.getDrawable(this, R.drawable.tab_unselected_background));
            tabLayout.addView(tabText);
        }

        tabScrollView.addView(tabLayout);
        rootLayout.addView(tabScrollView);

        // Coffee List
        ScrollView coffeeListScrollView = new ScrollView(this);
        coffeeListScrollView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                495
        ));
        coffeeListScrollView.setBackgroundColor(ContextCompat.getColor(this, R.color.brown));

        LinearLayout coffeeListLayout = new LinearLayout(this);
        coffeeListLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        coffeeListLayout.setOrientation(LinearLayout.VERTICAL);
        coffeeListLayout.setPadding(16, 16, 16, 16);

        // Coffee items
        String[][] coffeeItems = {
                {"Black coffee", "ICED AMERICANO", "img_3"},
                {"Winter special", "CAPPUCCINO LATTE", "img_4"},
                {"Decaf", "SILKY CAFE AU LAIT", "img_5"},
                {"Chocolate", "Iced Chocolate", "img_6"}
        };

        for (String[] coffee : coffeeItems) {
            LinearLayout coffeeItemLayout = new LinearLayout(this);
            coffeeItemLayout.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));
            coffeeItemLayout.setOrientation(LinearLayout.HORIZONTAL);
            coffeeItemLayout.setPadding(8, 8, 8, 8);
            coffeeItemLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.milk));

            ImageView coffeeImage = new ImageView(this);
            coffeeImage.setLayoutParams(new LinearLayout.LayoutParams(
                    60,
                    60
            ));
            coffeeImage.setImageDrawable(ContextCompat.getDrawable(this, getResources().getIdentifier(coffee[2], "drawable", getPackageName())));
            coffeeItemLayout.addView(coffeeImage);

            LinearLayout coffeeInfoLayout = new LinearLayout(this);
            coffeeInfoLayout.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));
            coffeeInfoLayout.setOrientation(LinearLayout.VERTICAL);

            TextView coffeeTitle = new TextView(this);
            coffeeTitle.setText(coffee[0]);
            coffeeTitle.setTextSize(12);
            coffeeTitle.setTextColor(Color.BLACK);
            coffeeInfoLayout.addView(coffeeTitle);

            TextView coffeeSubtitle = new TextView(this);
            coffeeSubtitle.setText(coffee[1]);
            coffeeSubtitle.setTextSize(18);
            coffeeSubtitle.setTextColor(Color.DKGRAY);
            coffeeInfoLayout.addView(coffeeSubtitle);

            coffeeItemLayout.addView(coffeeInfoLayout);
            coffeeListLayout.addView(coffeeItemLayout);
        }

        coffeeListScrollView.addView(coffeeListLayout);
        rootLayout.addView(coffeeListScrollView);

        // Bottom navigation
        LinearLayout bottomNavLayout = new LinearLayout(this);
        bottomNavLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        bottomNavLayout.setOrientation(LinearLayout.HORIZONTAL);

        int[] navIcons = {R.drawable.ic_home, R.drawable.ic_cart, R.drawable.ic_favorites, R.drawable.ic_profile};
        for (int icon : navIcons) {
            ImageView navIcon = new ImageView(this);
            navIcon.setLayoutParams(new LinearLayout.LayoutParams(60, 60));
            navIcon.setImageDrawable(ContextCompat.getDrawable(this, icon));
            bottomNavLayout.addView(navIcon);
        }

        rootLayout.addView(bottomNavLayout);

        // Set the root layout as the content view
        setContentView(rootLayout);
    }
}
