package com.ionate12.drawingview.brushes;


import android.graphics.Canvas;

import com.ionate12.drawingview.DrawingEvent;

public interface BrushRenderer {
    void draw(Canvas canvas);
    void onTouch(DrawingEvent drawingEvent);
    void setBrush(Brush brush);
}
