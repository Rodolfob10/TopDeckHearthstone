package pooa20181.iff.edu.br.hearthstonetopdeck.model;


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
import pooa20181.iff.edu.br.hearthstonetopdeck.activity.DeckTier1DetailActivity;
import pooa20181.iff.edu.br.hearthstonetopdeck.adapter.DeckTier1Adapter;

public class actTier1 extends AppCompatActivity {

    private ListView listViewdecks;
    private List<DeckTier1> decks1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_tier1);

        decks1 = new ArrayList<DeckTier1>();

        decks1.add(new DeckTier1("ODD Paladin","Bom Contra: Combo Priest,Taunt Druid, Even Warlock ", BigDecimal.valueOf(100),R.drawable.paladin));
        decks1.add(new DeckTier1("Even Shaman","Bom Contra: Miracle Rougue, Control Mage, Even Warlock ", BigDecimal.valueOf(200),R.drawable.shaman));
        decks1.add(new DeckTier1("Even Warlock","Bom Contra: Midranger Hunter, Tempo Mage ", BigDecimal.valueOf(300),R.drawable.warlock));


        this.listViewdecks = (ListView) findViewById(R.id.listViewDecksTier1);
        this.listViewdecks.setAdapter(new DeckTier1Adapter(this,decks1));
        this.listViewdecks.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DeckTier1 deckTier1 = decks1.get(position);
                Intent intent = new Intent(actTier1.this, DeckTier1DetailActivity.class);
                intent.putExtra("deckTier1",deckTier1);
                startActivity(intent);
            }
        });


    }

}
