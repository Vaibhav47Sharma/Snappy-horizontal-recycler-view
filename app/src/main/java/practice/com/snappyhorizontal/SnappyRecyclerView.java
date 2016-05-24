package practice.com.snappyhorizontal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;

/**
 * Created by vaibhavsharma on 24/05/16.
 */
public class SnappyRecyclerView extends RecyclerView {
  public SnappyRecyclerView(Context context) {
    super(context);
  }

  public SnappyRecyclerView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public SnappyRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }

  @Override
  public void onScrolled(int dx, int dy) {
    Log.d("DamanScroll", "dx =" + dx + " dy = " + dy);
    super.onScrolled(dx, dy);
  }

  @Override
  public int getMinFlingVelocity() {
    int minFlingVelocity = super.getMinFlingVelocity();
    Log.d("Daman", minFlingVelocity + "min");
    return minFlingVelocity;
  }

  @Override
  public int getMaxFlingVelocity() {
    int maxFlingVelocity = super.getMaxFlingVelocity();
    Log.d("Daman", maxFlingVelocity + " max");
    return maxFlingVelocity;
  }

  @Override
  public boolean fling(int velocityX, int velocityY) {
    Log.d("Daman", "vx =" + velocityX + " vy = " + velocityY);
    int numberOfItems = getAdapter().getItemCount();
    int destination = getAdapter().getItemCount();
    LinearLayoutManager llm = (LinearLayoutManager) getLayoutManager();
    int startposition = llm.findFirstVisibleItemPosition();
    if (Math.abs(velocityX) < Math.abs(getMinFlingVelocity())) {
      destination = startposition;
    } else if (Math.abs(velocityX) > Math.abs(getMinFlingVelocity())) {
      destination = calculatePositionForVelocity(velocityX, startposition);
    }
    if (llm instanceof HorizontalySnappingLayoutManager) {
      smoothScrollToPosition(destination);
    }
    return true;
  }

  private int calculatePositionForVelocity(int velocityX, int startposition) {
    int positionToAdvanceBy = (int) (velocityX / Math.pow(getMinFlingVelocity(), 2));
    if (velocityX > 0) {
      return startposition + positionToAdvanceBy + 1;
    }
    return startposition - (positionToAdvanceBy + 1);
  }

}
