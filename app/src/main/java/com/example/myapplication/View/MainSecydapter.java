package com.example.myapplication.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.MainSpecies;
import com.example.myapplication.model.SubSpecy;

import java.util.List;

public class MainSecydapter extends RecyclerView.Adapter<MainSecydapter.CustomViewHolder> {
    private List<MainSpecies> MainSpecies;
    private Context context;

    public MainSecydapter(Context context, List<MainSpecies> MainSpecies) {
        this.context = context;
        // this.dataList = dataList;
        this.MainSpecies = MainSpecies;
    }
    @NonNull
    @Override
    public MainSecydapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.rv_sspecies, parent, false);
        MainSecydapter.CustomViewHolder vh = new MainSecydapter.CustomViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MainSecydapter.CustomViewHolder holder, int position) {
        String commonName = MainSpecies.get(position).getCommonName();
        String scientistName = MainSpecies.get(position).getScientificName();
        String Year = MainSpecies.get(position).getYear().toString();
        String type = MainSpecies.get(position).getType();
        String Biblio = MainSpecies.get(position).getBibliography().toString();
        String Author = MainSpecies.get(position).getAuthor().toString();

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
        return MainSpecies.size();
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
