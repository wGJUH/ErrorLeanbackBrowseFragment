package tv.phoenix.gsgroup.com.errorleanbackbrowsefragment;

import android.app.Fragment;
import android.support.v17.leanback.app.BrowseFragment;
import android.util.Log;

/**
 * Created by vladislav.kipnis on 13.11.2017.
 */

class CustomFragmentFactory extends BrowseFragment.FragmentFactory {
    public static final String TAG = CustomFragmentFactory.class.getSimpleName();
    @Override
    public Fragment createFragment(Object row) {
        Log.d(TAG, "createFragment: CUSTOM_FACTORY" );
        return new CustomRowsFragment();
    }
}
