package com.example.day6joko;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapterkopi extends RecyclerView.Adapter<adapterkopi.KopiViewHolder> {

    private Context context;
    private List<kopimodel> kopimodels;
    private OnItemClickListener listener;

    public adapterkopi(Context context, List<kopimodel> kopimodels) {
        this.context = context;
        this.kopimodels = kopimodels;
    }

    public static boolean get(int position) {
        return false;
    }

    @NonNull
    @Override
    public KopiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.listkopi, parent, false);
        return new KopiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KopiViewHolder holder, int position) {
        kopimodel kopiModel = kopimodels.get(position);
        holder.imageView.setImageResource(kopiModel.getLogo());
        holder.textView.setText(kopiModel.getListKopi());
    }

    @Override
    public int getItemCount() {
        return kopimodels.size();
    }

    public class KopiViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public KopiViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION && listener != null) {
                        listener.onItemClick(kopimodels.get(position));
                    }
                }
            });
        }
    }

    public interface OnItemClickListener {
        int onItemClick(kopimodel model);

        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }
}