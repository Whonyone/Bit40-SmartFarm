package com.ffarm.myapplication;

import android.graphics.pdf.PdfDocument;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class SlidePagerAdapter extends RecyclerView.Adapter<SlidePagerAdapter.ViewHolder> {
    private List<PageItem> pageItems; // 객체

    // 생성자
    public SlidePagerAdapter(List<PageItem> items) {
        this.pageItems = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.page_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PageItem currentItem = pageItems.get(position);
        holder.pageImage.setImageResource(currentItem.getImageResId());
        holder.pageTitle.setText(currentItem.getTitle());
        holder.pageDatetime.setText(currentItem.getDatetime());
        holder.pageDescription.setText(currentItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return pageItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView pageImage;
        TextView pageTitle, pageDatetime, pageDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            pageImage = itemView.findViewById(R.id.pageImage);
            pageTitle = itemView.findViewById(R.id.pageTitle);
            pageDatetime = itemView.findViewById(R.id.pageDatetime);
            pageDescription = itemView.findViewById(R.id.pageDescription);
        }
    }
}

