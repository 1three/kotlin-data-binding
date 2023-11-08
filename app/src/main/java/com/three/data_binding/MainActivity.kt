package com.three.data_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.three.data_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // 2번 방식 (1) - 데이터 바인딩
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 2번 방식 (2)
        // DataBindingUtil.setContentView 메서드를 통해 레이아웃과 데이터 바인딩 객체를 연결
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        // 1번 방식 - findViewById
//        // findViewById 메서드를 통해 뷰를 가져와 이벤트 처리
//        val btn = findViewById<Button>(R.id.btnId)
//        btn.setOnClickListener {
//            Toast.makeText(this, "Click!", Toast.LENGTH_LONG).show()
//        }

        // 2번 방식 (3)
        binding.btnId.setOnClickListener {
            Toast.makeText(this, "Click!", Toast.LENGTH_LONG).show()
        }
    }
}