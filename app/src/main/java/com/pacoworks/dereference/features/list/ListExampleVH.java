/*
 * Copyright (c) pakoito 2016
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pacoworks.dereference.features.list;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import com.pacoworks.dereference.R;
import com.pacoworks.dereference.widgets.ReactiveDNDTouchHelper.ReactiveDNDViewHolder;

/**
 * Simple ViewHolder example. It implements {@link ReactiveDNDViewHolder} to display animations on Drag and Drop operations.
 */
public class ListExampleVH extends RecyclerView.ViewHolder implements ReactiveDNDViewHolder {
    public ListExampleVH(Context context) {
        super(LayoutInflater.from(context).inflate(R.layout.widget_text, null));
    }

    @Override
    public void onDragStarted() {
        ViewCompat.animate(itemView).cancel();
        ViewCompat.animate(itemView).alpha(0.6f).scaleX(1.3f).scaleY(1.3f);
    }

    @Override
    public void onDragEnded() {
        ViewCompat.animate(itemView).cancel();
        ViewCompat.animate(itemView).alpha(1f).scaleX(1f).scaleY(1f);
    }
}
