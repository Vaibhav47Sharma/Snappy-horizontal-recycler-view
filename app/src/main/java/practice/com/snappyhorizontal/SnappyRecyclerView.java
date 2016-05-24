package practice.com.snappyhorizontal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

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
    Log.d("Daman", "dx =" + dx + " dy = " + dy );
    super.onScrolled(dx, dy);
  }

  @Override
  public int getMinFlingVelocity() {
    int minFlingVelocity = super.getMinFlingVelocity();
    Log.d("Daman", minFlingVelocity + "min" );
    return minFlingVelocity;
  }

  @Override
  public int getMaxFlingVelocity() {
    int maxFlingVelocity = super.getMaxFlingVelocity();
    Log.d("Daman", maxFlingVelocity + " max" );
    return maxFlingVelocity;
  }

  @Override
  public boolean fling(int velocityX, int velocityY) {
    Log.d("Daman", "vx =" + velocityX + " vy = " + velocityY );
    return super.fling(velocityX, velocityY);
  }

  @Override
  public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
    return super.onNestedFling(target, velocityX, velocityY, consumed);
  }
}
