package com.example.Pearson4Life.frontend;

import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.nfc.*;
import android.nfc.tech.NfcA;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.Pearson4Life.R;

/**
 * Created by Kyle on 9/27/2014.
 */
public class NfcFragment extends Fragment {
    private String _message;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.nfc_fragment, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        getActivity().getActionBar().setTitle("NFC");

        final Bundle args = getArguments();
        _message = args.getString("id");

        final TextView view = (TextView) getView().findViewById(R.id.text_message);
        view.setText(_message);
    }

}