package com.bcarbonesi.cineapp_atc.View.Fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.bcarbonesi.cineapp_atc.R

/**
 * A simple [Fragment] subclass.
 */
class NovidadesFragment : Fragment() {

//    lateinit var tmdbViewModel: TmdbViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_novidades, container, false)

//        tmdbViewModel = ViewModelProviders.of(this).get(TmdbViewModel.class)
//
//        tmdbViewModel.fetchMovies()
//
//        tmdbViewModel.popularMovies.observe(this, Observer {
//
//            //TODO - Your Update UI Logic
//        })


    }


}
