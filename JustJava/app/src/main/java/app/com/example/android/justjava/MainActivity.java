package app.com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private int numberOfCupsOrdered=0;
    /**
     * This method is called when the order button is clicked.
     */
    public void increaseCoffeeQuantity(View view)
    {
        numberOfCupsOrdered = numberOfCupsOrdered+1;
        display(numberOfCupsOrdered);
    }
    public void decreaseCoffeeQuantity(View view)
    {
        if(numberOfCupsOrdered != 0) {
            numberOfCupsOrdered = numberOfCupsOrdered - 1;
            display(numberOfCupsOrdered);
        }

    }

    public void submitOrder(View view) {
        String message = "Total $" + numberOfCupsOrdered*2 + "\n ThankYou!";
                displayMessage(message);

        //display(numberOfCupsOrdered);
        //displayPrice(numberOfCupsOrdered*5);
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}