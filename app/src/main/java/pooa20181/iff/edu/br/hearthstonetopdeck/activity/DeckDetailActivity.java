package pooa20181.iff.edu.br.hearthstonetopdeck.activity;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.widget.ImageView;
import android.widget.TextView;

import pooa20181.iff.edu.br.hearthstonetopdeck.R;
import pooa20181.iff.edu.br.hearthstonetopdeck.model.Deck;

public class DeckDetailActivity extends AppCompatActivity {


    private TextView textViewnome;
    private TextView textViewdescricao;
    private TextView textViewdust;
    private ImageView imageViewPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deck_detail);
        Intent intent = getIntent();
        Deck deck = (Deck) intent.getSerializableExtra("deck");



        this.textViewnome = (TextView) findViewById(R.id.textViewnome);
        this.textViewnome.setText(deck.getNome());
        this.textViewdescricao = (TextView) findViewById(R.id.textViewdescricao);
        this.textViewdescricao.setText(deck.getDescricao());
        this.textViewdust = (TextView) findViewById(R.id.textViewdust);
        this.textViewdust.setText(String.valueOf(deck.getDust()));
        this.imageViewPhoto = (ImageView) findViewById(R.id.imageViewPhoto);
        this.imageViewPhoto.setImageResource(deck.getPhoto2());

    }

}
