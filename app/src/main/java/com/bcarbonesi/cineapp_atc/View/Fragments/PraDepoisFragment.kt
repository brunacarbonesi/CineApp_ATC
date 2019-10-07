package com.bcarbonesi.cineapp_atc.View.Fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.bcarbonesi.cineapp_atc.R

/**
 * A simple [Fragment] subclass.
 */
class PraDepoisFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pra_depois, container, false)
    }


}
