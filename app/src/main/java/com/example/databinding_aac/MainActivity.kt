package com.example.databinding_aac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding_aac.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 바인딩 객체에 setContentView()
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        // lifecycleOwner 지정 (Activity , fragment)
        binding.lifecycleOwner = this

        // student 객체 초기화
        val student = Student("Sam",31,"독서")

        // binding 객체의 student 값을 위에서 선언한 student 로 할당
        binding.student = student

    }

}