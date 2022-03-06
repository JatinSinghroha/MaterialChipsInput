package com.pchmn.materialchips.views;


import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

public class ChipsInputEditText extends EditText {

    private FilterableListView filterableListView;

    public ChipsInputEditText(Context context) {
        super(context);
    }

    public ChipsInputEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public boolean isFilterableListVisible() {
        return filterableListView != null && filterableListView.getVisibility() == VISIBLE;
    }

    public FilterableListView getFilterableListView() {
        return filterableListView;
    }

    public void setFilterableListView(FilterableListView filterableListView) {
        this.filterableListView = filterableListView;
    }
}
