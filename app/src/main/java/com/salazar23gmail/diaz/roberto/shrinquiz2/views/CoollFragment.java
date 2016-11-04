package com.salazar23gmail.diaz.roberto.shrinquiz2.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import com.salazar23gmail.diaz.roberto.shrinquiz2.R;
import com.salazar23gmail.diaz.roberto.shrinquiz2.data.CoolResult;

public class CoollFragment extends Fragment {

    private TextInputEditText userName;
    private Switch partySwitch;
    private TextView counter;
    private SeekBar drinkSeekBar;
    private Button button;

    public CoollFragment () {
        // Required empty public constructor
    }

    public static CoollFragment newInstance () {

        return new CoollFragment ();
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate (R.layout.fragment_cooll, container, false);
    }

    @Override
    public void onViewCreated (View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated (view, savedInstanceState);
        userName = (TextInputEditText) view.findViewById (R.id.nameEt);
        partySwitch = (Switch) view.findViewById (R.id.partySw);
        counter = (TextView) view.findViewById (R.id.counterTv);
        drinkSeekBar = (SeekBar) view.findViewById (R.id.drinkSb);

        drinkSeekBar.setOnSeekBarChangeListener (new SeekBar.OnSeekBarChangeListener () {
            @Override
            public void onProgressChanged (SeekBar seekBar, int progress, boolean fromUser) {
                counter.setText (String.valueOf (progress));

            }

            @Override
            public void onStartTrackingTouch (SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch (SeekBar seekBar) {

            }
        });

        button = (Button) view.findViewById (R.id.sendBtn);
        button.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                String name = userName.getText ().toString ();
                boolean party = partySwitch.isChecked ();
                int drinks = drinkSeekBar.getProgress ();

                CoolResult coolResult = new CoolResult (name, party, drinks);
                AlertDialog.Builder dialog = new AlertDialog.Builder (getContext ());
                dialog.setMessage (coolResult.result ());
                dialog.show ();

            }
        });
    }
        
}
