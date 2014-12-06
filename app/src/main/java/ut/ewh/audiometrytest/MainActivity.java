package ut.ewh.audiometrytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * goes to PreTestInformation activity
     * @param view- current view
     */
    public void gotoPretest(View view){
        Intent intent = new Intent(this, PreTestInformation.class);
        startActivity(intent);
    }

    /**
     * goes to ExportData activity
     * @param view- current view
     */
    public void gotoExport(View view){
        Intent intent = new Intent(this, TestLookup.class);
        startActivity(intent);
    }
    public void gotoAcknowledgements(View view){
        Intent intent = new Intent(this, Acknowledgements.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
