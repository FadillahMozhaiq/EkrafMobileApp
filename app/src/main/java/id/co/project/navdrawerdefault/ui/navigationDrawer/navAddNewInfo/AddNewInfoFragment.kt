package id.co.project.navdrawerdefault.ui.navigationDrawer.navAddNewInfo//package id.co.project.ekrafmobilenew.ui.navigationDrawer.navAddNewInfo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import id.co.project.navdrawerdefault.R
import id.co.project.navdrawerdefault.databinding.FragmentHomeBinding


class AddNewInfoFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding =  FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    //        (requireActivity() as AppCompatActivity).supportActionBar?.hide()

        val item = listOf("Aplikasi", "Arsitektur", "Design Interior", "Desain Komunikasi Visual", "Design Produk","Fesyen","Film Animasi Dan Video", "Fotografi","Kria","Kuliner","Musik","Penerbitan","Pengembang Permainan","Periklanan","Seni Pertunjukan", "Seni Rupa", "TV dan Radio")
        val adapter = ArrayAdapter(requireActivity(), R.layout.list_item_subsektor,item)
        binding.dropdownMenuAdd.setAdapter(adapter)
        binding.buttonUpdate.setOnClickListener {
            Toast.makeText(requireActivity(), "Data Berhasil Di Simpan", Toast.LENGTH_SHORT).show()
        }

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}