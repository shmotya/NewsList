package com.example.newslist

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.newslist.adapter.NewsAdapter
import com.example.newslist.databinding.ActivityMainBinding
import com.example.newslist.model.NewsModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: NewsAdapter
    private lateinit var model: NewsModel
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initial()

    }
    private fun initial(){

        recyclerView = binding.rvNews
        adapter = NewsAdapter()
        recyclerView.adapter = adapter
        adapter.setList(getNews())
    }




    fun getNews(): ArrayList<NewsModel>{
        val newsList = ArrayList<NewsModel>()
        newsList.add(NewsModel("Header 1", "Description 1", BitmapFactory.decodeResource(resources, R.mipmap.ccd_logo)))
        newsList.add(NewsModel("Header 2", "Description 2", BitmapFactory.decodeResource(resources, R.mipmap.ccd_logo)))
        newsList.add(NewsModel("Header 3", "Description 3", BitmapFactory.decodeResource(resources, R.mipmap.ccd_logo)))
        newsList.add(NewsModel("Header 4", "Description 4", BitmapFactory.decodeResource(resources, R.mipmap.ccd_logo)))
        newsList.add(NewsModel("Header 5", "Description 5", BitmapFactory.decodeResource(resources, R.mipmap.ccd_logo)))
        newsList.add(NewsModel("Header 6", "Description 6", BitmapFactory.decodeResource(resources, R.mipmap.ccd_logo)))
        newsList.add(NewsModel("Header 7", "Description 7", BitmapFactory.decodeResource(resources, R.mipmap.ccd_logo)))
        newsList.add(NewsModel("Header 1", "Description 1", BitmapFactory.decodeResource(resources, R.mipmap.ccd_logo)))
        newsList.add(NewsModel("Header 2", "Description 2", BitmapFactory.decodeResource(resources, R.mipmap.ccd_logo)))
        newsList.add(NewsModel("Header 3", "Description 3", BitmapFactory.decodeResource(resources, R.mipmap.ccd_logo)))
        newsList.add(NewsModel("Header 4", "Description 4", BitmapFactory.decodeResource(resources, R.mipmap.ccd_logo)))
        newsList.add(NewsModel("Header 5", "Description 5", BitmapFactory.decodeResource(resources, R.mipmap.ccd_logo)))
        newsList.add(NewsModel("Header 6", "Description 6", BitmapFactory.decodeResource(resources, R.mipmap.ccd_logo)))
        newsList.add(NewsModel("Header 7", "Description 7", BitmapFactory.decodeResource(resources, R.mipmap.ccd_logo)))
        newsList.add(NewsModel("Header 8", "Description 8", BitmapFactory.decodeResource(resources, R.mipmap.ccd_logo)))


//        val news = NewsModel("Big News", "Big News Description", BitmapFactory.decodeResource(resources, R.mipmap.ccd_logo))
        return newsList
    }



}
