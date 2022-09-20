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
import id.co.project.navdrawerdefault.databinding.FragmentTambahDataEkrafTerbaruBinding


class AddDataEkrafTerbaru : Fragment() {

    private var _binding: FragmentTambahDataEkrafTerbaruBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTambahDataEkrafTerbaruBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {



        val item = listOf("Aplikasi", "Arsitektur", "Design Interior", "Desain Komunikasi Visual", "Design Produk","Fesyen","Film Animasi Dan Video", "Fotografi","Kria","Kuliner","Musik","Penerbitan","Pengembang Permainan","Periklanan","Seni Pertunjukan", "Seni Rupa", "TV dan Radio")
        val adapter = ArrayAdapter(requireActivity(), R.layout.list_item_subsektor,item)
        binding.dropdownMenu.setAdapter(adapter)

        val itemBadanUsaha = listOf("Belum Berbadan Usaha", "Firma", "Koperasi", "Perkumpulan", "Persekutuan Komanditer (CV)","Persekutuan Perdata","Perseroan Terbatas(PT)","Yayasan")
        val adapterBadanUsaha = ArrayAdapter(requireActivity(), R.layout.list_item_badan_usaha,itemBadanUsaha)
        binding.dropdownMenuBadanUsaha.setAdapter(adapterBadanUsaha)

        binding.buttonSaveDataEkraf.setOnClickListener {
            Toast.makeText(requireActivity(), "Data Berhasil Di Simpan", Toast.LENGTH_SHORT).show()
        }
        binding.backButton.setOnClickListener {

        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}