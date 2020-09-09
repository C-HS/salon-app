package com.example.salonappoint.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.salonappoint.R;
import com.example.salonappoint.adapter.PreviousOrderAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class OrderFragment extends Fragment {
    private ArrayList<Integer> OfferImages = new ArrayList<>();

    android.support.v4.app.FragmentManager manager;

    public OrderFragment() {
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
        //return inflater.inflate(R.layout.fragment_order, container, false);



        View rootView = inflater.inflate(R.layout.fragment_order, container, false);

        manager = getFragmentManager();

        LinearLayoutManager layoutManagerForItems = new LinearLayoutManager(getActivity(), LinearLayoutManager. VERTICAL, false);
        RecyclerView itemRecyclerView = rootView.findViewById(R.id.my_order_recyclerView);

        itemRecyclerView.setLayoutManager(layoutManagerForItems);

        PreviousOrderAdapter adapterforItem = new PreviousOrderAdapter(getContext(),OfferImages);
        itemRecyclerView.setAdapter(adapterforItem);


        TextView orderHistoryLink = (TextView) rootView.findViewById(R.id.orderHistoryLink);

        orderHistoryLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                OrderHistoryFragment orderHistoryFragment = new OrderHistoryFragment();
                manager.beginTransaction()
                        .replace(R.id.fragnment_layout,orderHistoryFragment)
                        .commit();

            }
        });

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
