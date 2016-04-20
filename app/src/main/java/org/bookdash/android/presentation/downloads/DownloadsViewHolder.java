package org.bookdash.android.presentation.downloads;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.bookdash.android.R;

public class DownloadsViewHolder extends RecyclerView.ViewHolder {
    TextView downloadTitleTextView;
    TextView downloadProgressTextView;
    ImageView downloadImageTextView;
    ImageButton downloadActionTextView;

    public DownloadsViewHolder(View itemView) {
        super(itemView);
        downloadActionTextView = (ImageButton) itemView.findViewById(R.id.image_button_delete_book);
        downloadImageTextView = (ImageView) itemView.findViewById(R.id.image_view_download_book_cover);
        downloadProgressTextView = (TextView) itemView.findViewById(R.id.download_progress);
        downloadTitleTextView = (TextView) itemView.findViewById(R.id.text_view_book_title_download);
    }
}
