package book;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewBolder> {

    private List<Book> mBooks;
    public void setData(List<Book> list){
        this.mBooks=list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public BookViewBolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book,parent,false);
        return new BookViewBolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewBolder holder, int position) {
        Book book = mBooks.get(position);
        if (book==null){
            return;
        }
        holder.imgBook.setImageResource(book.getResourceId());
        holder.tvTitle.setText(book.getTitle());

    }

    @Override
    public int getItemCount() {
        if (mBooks!=null){
            return mBooks.size();
        }
        return 0;
    }

    public class BookViewBolder extends RecyclerView.ViewHolder {

        private ImageView imgBook;
        private TextView tvTitle;


        public BookViewBolder(@NonNull View itemView) {
            super(itemView);

            imgBook = itemView.findViewById(R.id.img_book);
            tvTitle = itemView.findViewById(R.id.tv_title);

        }
    }
}
