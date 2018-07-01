package pooa20181.iff.edu.br.hearthstonetopdeck.adapter;

import pooa20181.iff.edu.br.hearthstonetopdeck.R;
import pooa20181.iff.edu.br.hearthstonetopdeck.model.DeckTier1;

import java.util.List;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.*;
import android.content.*;
import android.widget.*;

public class DeckTier1Adapter extends ArrayAdapter <DeckTier1> {

    private Context context;
    private List<DeckTier1> decks1;

    public DeckTier1Adapter(Context context,List<DeckTier1>  decks1){
        super(context, R.layout.tier1_list_layout,decks1);
        this.context = context;
        this.decks1 = decks1;


    }

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.tier1_list_layout,parent,false);

        ImageView imageViewPhoto = (ImageView) view.findViewById(R.id.imageView);
        imageViewPhoto.setImageResource(decks1.get(position).getPhoto());

        TextView TextViewnome = (TextView) view.findViewById(R.id.textViewnome);
        TextViewnome.setText(String.valueOf(decks1.get(position).getNome()));


        return view;
    }
}
