package com.example.android.rest_testing

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PlacesAdapter: RecyclerView.Adapter<PlacesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlacesViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val placeListElement = inflater.inflate(R.layout.place_cell, parent, false)
        return PlacesViewHolder(placeListElement, this)
    }

    override fun onBindViewHolder(holder: PlacesViewHolder, position: Int) {
        holder.placeNameTextView?.text = PlacesRepository.listOfPlaces[position].name //dodati .toString() ako ne bude radilo
        holder.placeTypeTextView?.text = PlacesRepository.listOfPlaces[position].type
    }

    override fun getItemCount(): Int {
        return PlacesRepository.listOfPlaces.size
    }

}