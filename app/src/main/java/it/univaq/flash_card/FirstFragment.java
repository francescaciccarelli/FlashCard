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

        Utils.setHtmlTextView(binding.card1, getString(R.string.titolo1));
        Utils.setHtmlTextView(binding.card2, getString(R.string.titolo2));
        Utils.setHtmlTextView(binding.card3, getString(R.string.titolo3));
        Utils.setHtmlTextView(binding.card4, getString(R.string.titolo4));
        Utils.setHtmlTextView(binding.card5, getString(R.string.titolo5));
        Utils.setHtmlTextView(binding.card6, getString(R.string.titolo6));
        Utils.setHtmlTextView(binding.card7, getString(R.string.titolo7));
        Utils.setHtmlTextView(binding.card8, getString(R.string.titolo8));
        Utils.setHtmlTextView(binding.card9, getString(R.string.titolo9));
        Utils.setHtmlTextView(binding.card10, getString(R.string.titolo10));
        Utils.setHtmlTextView(binding.card11, getString(R.string.titolo11));
        Utils.setHtmlTextView(binding.card12, getString(R.string.titolo12));
        Utils.setHtmlTextView(binding.card13, getString(R.string.titolo13));
        Utils.setHtmlTextView(binding.card14, getString(R.string.titolo14));
        Utils.setHtmlTextView(binding.card15, getString(R.string.titolo15));
        Utils.setHtmlTextView(binding.card16, getString(R.string.titolo16));
        Utils.setHtmlTextView(binding.card17, getString(R.string.titolo17));
        Utils.setHtmlTextView(binding.card18, getString(R.string.titolo18));
        Utils.setHtmlTextView(binding.card19, getString(R.string.titolo19));
        Utils.setHtmlTextView(binding.card20, getString(R.string.titolo20));
        Utils.setHtmlTextView(binding.card21, getString(R.string.titolo21));

        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.cardFirst.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 1);
            SecondFragment secondFragment = new SecondFragment();
            secondFragment.setArguments(bundle);

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

        binding.cardEighth.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 8);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        });

        binding.cardNineth.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 9);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        });

        binding.cardTithe.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 10);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        });

        binding.cardEleventh.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 11);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        });

        binding.cardTwelfth.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 12);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        });

        binding.cardThirteenth.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 13);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        });

        binding.cardFourteenth.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 14);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        });

        binding.cardFifteenth.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 15);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        });

        binding.cardSixteenth.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 16);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        });

        binding.cardSeventeenth.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 17);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        });

        binding.cardEighteenth.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 18);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        });

        binding.cardNineteenth.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 19);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        });

        binding.cardTwentieth.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 20);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        });

        binding.cardTwentyfirst.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putInt("card", 21);
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