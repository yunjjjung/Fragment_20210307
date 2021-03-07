package com.thejoeun.fragment_20210307.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.thejoeun.fragment_20210307.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

//    어떤 xml 을 내용물로 삼을지 결정하는 코드 필요

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        toastBtn.setOnClickListener {

            Toast.makeText(activity, "프레그먼트를 통한 토스트", Toast.LENGTH_SHORT).show()

        }
    }

}