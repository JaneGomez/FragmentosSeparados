package com.example.fragmentosseparados;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class InfoAnimalFagment extends Fragment {
    private int idImage;
    private String description;
    private String animal;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle arguments = getArguments();

        if(arguments != null){
            animal = arguments.getString("animal");
        }
        obtenerInformacion();
    }

    public void obtenerInformacion(){

        if(animal == null){
            animal = "Perro";
        }
        switch (animal){
            case "Perro":
                description = "Los perros son fieles";
                idImage = R.drawable.ic_dog;
                break;
            case "Gato":
                description = "Los gatos son silenciosos";
                idImage = R.drawable.ic_cat;
                break;
            case "Raton":
                description = "Los ratones son feos";
                idImage = R.drawable.ic_mouse;
                break;
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.info_animal_fragment, container, false);

        ImageView imageViewFoto = view.findViewById(R.id.imageViewFoto);
        TextView textViewDescription = view.findViewById(R.id.textViewInfo);

        imageViewFoto.setImageResource(idImage);
        textViewDescription.setText(description);

        return view;
    }
}
