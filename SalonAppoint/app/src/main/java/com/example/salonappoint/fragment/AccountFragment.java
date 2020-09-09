package com.example.salonappoint.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.salonappoint.R;
import com.example.salonappoint.adapter.PreviousOrderAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class AccountFragment extends Fragment {


    public AccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_account, container, false);

        LinearLayoutManager layoutManagerForItems = new LinearLayoutManager(getActivity(), LinearLayoutManager. VERTICAL, false);
        RecyclerView itemRecyclerView = rootView.findViewById(R.id.previous_order_recyclerView);

        itemRecyclerView.setLayoutManager(layoutManagerForItems);

        PreviousOrderAdapter adapterforItem = new PreviousOrderAdapter(getContext(),null);
        itemRecyclerView.setAdapter(adapterforItem);

        return rootView;
    }

}
