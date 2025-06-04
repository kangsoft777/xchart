package com.hbee.honeybee.entity;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import com.hbee.honeybee.enumeration.ContentAlignment;
import com.hbee.honeybee.enumeration.StringAlignment;

public class Graphics3D {

	private AffineTransform orig2D = null;
	private boolean isInstance = false;

	public boolean getIsInstance() {
		return isInstance;
	}

	public void setIsInstance(boolean isInstance) {
		this.isInstance = isInstance;
	}

	private boolean isGradient = false;

	public boolean getIsGradient() {
		return isGradient;
	}

	public void setIsGradient(boolean isGradient) {
		this.isGradient = isGradient;
	}

	private Rectangle chartRect = new Rectangle(0, 0, 0, 0);

	public Rectangle getChartRect() {
		return chartRect;
	}

	public void setChartRect(Rectangle chartRect) {
		this.chartRect = chartRect;
	}

	private Graphics2D graphics;

	public Graphics2D getGraphics() {
		return graphics;
	}

	public void setGraphics(Graphics2D graphics) {
		this.graphics = graphics;
		this.graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		this.graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	}

	private Pen pen = new Pen(Color.BLACK);

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
		if (graphics != null)
			graphics.setStroke(new BasicStroke(pen.getWidth()));
	}

	private Font font = null;

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
		if (graphics != null)
			graphics.setFont(font);
	}

	private int foreColor = Color.BLACK.getRGB();

	public int getForeColor() {
		return foreColor;
	}

	public void setForeColor(int color) {
		foreColor = color;
		if (graphics != null)
			graphics.setColor(new Color(foreColor));
	}

	private StringAlignment textAlign = StringAlignment.Center;

	public StringAlignment getTextAlign() {
		return textAlign;
	}

	public void setTextAlign(StringAlignment textAlign) {
		this.textAlign = textAlign;
	}

	private ContentAlignment contentAlignment = ContentAlignment.MiddleCenter;

	public ContentAlignment getContentAlignment() {
		return contentAlignment;
	}

	public void setContentAlignment(ContentAlignment contentAlignment) {
		this.contentAlignment = contentAlignment;
	}

	public void setFontSize(int isize) {
		// font = new System.Drawing.Font(_font.Name, (float)isize, _font.Style,
		// _font.Unit, ((byte)(129)));
	}

	public void setTextOut(Graphics2D g, int x, int y, String text) {
		g.drawString(text, (float) x, (float) y);
	}
	
	public void setTextOut(int x, int y, String text) {
		graphics.drawString(text, (float) x, (float) y);
	}

	public void setTextOut(Font f, int x, int y, String text) {
		this.doDrawString(x, y, text);
	}

	private FontMetrics getFontMetricx() {
		return graphics.getFontMetrics(this.font);
	}

	private FontMetrics getFontMetricx(Font font) {
		return graphics.getFontMetrics(font);
	}
	
	public Size getMeasureString(String text) {
		return getMeasureString(graphics, font, text);
	}

	public Size getMeasureString(Font font, String text) {
		return getMeasureString(graphics, font, text);
	}

	public Size getMeasureString(Graphics2D g, Font f, String text) {
		Rectangle2D rect = getFontMetricx(f).getStringBounds(text, g);
		float width = (float) rect.getWidth();
		float height = (float) rect.getHeight();
		Size size = new Size();
		size.setWidth((int) width);
		size.setHeight((int) height);
		return size;
	}

	public SizeF getMeasureStringF(String text) {
		return getMeasureStringF(graphics, font, text);
	}

	public SizeF getMeasureStringF(Font font, String text) {
		return getMeasureStringF(graphics, font, text);
	}

	public SizeF getMeasureStringF(Graphics2D g, Font f, String text) {
		Rectangle2D rect = getFontMetricx().getStringBounds(text, g);
		float width = (float) rect.getWidth();
		float height = (float) rect.getHeight();
		SizeF size = new SizeF();
		size.setWidth(width);
		size.setHeight(height);
		return size;
	}

	public float getTextWidth(String text) {
		return getMeasureString(font, text).getWidth();
	}

	public float getTextHeight(String text) {
		return getMeasureString(font, text).getHeight();
	}

	private void doDrawString(int x, int y, String texth) {
		graphics.drawString(texth, (float) x, (float) y);
	}

	public void drawString(Font font, int x, int y, String texth) {
		graphics.setFont(font);
		graphics.drawString(texth, (float) x, (float) y);
	}

	public void rotateLabel(int x, int y, String text, double angle) {
		rotateLabel(this.graphics,x,y,text,angle);
	}
	public void rotateLabel(Graphics2D g,int x, int y, String text, double angle) {
		g.translate((float) x, (float) y);
		g.rotate(Math.toRadians(angle));
		g.drawString(text, 0, 0);
		g.rotate(-Math.toRadians(angle));
		g.translate(-(float) x, -(float) y);
	}

	public void drawSelection(Graphics2D g, Pen pen, int x, int y, int x2, int y2) {
		g.setStroke(new BasicStroke(pen.getWidth()));
		g.setColor(pen.getColor());
		g.fillRect(x, y, x2 - x, y2 - y);
		g.drawRect(x, y, x2 - x, y2 - y);
	}

	private Rectangle rectangle = new Rectangle();

	public void draw(int x, int y, BeeShape shape) {
		draw(graphics, x, y, shape);
	}

	public void draw(int x, int y, BeeShape shape, boolean ischeck) {
		draw(graphics, x, y, shape, ischeck);
	}

	public void draw(Graphics2D g, int x, int y, BeeShape shape) {
		draw(g, x, y, shape, true);
	}

	public void draw(Graphics2D g, int x, int y, BeeShape shape, boolean ischeck) {
		switch (shape.getShapeStyle()) {
		case Circle:
			ellipse(g, x, y, shape);
			break;
		case Rectangle:
			rectangle(g, x, y, shape);
			break;
		case Triangle:
			polygon(g, x, y, shape);
			break;
		case DownTriangle:
			downPolygon(g, x, y, shape);
			break;
		case LeftTriangle:
			leftPolygon(g, x, y, shape);
			break;
		case RightTriangle:
			rightPolygon(g, x, y, shape);
			break;
		case Diamond:
			diamondPolygon(g, x, y, shape);
			break;
		case Cross:
			cross(g, x, y, shape);
			break;
		case Hexagon:
			hexagon(g, x, y, shape);
			break;
		case Star:
			star(g, x, y, shape);
			break;
		}
	}

	public boolean contains(Point point1, Point point2) {
		if (chartRect.getWidth() > 0) {
			if (chartRect.contains(point1) && chartRect.contains(point2))
				return true;
			else
				return false;
		}
		return false;
	}

	public void setContainRectangle(Rectangle rect) {
		if (chartRect.getWidth() > 0) {
			if (!chartRect.contains(new Rectangle((int) rect.x, (int) rect.y, (int) rect.width, (int) rect.height))) {
				float ileft = rect.x;
				float iright = rect.x + rect.width;
				float itop = rect.y;
				float ibottom = rect.y + rect.height;

				if (chartRect.x > rect.x)
					ileft = chartRect.x;

				if (chartRect.x + chartRect.width < rect.x + rect.width)
					iright = chartRect.x + chartRect.width;

				if (chartRect.y > rect.y)
					itop = chartRect.y;

				if (chartRect.y + chartRect.height < rect.y + rect.height)
					ibottom = chartRect.y + chartRect.height;

				rect = new Rectangle((int) ileft, (int) itop, (int) (iright - ileft), (int) (ibottom - itop));
			}
		}
	}

	public void rectangleBoxPlot(BeeShape shape, Rectangle rect) {
		if (rect.getWidth() <= 0 || rect.getHeight() <= 0)
			return;
		
		if(isGradient){
			GradientPaint gp = new GradientPaint(
					rect.x, rect.y, shape.getColor().darker(),
					rect.x + rect.width, rect.y , shape.getColor());
			graphics.setPaint(gp);
		}
		else
			graphics.setColor(shape.getColor());
		graphics.setFont(font);
		graphics.setStroke(new BasicStroke(shape.getPenwidth()));
		switch (shape.getPointShapeStyle()) {
		case Both:
			graphics.fillRect(rect.x, rect.y, rect.width, rect.height);
			graphics.drawRect(rect.x, rect.y, rect.width, rect.height);
			break;
		case Border:
			graphics.drawRect(rect.x, rect.y, rect.width, rect.height);
			break;
		case Brush:
			graphics.fillRect(rect.x, rect.y, rect.width, rect.height);
			break;
		}
	}

	public void rectangle(BeeShape shape, Rectangle rect) {
		rectangle(graphics, rect, shape);
	}

	public void rectangle(int x, int y, BeeShape shape) {
		rectangle(graphics, x, y, shape);
	}

	public void rectangle(Graphics2D g, int x, int y, BeeShape shape) {
		int hsize = shape.getHorizSize();
		int vsize = shape.getVerSize();

		rectangle.x = x - hsize / 2;
		rectangle.y = y - vsize / 2;
		rectangle.width = hsize;
		rectangle.height = vsize;

		rectangle(g, rectangle, shape);
	}

	public void rectangle(Graphics g, Rectangle rect, BeeShape shape) {
		if (g == null)
			return;
		
		if(isGradient){
			GradientPaint gp = new GradientPaint(
					rect.x, rect.y, shape.getColor().darker(),
					rect.x + rect.width,rect.y , shape.getColor());
			graphics.setPaint(gp);
		}
		else
			graphics.setColor(shape.getColor());
		
		graphics.setFont(font);
		graphics.setStroke(new BasicStroke(shape.getPenwidth()));
		switch (shape.getPointShapeStyle()) {
		case Both:
			graphics.fillRect(rect.x, rect.y, rect.width, rect.height);
			graphics.setColor(shape.getPencolor());
			graphics.drawRect(rect.x, rect.y, rect.width, rect.height);
			break;
		case Border:
			graphics.drawRect(rect.x, rect.y, rect.width, rect.height);
			break;
		case Brush:
			graphics.fillRect(rect.x, rect.y, rect.width, rect.height);
			break;
		}
	}

	public void ellipse(int x, int y, BeeShape shape) {
		ellipse(graphics, x, y, shape);
	}

	public void ellipse(Graphics2D g, int x, int y, BeeShape shape) {
		int hsize = shape.getHorizSize();
		int vsize = shape.getVerSize();
		if (!shape.isTransparent()) {
			if(isGradient){
				GradientPaint gp = new GradientPaint(
						x - hsize / 2, y - vsize / 2, shape.getColor().darker(),
						x - hsize / 2 + hsize+1, vsize+1 , shape.getColor());
				g.setPaint(gp);
			}
			else
				g.setColor(shape.getColor());
			//g.fillArc(x - hsize / 2, y - vsize / 2, hsize+1, vsize+1, 0, 360);
			g.fillOval(x - hsize / 2, y - vsize / 2, hsize+1, vsize+1);
		}

		if (shape.isPenvisible()) {	
			g.setStroke(new BasicStroke(shape.getPenwidth()));
			g.setColor(shape.getPencolor());
			//g.drawArc(x - hsize / 2, y - vsize / 2, hsize, vsize, 0, 360);
			g.drawOval(x - hsize / 2, y - vsize / 2, hsize, vsize);
		}
	}

	public void polygon(Graphics2D g, int x, int y, BeeShape shape) {
		int hsize = shape.getHorizSize();
		int vsize = shape.getVerSize();

		Point[] p = new Point[] { new Point(x - hsize / 2, y + vsize / 2), new Point(x + hsize / 2, y + vsize / 2),
				new Point(x, y - vsize / 2) };

		polygon(g, p, shape);
	}

	public void polygon(Graphics2D g, Point[] p, BeeShape shape) {
		Polygon polygon = new Polygon();
		int x1 = Integer.MAX_VALUE;
		int y1 = Integer.MAX_VALUE;
		int x2 = -Integer.MAX_VALUE;
		int y2 = -Integer.MAX_VALUE;
		
		for (int i = 0; i < p.length; i++){
			polygon.addPoint(p[i].x, p[i].y);
			if(isGradient){
				x1 = Math.min(x1, p[i].x);
				x2 = Math.max(x2, p[i].x);
				y1 = Math.min(y1, p[i].y);
				y2 = Math.max(y2, p[i].y);
			}
		}
		
		if (!shape.isTransparent()) {
			if(isGradient){
				GradientPaint gp = new GradientPaint(
						x1, y1, shape.getColor().darker(),
						x2, y1 , shape.getColor());
				g.setPaint(gp);
			}
			else
				g.setColor(shape.getColor());
			g.fillPolygon(polygon);
		}
		if (shape.isPenvisible()) {
			g.setStroke(new BasicStroke(shape.getPenwidth()));
			g.setColor(shape.getPencolor());
			g.drawPolygon(polygon);
		}
	}

	public void downPolygon(Graphics2D g, int x, int y, BeeShape shape) {
		int hsize = shape.getHorizSize();
		int vsize = shape.getVerSize();

		Point[] p = new Point[] { new Point(x - hsize / 2, y - vsize / 2), new Point(x + hsize / 2, y - vsize / 2),
				new Point(x, y + vsize / 2) };
		polygon(g, p, shape);
	}
	
	public void leftPolygon(Graphics2D g, int x, int y, BeeShape shape) {
		int hsize = shape.getHorizSize();
		int vsize = shape.getVerSize();

		Point[] p = new Point[] { new Point(x - hsize / 2, y), new Point(x + hsize / 2, y - vsize / 2),
				new Point(x + hsize / 2, y + vsize / 2) };
		polygon(g, p, shape);
	}

	public void rightPolygon(Graphics2D g, int x, int y, BeeShape shape) {
		int hsize = shape.getHorizSize();
		int vsize = shape.getVerSize();

		Point[] p = new Point[] { new Point(x - hsize / 2, y - vsize / 2), new Point(x - hsize / 2, y + vsize / 2),
				new Point(x + hsize / 2, y) };
		polygon(g, p, shape);
	}

	public void diamondPolygon(Graphics2D g, int x, int y, BeeShape shape) {
		int hsize = shape.getHorizSize();
		int vsize = shape.getVerSize();

		Point[] p = new Point[] { new Point(x - hsize / 2, y), new Point(x, y - vsize / 2), new Point(x + hsize / 2, y),
				new Point(x, y + vsize / 2) };
		polygon(g, p, shape);
	}

	private void hexagon(Graphics2D g, int x, int y, BeeShape shape) {
		int hsize = shape.getHorizSize() / 2;
		int vsize = shape.getVerSize() / 2;

		int num = vsize / 2;
		int x1 = x - hsize;
		int x2 = x + hsize;
		int y1 = y - vsize;
		int y2 = y + vsize;
		Point[] p = new Point[] { new Point(x, y1), new Point(x2, y - num), new Point(x2, y + num), new Point(x, y2),
				new Point(x1, y + num), new Point(x1, y - num) };
		polygon(g, p, shape);
	}

	public void cross(Graphics2D g, int x, int y, BeeShape shape) {
		int hsize = shape.getHorizSize();
		int vsize = shape.getVerSize();

		int x1 = x - hsize / 2;
		int y1 = y - vsize / 4;
		int width = hsize;
		int height = vsize / 2;

		int x2 = x - hsize / 4;
		int y2 = y - vsize / 2;
		int width2 = hsize / 2;
		int height2 = vsize;

		switch (shape.getShapeStyle()) {
		case Cross:
			if (!shape.isTransparent()) {
				if(isGradient){
					GradientPaint gp = new GradientPaint(
							x1, y1, shape.getColor().darker(),
							x2, y1, shape.getColor());
					g.setPaint(gp);
				}
				else
					g.setColor(shape.getColor());
				
				g.fillRect(x1, y1, width, height);
				g.fillRect(x2, y2, width2, height2);
			}

			if (shape.isPenvisible()) {
				g.setColor(shape.getPencolor());
				g.setStroke(new BasicStroke(shape.getPenwidth()));
				g.drawRect(x1, y1, width, height);
				g.drawRect(x2, y2, width2, height2);
			}
			break;
		/*
		 * case Horizontal: if (!shape.isTransparent()) g.fillRect(x1, y1,
		 * width, height); if (shape.isPenvisible()) g.drawRect(x1, y1, width,
		 * height); break; case Vertical: if (!shape.isTransparent())
		 * g.fillRect(x2, y2, width2, height2); if (shape.isPenvisible())
		 * g.drawRect(x2, y2, width2, height2); break;
		 */
		}
	}

	private void diagStar(Graphics2D g, int x, int y, BeeShape shape) {

		int size = shape.getVerSize();

		Point[] p = new Point[8];
		p[0] = new Point(x - size / 2, y);
		p[1] = new Point(x - size / 10, y - size / 10);
		p[2] = new Point(x, y - size / 2);
		p[3] = new Point(x + size / 10, y - size / 10);
		p[4] = new Point(x + size / 2, y);
		p[5] = new Point(x + size / 10, y + size / 10);
		p[6] = new Point(x, y + size / 2);
		p[7] = new Point(x - size / 10, y + size / 10);
		polygon(g, p, shape);
	}

	private void star(Graphics2D g, int xc, int yc, BeeShape shape) {

		int r = shape.getVerSize() / 2;
		float sin36 = (float) Math.sin(36.0 * Math.PI / 180.0);
		float sin72 = (float) Math.sin(72.0 * Math.PI / 180.0);
		float cos36 = (float) Math.cos(36.0 * Math.PI / 180.0);
		float cos72 = (float) Math.cos(72.0 * Math.PI / 180.0);
		float r1 = r * cos72 / cos36;

		Point[] p = new Point[10];
		p[0] = new Point((int)xc, (int)(yc - r));
		p[1] = new Point((int)(xc + r1 * sin36), (int)(yc - r1 * cos36));
		p[2] = new Point((int)(xc + r * sin72), (int)(yc - r * cos72));
		p[3] = new Point((int)(xc + r1 * sin72), (int)(yc + r1 * cos72));
		p[4] = new Point((int)(xc + r * sin36), (int)(yc + r * cos36));
		p[5] = new Point((int)(xc), (int)(yc + r1));
		p[6] = new Point((int)(xc - r * sin36), (int)(yc + r * cos36));
		p[7] = new Point((int)(xc - r1 * sin72), (int)(yc + r1 * cos72));
		p[8] = new Point((int)(xc - r * sin72), (int)(yc - r * cos72));
		p[9] = new Point((int)(xc - r1 * sin36), (int)(yc - r1 * cos36));
		polygon(g, p, shape);
	}
}
