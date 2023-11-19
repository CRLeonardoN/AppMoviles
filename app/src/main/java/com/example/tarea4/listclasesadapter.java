package com.example.tarea4;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class listclasesadapter extends RecyclerView.Adapter<listclasesadapter.ViewHolder> {
    private List<listclases> mData;
    private LayoutInflater mInflater;
    private Context context;

    public listclasesadapter(List<listclases>elements, Chats chats) {
    }

    public listclasesadapter (List<listclases> itemList, Context context){
        this.mInflater = LayoutInflater.from(context);
        this.context= context;
        this.mData=itemList;
    }
    @Override
    public int getItemCount() { return mData.size(); }

    @Override
    public listclasesadapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.list_clases, null);
        return new listclasesadapter.ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(final listclasesadapter.ViewHolder holder, final int position){
        holder.bindData(mData.get(position));
    }
    public void setItems (List<listclases>items){mData=items;}
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView clase,docente;
        ViewHolder(View itemView){
            super(itemView);
            iconImage=itemView.findViewById(R.id.IconImageView);
            clase=itemView.findViewById(R.id.cursoTextView);
            docente=itemView.findViewById(R.id.docenteTextView);
        }

        void bindData(final listclases item){
            iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            clase.setText(item.getClase());
            docente.setText(item.getDocente());
        }

    }

}
