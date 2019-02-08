package com.miguelcr.a05_viewmodel_comunicacionfragments;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MasterFragment extends Fragment {

    private ColorViewModel mViewModel;
    private Button btnColor;
    private boolean mandarRojo = true;

    public static MasterFragment newInstance() {
        return new MasterFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.master_fragment, container, false);

        btnColor = v.findViewById(R.id.buttonCambiarColor);
        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mandarRojo)
                    mViewModel.selectColor("#FF0000");
                else
                    mViewModel.selectColor("#0000FF");

                mandarRojo = !mandarRojo;
            }
        });

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(getActivity()).get(ColorViewModel.class);
        // TODO: Use the ViewModel
    }

}
