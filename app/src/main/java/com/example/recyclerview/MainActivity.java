package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import book.Book;
import category.Category;
import category.CategoryAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvCategory=findViewById(R.id.rcv_category);
        categoryAdapter=new CategoryAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        rcvCategory.setLayoutManager(linearLayoutManager);
        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);
    }
    private List<Category> getListCategory(){
        List<Category> listCategary = new ArrayList<>();
        List<Book> listBook = new ArrayList<>();
        listBook.add(new Book(R.drawable.img1,"Book 1"));
        listBook.add(new Book(R.drawable.img2,"Book 2"));
        listBook.add(new Book(R.drawable.img3,"Book 3"));
        listBook.add(new Book(R.drawable.img4,"Book 4"));
        listBook.add(new Book(R.drawable.img1,"Book 1"));
        listBook.add(new Book(R.drawable.img2,"Book 2"));
        listBook.add(new Book(R.drawable.img3,"Book 3"));
        listBook.add(new Book(R.drawable.img4,"Book 4"));
        listCategary.add(new Category("Category 1", listBook));
        listCategary.add(new Category("Category 2", listBook));
        listCategary.add(new Category("Category 3", listBook));
        listCategary.add(new Category("Category 4", listBook));
        return listCategary;
    }
}