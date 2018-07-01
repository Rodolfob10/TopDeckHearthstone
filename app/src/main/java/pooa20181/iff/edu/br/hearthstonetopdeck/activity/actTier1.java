package pooa20181.iff.edu.br.hearthstonetopdeck.activity;


import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import pooa20181.iff.edu.br.hearthstonetopdeck.R;
import pooa20181.iff.edu.br.hearthstonetopdeck.adapter.DeckAdapter;
import pooa20181.iff.edu.br.hearthstonetopdeck.model.Deck;

public class actTier1 extends AppCompatActivity {

    private ListView listViewdecks;
    private List<Deck> decks1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_tier1);

        decks1 = new ArrayList<Deck>();

        decks1.add(new Deck("ODD Paladin","Bom Contra: Combo Priest,Taunt Druid, Even Warlock ", BigDecimal.valueOf(8180),R.drawable.paladin,R.drawable.deckpaladin));
        decks1.add(new Deck("Even Shaman","Bom Contra: Miracle Rougue, Control Mage, Even Warlock ", BigDecimal.valueOf(10900),R.drawable.shaman,R.drawable.deckshaman));
        decks1.add(new Deck("Even Warlock","Bom Contra: Midranger Hunter, Tempo Mage ", BigDecimal.valueOf(9680),R.drawable.warlock,R.drawable.deckwarlock));


        this.listViewdecks = (ListView) findViewById(R.id.listViewDecks);
        this.listViewdecks.setAdapter(new DeckAdapter(this,decks1));
        this.listViewdecks.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Deck deckTier1 = decks1.get(position);
                Intent intent = new Intent(actTier1.this, DeckDetailActivity.class);
                intent.putExtra("deck",deckTier1);
                startActivity(intent);
            }
        });


    }

}
