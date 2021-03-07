package com.thejoeun.fragment_20210307.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.thejoeun.fragment_20210307.R

class FirstFragment : Fragment() {

//    어떤 xml 을 내용물로 삼을지 결정하는 코드 필요

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

}