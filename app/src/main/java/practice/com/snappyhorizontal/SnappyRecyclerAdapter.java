package practice.com.snappyhorizontal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by vaibhavsharma on 24/05/16.
 */
public class SnappyRecyclerAdapter extends RecyclerView.Adapter<SnappyRecyclerAdapter.SnappyViewHolder> {
  private final Context context;
  private final List<String> itemList;

  public SnappyRecyclerAdapter(Context context, List<String> itemList) {
    this.context = context;
    this.itemList = itemList;
  }

  @Override
  public SnappyRecyclerAdapter.SnappyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    return new SnappyViewHolder(LayoutInflater.from(context).inflate(R.layout.row_item, null));
  }

  @Override
  public void onBindViewHolder(SnappyViewHolder holder, int position) {
    holder.textView.setText(itemList.get(position));
  }

  @Override
  public int getItemCount() {
    return itemList.size();
  }

  static class SnappyViewHolder extends RecyclerView.ViewHolder {
    private final TextView textView;

    public SnappyViewHolder(View itemView) {
      super(itemView);
      textView = (TextView) itemView.findViewById(R.id.text_view);
    }
  }
}
