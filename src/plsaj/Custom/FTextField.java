package plsaj.Custom;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

public class FTextField extends JTextField implements FocusListener {

    private boolean over;
    private Color fill;
    private Color line;

    private Color fillOriginal;
    private Color fillFocus;
    private Color lineOriginal;
    private Color lineFocus;
    private int strokeWidth;
    private int radiusBorder; // Tambahan untuk menentukan radius border

    public FTextField() {
        fillOriginal = Color.WHITE;
        fillFocus = new Color(240, 240, 240);
        lineOriginal = new Color(102,102,102);
        lineFocus = new Color(43,124,99);
        strokeWidth = (int) 2;
        radiusBorder = 20; // Radius default
        fill = fillOriginal;
        line = lineOriginal;
        setOpaque(false);
        setBorder(null);
        addFocusListener(this);
        //tambahkan mouse event
        addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                over = true;
                repaint();
            }

            @Override
            public void focusLost(FocusEvent e) {
                over = false;
                repaint();
            }
        });
    }

    public Color getFillOriginal() {
        return fillOriginal;
    }

    public void setFillOriginal(Color fillOriginal) {
        this.fillOriginal = fillOriginal;
    }

    public Color getFillFocus() {
        return fillFocus;
    }

    public void setFillFocus(Color fillFocus) {
        this.fillFocus = fillFocus;
    }

    public Color getLineOriginal() {
        return lineOriginal;
    }

    public void setLineOriginal(Color lineOriginal) {
        this.lineOriginal = lineOriginal;
    }

    public Color getLineFocus() {
        return lineFocus;
    }

    public void setLineFocus(Color lineFocus) {
        this.lineFocus = lineFocus;
    }

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public int getRadiusBorder() {
        return radiusBorder;
    }

    public void setRadiusBorder(int radiusBorder) {
        this.radiusBorder = radiusBorder;
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (!isOpaque()) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int s = strokeWidth;
            int w = getWidth() - (2 * s);
            int h = getHeight() - (2 * s);
            int r = radiusBorder; // Menggunakan radius border custom
            //gambar background
            if (over) {
                g2d.setColor(fillFocus);
            } else {
                g2d.setColor(fill);
            }
            g2d.fillRoundRect(s, s, w, h, r, r);
            //gambar border
            g2d.setStroke(new BasicStroke(s));
            if (over) {
                g2d.setColor(lineFocus);
            } else {
                g2d.setColor(line);
            }
            g2d.drawRoundRect(s, s, w, h, r, r);
            g2d.dispose();
        }
        super.paintComponent(g);
    }

    @Override
    public void focusGained(FocusEvent e) {
        over = true;
        repaint();
    }

    @Override
    public void focusLost(FocusEvent e) {
        over = false;
        repaint();
    }
}
