package pooa20181.iff.edu.br.hearthstonetopdeck.activity;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import pooa20181.iff.edu.br.hearthstonetopdeck.R;

public class MainActivity extends AppCompatActivity {

    private Spinner deck;
    private Button btnok;
    private String item;
    TextView txtStatus;
    LoginButton login_button;
    CallbackManager callbackManager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FacebookSdk.sdkInitialize(getApplicationContext());
        initializeControls();
        loginFB();

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

    private void initializeControls(){
        callbackManager = CallbackManager.Factory.create();
        txtStatus = (TextView)findViewById(R.id.txtStatus);
        login_button = (LoginButton)findViewById(R.id.login_button);
    }

    private void loginFB(){
        LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                txtStatus.setText("Login Sucess\n" + loginResult.getAccessToken());
            }

            @Override
            public void onCancel() {
                txtStatus.setText("Login Cancelled");
            }

            @Override
            public void onError(FacebookException error) {
                txtStatus.setText("Login Erro:" + error.getMessage());
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
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
