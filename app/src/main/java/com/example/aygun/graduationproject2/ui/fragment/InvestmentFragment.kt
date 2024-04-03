package com.example.aygun.graduationproject2.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aygun.graduationproject2.R
import com.example.aygun.graduationproject2.data.model.BitcoinModel
import com.example.aygun.graduationproject2.databinding.FragmentInvestmentBinding
import com.example.aygun.graduationproject2.ui.adapter.BitcoinAdapter

class InvestmentFragment : Fragment() {
    private lateinit var binding: FragmentInvestmentBinding
    private lateinit var bitcoinAdapter: BitcoinAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentInvestmentBinding.inflate(inflater,container,false)
        bitcoinAdapter = BitcoinAdapter(mutableListOf(
            BitcoinModel("IBIT","ISHARES BITCOIN",7.12,R.drawable.bitcoin_icon1),
            BitcoinModel("GBTC","Graycsale Bi",5.58,R.drawable.bitcoin_icon2),
            BitcoinModel("ARKB","ARK 21SHARES",7.06,R.drawable.bitcoin_icon3),
            BitcoinModel("BITB","BITWISE BITCOIN",7.10,R.drawable.bitcoin_icon4),
            BitcoinModel("BTCO","INVESCO GALA",7.11,R.drawable.bitcoin_icon5),
            BitcoinModel("BTCW","WISDOMTREE B",6.99,R.drawable.bitcoin_icon6),
            BitcoinModel("IBIT","ISHARES BITCOIN",7.12,R.drawable.bitcoin_icon1),
            BitcoinModel("IBIT","ISHARES BITCOIN",7.12,R.drawable.bitcoin_icon1)))
        binding.rvInvestmentBitcoins.adapter = bitcoinAdapter
        return binding.root
    }
}