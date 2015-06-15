package app.com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

 //   @Override
 //   public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
 //       getMenuInflater().inflate(R.menu.menu_main, menu);
 //       return true;
 //   }

 //   @Override
 //   public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
 //       int id = item.getItemId();

        //noinspection SimplifiableIfStatement
 //       if (id == R.id.action_settings) {
 //           return true;
 //       }

 //       return super.onOptionsItemSelected(item);
 //   }

    public void spotifyStreamerToast(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This will lauch Spotify Streamer!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void scoresAppToast(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This will lauch Scores App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void libraryAppToast(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This will lauch Library App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void buildItBiggerToast(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This will lauch Build It Bigger";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void baconReaderToast(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This will lauch Bacon Reader!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void capstoneToast(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This will lauch capstone: My own app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void aboutToast(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "My App Portfolio\nDesigned by:\nPietro Mincuzzi";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
