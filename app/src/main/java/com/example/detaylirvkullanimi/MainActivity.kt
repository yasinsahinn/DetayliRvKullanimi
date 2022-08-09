package com.example.detaylirvkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    private lateinit var filmlerArrayList:ArrayList<Filmler>
    private lateinit var adapter:FilmlerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv.setHasFixedSize(true)
        rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val f1 = Filmler(1,"La Case De Papel","lacasedepapel",49.50)
        val f2= Filmler(2,"Prison Break","prisonbreak",44.50)
        val f3 = Filmler(3,"Breaking Bad","breakingbad",57.50)
        val f4 = Filmler(4,"Sherlock Holmes","sherlock",51.50)
        val f5 = Filmler(5,"The Umbrella Academy","theumbrellaacademy",53.50)
        val f6 = Filmler(6,"Stranger Things","strangerthings",49.50)

        filmlerArrayList = ArrayList<Filmler>()
        filmlerArrayList.add(f1)
        filmlerArrayList.add(f2)
        filmlerArrayList.add(f3)
        filmlerArrayList.add(f4)
        filmlerArrayList.add(f5)
        filmlerArrayList.add(f6)

        adapter = FilmlerAdapter(applicationContext,filmlerArrayList)

        rv.adapter = adapter


    }
}