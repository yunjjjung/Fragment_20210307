package com.thejoeun.fragment_20210307.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.thejoeun.fragment_20210307.BaseActivity
import com.thejoeun.fragment_20210307.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        secondToastBtn.setOnClickListener {

            Toast.makeText(activity, "두번째 프래그먼트 토스트", Toast.LENGTH_SHORT).show()
        }

    }
}