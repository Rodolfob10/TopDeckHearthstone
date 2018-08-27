package pooa20181.iff.edu.br.hearthstonetopdeck.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.ArrayAdapter;



import com.facebook.AccessToken;


import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

import com.facebook.login.LoginManager;



import pooa20181.iff.edu.br.hearthstonetopdeck.R;

public class MainActivity extends AppCompatActivity {

    private Spinner deck;
    private Button btnok;
    private String item;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
        setContentView(R.layout.activity_main);

        if(AccessToken.getCurrentAccessToken() == null){
            goLoginScrean();
        }






        deck = (Spinner) findViewById(R.id.spnDecks);
        btnok = (Button) findViewById(R.id.btnOk);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.tipos_deck, R.layout.support_simple_spinner_dropdown_item);
        deck.setAdapter(adapter);

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                deck();
            }
        });
    }

    private void goLoginScrean() {
        Intent intent = new Intent(this,LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }

    public void logout(View view){
        LoginManager.getInstance().logOut();
        goLoginScrean();
    }


    public void deck() {
        item = deck.getSelectedItem().toString();

        if (item.equals("Tier 1")) {
            Intent it = new Intent(MainActivity.this, actTier1.class);
            startActivity(it);
        } else {
            if (item.equals("Tier 2")) {
                Intent it = new Intent(MainActivity.this, actTier2.class);
                startActivity(it);
            }
            else{
                Intent it = new Intent(MainActivity.this,actTier3.class);
                startActivity(it);
            }
        }


        }


    }
