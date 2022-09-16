package id.co.project.navdrawerdefault.ui.authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import id.co.project.navdrawerdefault.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    lateinit var binding : ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        buttonBackClick()
        buttonSignUp()
        buttonTextRegister()
    }

    private fun buttonTextRegister() {
        binding.btnTextRegister.setOnClickListener {
            Intent(this@RegisterActivity, LoginActivity::class.java).also {
                startActivity(it)

            }
        }
    }

    private fun buttonSignUp() {
        binding.buttonSignUp.setOnClickListener {
            Intent(this@RegisterActivity, LoginActivity::class.java).also {
                startActivity(it)
                Toast.makeText(this@RegisterActivity, "Berhasil Daftar", Toast.LENGTH_LONG).show()
                finish()
            }
        }
    }

    private fun buttonBackClick() {
        binding.backButtonRegister.setOnClickListener {
            Intent(this@RegisterActivity, LoginActivity::class.java).also {
                startActivity(it)
                finish()
            }
        }
    }


}