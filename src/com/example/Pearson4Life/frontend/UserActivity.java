package com.example.Pearson4Life.frontend;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import com.example.Pearson4Life.R;

/**
 * Created by Kyle on 9/27/2014.
 */
public class UserActivity extends DrawerActivity {
    private static final String TAG = UserActivity.class.getSimpleName();

    private static final String TAB_BADGES = "My Badges";
    private static final String TAB_NFC = "NFC";
    private static final String TAB_EMPLOYERS = "Employers";

    private String _tab;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addTab(TAB_BADGES);
        addTab(TAB_NFC);
        addTab(TAB_EMPLOYERS);

        openTab(TAB_BADGES);
    }

    @Override
    protected void openTab(final String tab) {
        Fragment fragment = null;

        if (_tab != null && _tab.equals(tab)) {
            return;
        } else if (TAB_BADGES.equals(tab)) {
            fragment = new UserBadgesFragment();
        } else if (TAB_NFC.equals(tab)) {
            fragment = new NfcFragment();
        } else if (TAB_EMPLOYERS.equals(tab)) {
            fragment = new UserEmployersFragment();
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