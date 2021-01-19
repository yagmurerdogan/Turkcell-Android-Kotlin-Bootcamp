package com.tutorials.bottomnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_birinci.view.*

class FragmentBirinci : Fragment() {
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        val tasarim = inflater.inflate(R.layout.fragment_birinci,container,false)

        tasarim.buttonBir.setOnClickListener {
            Snackbar.make(tasarim.buttonBir,"Button bir tıklandı",Snackbar.LENGTH_SHORT).show()
        }

        return tasarim
    }
}