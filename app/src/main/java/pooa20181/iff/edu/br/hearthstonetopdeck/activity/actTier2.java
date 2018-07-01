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

public class actTier2 extends AppCompatActivity {

    private ListView listViewdecks;
    private List<Deck> decks1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_tier1);

        decks1 = new ArrayList<Deck>();

        decks1.add(new Deck("Taunt Druid","Bom Contra: Even Warlock, Control Mage  ", BigDecimal.valueOf(8600),R.drawable.druid,R.drawable.deckdruid));
        decks1.add(new Deck("Control Mage","Bom Contra: Token Druid, Zoo Warlock ", BigDecimal.valueOf(13460),R.drawable.mage,R.drawable.deckmage));
        decks1.add(new Deck("Combo Priest","Bom Contra: Spell Hunter,Cube Warlock  e Control Warrior ", BigDecimal.valueOf(3600),R.drawable.priest,R.drawable.deckpriest));


        this.listViewdecks = (ListView) findViewById(R.id.listViewDecks);
        this.listViewdecks.setAdapter(new DeckAdapter(this,decks1));
        this.listViewdecks.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Deck deckTier1 = decks1.get(position);
                Intent intent = new Intent(actTier2.this, DeckDetailActivity.class);
                intent.putExtra("deck",deckTier1);
                startActivity(intent);
            }
        });


    }
}
