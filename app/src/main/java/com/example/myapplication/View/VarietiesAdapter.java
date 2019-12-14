package com.example.myapplication.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Image_;
import com.example.myapplication.model.RetroPhoto;
import com.example.myapplication.model.Variety;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.List;

public class VarietiesAdapter extends RecyclerView.Adapter<VarietiesAdapter.CustomViewHolder> {
    private List<Variety> ListVarieties;
    private Context context;

    public VarietiesAdapter(Context context, List<Variety> Varieties) {
        this.context = context;
        // this.dataList = dataList;
        this.ListVarieties = Varieties;
    }
    @NonNull
    @Override
    public VarietiesAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.rv_varieties, parent, false);
        VarietiesAdapter.CustomViewHolder vh = new VarietiesAdapter.CustomViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull VarietiesAdapter.CustomViewHolder holder, int position) {
        String commonName = ListVarieties.get(position).getCommonName();
        String scientistName = ListVarieties.get(position).getSScientificName();
        String Year = ListVarieties.get(position).getYear().toString();
        String type = ListVarieties.get(position).getType();
        String Biblio = ListVarieties.get(position).getBibliography().toString();
        String Author = ListVarieties.get(position).getAuthor().toString();

        if (commonName == null) {
            commonName = "Unknown";
        }
        else {
            commonName = commonName.substring(0, 1).toUpperCase() + commonName.substring(1);
            commonName = "Common Name : " + commonName;
        }
        holder.txtcommon_name.setText(commonName);


        if (scientistName == null){
            scientistName = "Unknown";
        }
        else{
            scientistName = scientistName.substring(0, 1).toUpperCase() + scientistName.substring(1);
            scientistName = "Scientific Name : " + scientistName;
        }
        holder.txtscientific_name.setText(scientistName);

        if (Year == null){
            Year = "Unknown";
        }

        holder.txtyear.setText(Year);

        if (type == null){
            type = "Unknown";
        }
        else{
            type = type.substring(0, 1).toUpperCase() + type.substring(1);
            type = "Type : " + type;
        }
        holder.txttype.setText(type);

        if (Biblio == null){
            Biblio = "Unknown";
        }
        else{
            Biblio = Biblio.substring(0, 1).toUpperCase() + Biblio.substring(1);
            Biblio = "Bibliography : " + Biblio;
        }
        holder.txtbiblio.setText(Biblio);

        if (Author == null){
            Author = "Unknown";
        }
        else{
            Author = Author.substring(0, 1).toUpperCase() + Author.substring(1);
            Author = "Author : " + Author;
        }
        holder.txtbiblio.setText(Author);
    }

    @Override
    public int getItemCount() {
        return ListVarieties.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        public final View mView;

        public TextView txtscientific_name;
        public TextView txtcommon_name;
        public TextView txtyear;
        public TextView txttype;
        public TextView txtbiblio;
        public TextView txtauthor;

        public CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            txtscientific_name = (TextView) mView.findViewById(R.id.VScientistN);
            txtcommon_name = (TextView) mView.findViewById(R.id.VCommonN);
            txtyear = (TextView) mView.findViewById(R.id.VYear);
            txttype = (TextView) mView.findViewById(R.id.VType);
            txtbiblio = (TextView) mView.findViewById(R.id.VBiblio);
            txtauthor = (TextView) mView.findViewById(R.id.VAuthor);

        }
    }
}
