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

public class actTier3 extends AppCompatActivity {

    private ListView listViewdecks;
    private List<Deck> decks1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_tier1);

        decks1 = new ArrayList<Deck>();

        decks1.add(new Deck("Recruit Hunter","Bom Contra: Malygos Druid, Quest Priest ", BigDecimal.valueOf(11660),R.drawable.hunter,R.drawable.deckhunter));
        decks1.add(new Deck("Control Warrior","Bom Contra: Togwaggle Druid, Quest Warrior ", BigDecimal.valueOf(16160),R.drawable.warrior,R.drawable.deckwarrior));
        decks1.add(new Deck("Miracle Rogue","Bom Contra: Cube Warlock, Control Mage ", BigDecimal.valueOf(7960),R.drawable.rogue,R.drawable.deckrogue));


        this.listViewdecks = (ListView) findViewById(R.id.listViewDecks);
        this.listViewdecks.setAdapter(new DeckAdapter(this,decks1));
        this.listViewdecks.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Deck deckTier1 = decks1.get(position);
                Intent intent = new Intent(actTier3.this, DeckDetailActivity.class);
                intent.putExtra("deck",deckTier1);
                startActivity(intent);
            }
        });


    }
}


