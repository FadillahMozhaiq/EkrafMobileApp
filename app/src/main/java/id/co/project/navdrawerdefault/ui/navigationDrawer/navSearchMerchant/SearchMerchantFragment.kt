package id.co.project.navdrawerdefault.ui.navigationDrawer.navSearchMerchant

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import id.co.project.navdrawerdefault.databinding.SearchMerchantFragmentBinding


class SearchMerchantFragment : Fragment() {

    private var _binding: SearchMerchantFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = SearchMerchantFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}