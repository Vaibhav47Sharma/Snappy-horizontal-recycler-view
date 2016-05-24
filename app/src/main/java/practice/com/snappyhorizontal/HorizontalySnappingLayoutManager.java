package practice.com.snappyhorizontal;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by vaibhavsharma on 24/05/16.
 */
public class HorizontalySnappingLayoutManager extends LinearLayoutManager {
  public HorizontalySnappingLayoutManager(Context context) {
    super(context);
    setOrientation(HORIZONTAL);
  }

  public HorizontalySnappingLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
    setOrientation(HORIZONTAL);
  }

  public HorizontalySnappingLayoutManager(Context context, int orientation, boolean reverseLayout) {
    super(context, HORIZONTAL, reverseLayout);
  }

  @Override
  public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int position) {
    RecyclerView.SmoothScroller smoothScroller = new SnappySmoothScroll(recyclerView.getContext());
    smoothScroller.setTargetPosition(position);
    startSmoothScroll(smoothScroller);
  }

  private class SnappySmoothScroll extends LinearSmoothScroller {

    public SnappySmoothScroll(Context context) {
      super(context);
    }

    @Override
    public PointF computeScrollVectorForPosition(int targetPosition) {
      return HorizontalySnappingLayoutManager.this.computeScrollVectorForPosition(targetPosition);
    }

    @Override
    protected int getHorizontalSnapPreference() {
      return SNAP_TO_START;
    }
  }
}
