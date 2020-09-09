package com.example.salonappoint.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.salonappoint.R;
import com.example.salonappoint.adapter.PreviousOrderAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class OrderHistoryFragment extends Fragment {

    private ArrayList<Integer> OfferImages = new ArrayList<>();

    android.support.v4.app.FragmentManager manager;

    public OrderHistoryFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getImages();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     //   return inflater.inflate(R.layout.fragment_order_history, container, false);

        View rootView = inflater.inflate(R.layout.fragment_order_history, container, false);

        manager = getFragmentManager();

        LinearLayoutManager layoutManagerForItems = new LinearLayoutManager(getActivity(), LinearLayoutManager. VERTICAL, false);
        RecyclerView itemRecyclerView = rootView.findViewById(R.id.order_history_recyclerView);

        itemRecyclerView.setLayoutManager(layoutManagerForItems);

        PreviousOrderAdapter adapterforItem = new PreviousOrderAdapter(getContext(),OfferImages);
        itemRecyclerView.setAdapter(adapterforItem);

        return rootView;

    }

    private void getImages() {
        OfferImages.add(R.drawable.offerimageone);
        OfferImages.add(R.drawable.offerimagetwo);
        OfferImages.add(R.drawable.offerimageone);
        OfferImages.add(R.drawable.offerimagetwo);
        OfferImages.add(R.drawable.offerimageone);
        OfferImages.add(R.drawable.offerimagetwo);



    }

}
