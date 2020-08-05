
package com.example.lasuprema.ui.clientes;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.lasuprema.R;
import com.example.lasuprema.ui.slideshow.SlideshowViewModel;

public class Clientes extends Fragment {
    private SlideshowViewModel clientesViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        clientesViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_clientes, container, false);
        //sacar el texto el valor de caja de valores para que no se piera el texto
       // final TextView textView = root.findViewById(R.id.text_clientes);
        clientesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
               // textView.setText(s);
            }
        });
        return root;
    }
}
