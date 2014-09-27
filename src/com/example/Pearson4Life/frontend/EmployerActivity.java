package com.example.Pearson4Life.frontend;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import com.example.Pearson4Life.R;

/**
 * Created by Kyle on 9/26/2014.
 */
public class EmployerActivity extends DrawerActivity {
    private static final String TAG = EmployerActivity.class.getSimpleName();

    private static final String TAB_ROLES = "Roles";
    private static final String TAB_NFC = "NFC";
    private static final String TAB_USERS = "Users";

    private String _tab;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addTab(TAB_ROLES);
        addTab(TAB_NFC);
        addTab(TAB_USERS);

        openTab(TAB_ROLES);
    }

    @Override
    protected void openTab(final String tab) {
        Fragment fragment = null;

        if (_tab != null && _tab.equals(tab)) {
            return;
        } else if (TAB_ROLES.equals(tab)) {
            fragment = new EmployerRolesFragment();
        } else if (TAB_NFC.equals(tab)) {
            fragment = new NfcFragment();
        } else if (TAB_USERS.equals(tab)) {
            fragment = new EmployerUsersFragment();
        }

        final FragmentManager fm = getFragmentManager();

        if (fm.getBackStackEntryCount() > 0) { // Pop non-root fragments
            popFragment();
        }

        // Insert the fragment by replacing any existing fragment
        fm.beginTransaction()
                .replace(R.id.content_frame, fragment)
                .commit();

        _tab = tab;
    }
}