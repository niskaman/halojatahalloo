package com.example.halojatahalloo.ui.dial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.halojatahalloo.R

class DialFragment : Fragment() {

    private lateinit var dialViewModel: DialViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dialViewModel =
            ViewModelProviders.of(this).get(DialViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dial, container, false)
        val textView: TextView = root.findViewById(R.id.text_dial)
        dialViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}