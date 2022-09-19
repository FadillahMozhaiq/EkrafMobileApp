package id.co.project.navdrawerdefault.ui.navigationBottom.profile

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import id.co.project.navdrawerdefault.R
import id.co.project.navdrawerdefault.databinding.FragmentTambahDataEkrafTerbaruBinding
import id.co.project.navdrawerdefault.databinding.ProfileFragmentBinding

class ProfileFragment : Fragment() {

    private var _binding : ProfileFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ProfileFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        val item = listOf(
            "Aplikasi",
            "Arsitektur",
            "Design Interior",
            "Desain Komunikasi Visual",
            "Design Produk",
            "Fesyen",
            "Film Animasi Dan Video",
            "Fotografi",
            "Kria",
            "Kuliner",
            "Musik",
            "Penerbitan",
            "Pengembang Permainan",
            "Periklanan",
            "Seni Pertunjukan",
            "Seni Rupa",
            "TV dan Radio"
        )
        val adapter = ArrayAdapter(requireActivity(), R.layout.list_item_subsektor, item)
        binding.dropdownMenuSetting.setAdapter(adapter)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}