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

        imgProfilePhoto.setOnClickListener {

//            사진을 누르면, 큰 화면으로 진입(Intent -> 추가 액티비티 필요)
            val myIntent = Intent(this, ViewPhotoActivity::class.java)
            startActivity(myIntent)

        }

//        Glide 이용해서 웹의 이미지를 -> imgRecent에 반영하기
        Glide.with(this).load("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.joongang.co.kr%2Farticle%2F25008728&psig=AOvVaw0uzGDRNdyrb117bHS6JTk9&ust=1641433192226000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCPiRuqW9mfUCFQAAAAAdAAAAABAJ").into(imgRecent)

    }
}