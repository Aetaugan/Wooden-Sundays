package com.example.myapplication.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.SubSpecy;
import com.example.myapplication.model.Variety;

import java.util.List;

public class SubcSecydapter extends RecyclerView.Adapter<SubcSecydapter.CustomViewHolder> {
    private List<SubSpecy> SubSpecy;
    private Context context;

    public SubcSecydapter(Context context, List<SubSpecy> SubSpecy) {
        this.context = context;
        // this.dataList = dataList;
        this.SubSpecy = SubSpecy;
    }
    @NonNull
    @Override
    public SubcSecydapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.rv_sspecies, parent, false);
        SubcSecydapter.CustomViewHolder vh = new SubcSecydapter.CustomViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull SubcSecydapter.CustomViewHolder holder, int position) {
        String commonName = SubSpecy.get(position).getCommonName();
        String scientistName = SubSpecy.get(position).getScientificName();
        Object Year = SubSpecy.get(position).getYear();
        String SYear, SBiblio, SAuthor;
        String type = SubSpecy.get(position).getType();
        Object Biblio = SubSpecy.get(position).getBibliography();
        Object Author = SubSpecy.get(position).getAuthor();

        if(Year != null){
            SYear = Year.toString();
        }else
        {
            SYear = "Unknown";
        }
        if(Biblio != null){
            SBiblio = Biblio.toString();
        }else
        {
            SBiblio = "Unknown";
        }
        if(Author != null){
            SAuthor = Author.toString();
        }else
        {
            SAuthor = "Unknown";
        }
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


        holder.txtyear.setText(SYear);

        if (type == null){
            type = "Unknown";
        }
        else{
            type = type.substring(0, 1).toUpperCase() + type.substring(1);
            type = "Type : " + type;
        }
        holder.txttype.setText(type);

       /* if (Biblio == null){
            Biblio = "Unknown";
        }
        else{
            Biblio = Biblio.substring(0, 1).toUpperCase() + Biblio.substring(1);
            Biblio = "Bibliography : " + Biblio;
        }*/
        holder.txtbiblio.setText(SBiblio);
/*
        if (Author == null){
            Author = "Unknown";
        }
        else{
            Author = Author.substring(0, 1).toUpperCase() + Author.substring(1);
            Author = "Author : " + Author;
        }*/
        holder.txtbiblio.setText(SAuthor);
    }

    @Override
    public int getItemCount() {
        return SubSpecy.size();
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
