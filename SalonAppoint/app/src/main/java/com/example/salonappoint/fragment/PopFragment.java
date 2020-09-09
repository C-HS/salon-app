package com.example.salonappoint.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.salonappoint.R;
import com.example.salonappoint.adapter.PopOrderAdapter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PopFragment extends Fragment {

    private ArrayList<Integer> popImages = new ArrayList<>();

    public PopFragment() {
        // Required empty public constructor
    }

    private void getImages() {
        popImages.add(R.drawable.ellipseone);
        popImages.add(R.drawable.filtericon);
        popImages.add(R.drawable.ic_dashboard_black_24dp);
        popImages.add(R.drawable.ic_launcher_background);
        popImages.add(R.drawable.ic_notifications_black_24dp);
        popImages.add(R.drawable.ic_search_black_24dp);
        popImages.add(R.drawable.itemfour);
        popImages.add(R.drawable.itemone);
        popImages.add(R.drawable.itemthree);
        popImages.add(R.drawable.offerimageone);
        popImages.add(R.drawable.offerimagetwo);
        popImages.add(R.drawable.placeorder_search_background);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_pop, container, false);

      /*  GridLayoutManager layoutManagerForItems = new GridLayoutManager(getActivity(), 6);
        RecyclerView itemRecyclerView = rootView.findViewById(R.id.pop_recyclerView);

        itemRecyclerView.setLayoutManager(layoutManagerForItems);

        PopOrderAdapter adapterforItem = new PopOrderAdapter(getContext());
        itemRecyclerView.setAdapter(adapterforItem);
        R
*/
        RecyclerView recyclerView = rootView.findViewById(R.id.pop_recyclerView);
        PopOrderAdapter adapterforItem = new PopOrderAdapter(popImages,getContext());
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 3);
        recyclerView.setLayoutManager(mLayoutManager);

        // recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(8), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapterforItem);
        recyclerView.setNestedScrollingEnabled(false);


        return rootView;
    }

}
