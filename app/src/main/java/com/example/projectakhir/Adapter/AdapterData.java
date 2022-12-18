package com.example.projectakhir.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projectakhir.Model.DataModel;
import com.example.projectakhir.R;

import java.util.List;

public class AdapterData extends RecyclerView.Adapter<AdapterData.HolderData>{
    private Context context;
    private List<DataModel> listdata;

    public AdapterData(Context context, List<DataModel> listdata) {
        this.context = context;
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_dashboard,parent,false);
        HolderData holder = new HolderData(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        DataModel dm = listdata.get(position);
        holder.tvNamaBarang.setText(dm.getNama());
        holder.tvJual.setText(String.valueOf(dm.getHarga_jual()));
        holder.tvBeli.setText(String.valueOf(dm.getHarga_beli()));
        holder.tvJumlah.setText(String.valueOf(dm.getJumlah()));
        holder.tvUnit.setText(dm.getUnit());
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class HolderData extends RecyclerView.ViewHolder{
        TextView tvNamaBarang, tvBeli, tvJual, tvJumlah, tvUnit;

        public HolderData(@NonNull View itemView) {
            super(itemView);

        }
    }
}
