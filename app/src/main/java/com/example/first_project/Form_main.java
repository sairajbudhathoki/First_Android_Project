package com.example.first_project;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Form_main#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Form_main extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Form_main() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Form_main.
     */
    // TODO: Rename and change types and number of parameters
    public static Form_main newInstance(String param1, String param2) {
        Form_main fragment = new Form_main();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_form_main, container, false);
        EditText name = view.findViewById(R.id.editTextTextPersonName);
        EditText address = view.findViewById(R.id.editTextTextPersonName2);
        EditText number = view.findViewById(R.id.editTextTextPersonName3);
        EditText age = view.findViewById(R.id.editTextTextPersonName4);

        Button submit = view.findViewById(R.id.formsubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("key1", name.getText().toString());
                bundle.putString("key2", address.getText().toString());
                bundle.putString("key3", number.getText().toString());
                bundle.putString("key4", age.getText().toString());

                FormSecond second = new FormSecond();
                second.setArguments(bundle);
//                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container1,second).commit();

            }
        });
        return view;



    }
}