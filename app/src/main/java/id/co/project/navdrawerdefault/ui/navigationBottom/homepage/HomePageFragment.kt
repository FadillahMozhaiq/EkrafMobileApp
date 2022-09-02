package id.co.project.navdrawerdefault.ui.navigationBottom.homepage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import id.co.project.navdrawerdefault.R
import id.co.project.navdrawerdefault.databinding.HomePageFragmentBinding

class HomePageFragment : Fragment() {

    private var _binding: HomePageFragmentBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = HomePageFragmentBinding.inflate(layoutInflater)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(_binding) {
            // Move to fragment Info Ekraf Terbaru
            moveToNewInfo()

            // Move to fragment Pelaku Ekraf
            moveToMerchant()

        }

    }

    private fun moveToMerchant() {
        binding.buttonProductSecond.setOnClickListener {
            it.findNavController().navigate(R.id.action_homePageFragment_to_nav_merchant)
        }
    }

    private fun moveToNewInfo() {
        binding.buttonProductFirst.setOnClickListener {
            it.findNavController().navigate(R.id.action_homePageFragment_to_nav_new_info)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}