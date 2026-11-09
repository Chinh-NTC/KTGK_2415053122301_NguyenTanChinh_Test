package com.example.quanlychitieu_test

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quanlychitieu_test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding_301: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding_301 = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding_301.root)

        supportActionBar?.title = "Nguyễn Tấn Chinh - 301 - Quản lý chi tiêu cá nhân"
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding_301.btnThemKhoanChi301.setOnClickListener {
            val ten = binding_301.edtTenKhoanChi301.toString().trim()
            val tien = binding_301.edtSoTien301.toString().trim()

            if(ten.isEmpty() || tien.isEmpty()){
                Toast.makeText(this, "Vui lòng nhập tên và số tiền!", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Đã thêm khoản chi thành công", Toast.LENGTH_SHORT).show()
            }

            binding_301.btnXemChiTiet301.setOnClickListener {
                Toast.makeText(this, "Chức năng xem chi tiết sẽ thực hiện ở câu 2", Toast.LENGTH_SHORT).show()
            }
        }
    }
}