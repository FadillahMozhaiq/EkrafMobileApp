package id.co.project.navdrawerdefault.ui.navigationDrawer.navMerchant

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.co.project.navdrawerdefault.databinding.FragmentPelakuEkrafBinding


class MerchantFragment : Fragment() {

    private var _binding: FragmentPelakuEkrafBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {
        _binding = FragmentPelakuEkrafBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}