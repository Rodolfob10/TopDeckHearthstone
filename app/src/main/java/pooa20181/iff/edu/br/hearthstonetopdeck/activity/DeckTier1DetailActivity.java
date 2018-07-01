package pooa20181.iff.edu.br.hearthstonetopdeck.activity;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import pooa20181.iff.edu.br.hearthstonetopdeck.R;
import pooa20181.iff.edu.br.hearthstonetopdeck.model.actTier1;
import pooa20181.iff.edu.br.hearthstonetopdeck.model.DeckTier1;

public class DeckTier1DetailActivity extends AppCompatActivity {


    private Button buttonBack;
    private TextView textViewnome;
    private TextView textViewdescricao;
    private TextView textViewdust;
    private ImageView imageViewPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deck_tier1_detail);
        Intent intent = getIntent();
        DeckTier1 deckTier1 = (DeckTier1) intent.getSerializableExtra("deckTier1");
        this.buttonBack = (Button) findViewById(R.id.buttonVoltar);
        this.buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DeckTier1DetailActivity.this, actTier1.class);
                startActivity(intent);

            }
         });

        this.textViewnome = (TextView) findViewById(R.id.textViewnome);
        this.textViewnome.setText(deckTier1.getNome());
        this.textViewdescricao = (TextView) findViewById(R.id.textViewdescricao);
        this.textViewdescricao.setText(deckTier1.getDescricao());
        this.textViewdust = (TextView) findViewById(R.id.textViewdust);
        this.textViewdust.setText(deckTier1.getNome());
        this.imageViewPhoto = (ImageView) findViewById(R.id.imageViewPhoto);
        this.imageViewPhoto.setImageResource(deckTier1.getPhoto());

    }

}
