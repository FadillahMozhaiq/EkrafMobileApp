package id.co.project.navdrawerdefault.ui.authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import id.co.project.navdrawerdefault.MainActivity
import id.co.project.navdrawerdefault.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        buttonLogin()
        buttonForgotPassword()
        buttonTextLogin()

    }

    private fun buttonForgotPassword() {
        binding.tvForgotPassword.setOnClickListener {
            Toast.makeText(this@LoginActivity, "Fitur Tidak Belum Tersedia", Toast.LENGTH_SHORT).show()
        }
    }

    private fun buttonLogin() {
        binding.buttonLogin.setOnClickListener {
            Intent(this@LoginActivity, MainActivity::class.java).also {
                startActivity(it)
                Toast.makeText(this@LoginActivity, "Berhasil Login", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun buttonTextLogin() {
        binding.btnTextLogin.setOnClickListener {
            Intent(this@LoginActivity, RegisterActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}