package it.univaq.flash_card;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import it.univaq.flash_card.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);

        Utils.setHtmlTextView(binding.firstText, getString(R.string.Colelitiasi));
        Utils.setHtmlTextView(binding.colelitiasi, getString(R.string.titolo1));
        Utils.setHtmlTextView(binding.secondText, getString(R.string.Colecistite_acuta));
        Utils.setHtmlTextView(binding.colecistiteacuta, getString(R.string.titolo2));
        Utils.setHtmlTextView(binding.thirdText, getString(R.string.Colangite));
        Utils.setHtmlTextView(binding.colangite, getString(R.string.titolo3));
        Utils.setHtmlTextView(binding.fourthText, getString(R.string.Vomito));
        Utils.setHtmlTextView(binding.vomito, getString(R.string.titolo4));
        Utils.setHtmlTextView(binding.fifthText, getString(R.string.Sindrome_Mallory_Weiss));
        Utils.setHtmlTextView(binding.malloryweiss, getString(R.string.titolo5));
        Utils.setHtmlTextView(binding.sixthText, getString(R.string.Rottura_esofago));
        Utils.setHtmlTextView(binding.rotturaesofago, getString(R.string.titolo6));
        Utils.setHtmlTextView(binding.seventhText, getString(R.string.Emorragie_digestive));
        Utils.setHtmlTextView(binding.emorragiadigestiva, getString(R.string.titolo7));

        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.cardFirst.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 1);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        });

        binding.cardSecond.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 2);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        });

        binding.cardThird.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 3);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        });

        binding.cardFourth.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 4);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        });

        binding.cardFifth.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 5);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        });

        binding.cardSixth.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 6);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        });

        binding.cardSeventh.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 7);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}