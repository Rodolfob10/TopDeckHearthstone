package pooa20181.iff.edu.br.hearthstonetopdeck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    private Spinner deck;
    private Button btnok;
    private String item;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        deck = (Spinner) findViewById(R.id.spnDecks);
        btnok = (Button) findViewById(R.id.btnOk);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.tipos_deck, R.layout.support_simple_spinner_dropdown_item);
        deck.setAdapter(adapter);

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                deck();
            }
        });
    }
    public void deck(){
        item = deck.getSelectedItem().toString();

        if(item.equals("Tier 1")){
            Intent it = new Intent(MainActivity.this,actTier1.class);
            startActivity(it);
        }
        /*else {
            if(item.equals("Tier 2")){
                Intent it = new Intent(MainActivity.this,actTier2.class);
                startActivity(it);
            }
            else{
                Intent it = new Intent(MainActivity.this,actTier3.class);
                startActivity(it);
            }
        }*/


    }



}
