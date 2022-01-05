package com.neppplus.librarypractice_20220105

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCall.setOnClickListener {

//            010-1111-1111 에 전화 연결하기


        }


        imgProfilePhoto.setOnClickListener {

//            사진을 누르면, 큰 화면으로 진입(Intent -> 추가 액티비티 필요)
            val myIntent = Intent(this, ViewPhotoActivity::class.java)
            startActivity(myIntent)

        }

//        Glide 이용해서 웹의 이미지를 -> imgRecent에 반영하기
        Glide.with(this).load("https://pds.joongang.co.kr/news/component/htmlphoto_mmdata/202109/22/a01ab982-bb49-470c-a054-9412609f190a.jpg").into(imgRecent)

    }
}