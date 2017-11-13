package tv.phoenix.gsgroup.com.errorleanbackbrowsefragment;

import android.support.v17.leanback.widget.HeaderItem;
import android.support.v17.leanback.widget.ListRow;
import android.support.v17.leanback.widget.ObjectAdapter;

/**
 * Created by vladislav.kipnis on 13.11.2017.
 */

class CustomFragmentRow extends ListRow{
    public CustomFragmentRow(HeaderItem header, ObjectAdapter adapter) {
        super(header, adapter);
    }

    public CustomFragmentRow(long id, HeaderItem header, ObjectAdapter adapter) {
        super(id, header, adapter);
    }

    public CustomFragmentRow(ObjectAdapter adapter) {
        super(adapter);
    }
}
