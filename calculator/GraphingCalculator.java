 
import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import javax.swing.JPanel;
import java.util.*;
/**
 * to do:
 * 
 * domain unrestricted (-∞,∞):
 * 
 * cubic
 * greatest integer [int()]
 * 
 * domain restricted:
 * 
 */
public class GraphingCalculator extends Calculator{
    private JFrame frame;
    /**
     * RSCALE used as recommended scaling for best viewing results
     */
    public static final int RSCALE = 30;
    /**
     * boolean value to tell grapher whether to automatically scale to RSCALE.
     * Default value is false
     */
    public static boolean AUTOSCALE = false;
    /**
     * boolean value to tell msgrapher whether to automatically scale to MSCALE.
     * Default value is false
     */
    protected static boolean MANUALSCALE = false;
    /**
     * MSCALE used for manual scaling by MSGraphingCalculator subclass
     */
    protected static int MSCALE;
    /**
     * creates an instance of a graphing calculator
     */
    public GraphingCalculator(){
        super();
        frame = new JFrame();
        frame.setSize(600,600);
        frame.setTitle("Graphing Calculator Window {this.gc.run().disp() - calc.show(=true)}");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphComponent component = new GraphComponent();
        frame.add(component);
        frame.setVisible(true);
    }
    /**
     * for testing purposes only
     */
    public final static void main(String [] args){
        GraphingCalculator calc = new GraphingCalculator();
        /* Test A
        Linear l = new Linear(4,2);
        GraphingCalculator calc = new GraphingCalculator();
        calc.graphLine(l);
        Quadratic q = new Quadratic(-2,5,-15);
        calc.graphQuadratic(q);
        AbsoluteValue a = new AbsoluteValue(2,5,1,-1);
        calc.graphAbsoluteValue(a);
        Sine s = new Sine(200,1,1,0,0);
        calc.graphSine(s);
        Cosine c = new Cosine(200,1,1,0,0);
        calc.graphCosine(c);
        */
        /* Test B
        Exponential e = new Exponential(100,2,1,-2,2);
        calc.graphExponential(e); 
        Logarithm l2 = new Logarithm(150,10,5,-2,1);
        calc.graphLogarithm(l2);
        SquareRoot sr = new SquareRoot(1,170,1,-2);
        calc.graphSquareRoot(sr);
        Tangent t = new Tangent(200,1,1,0,0);
        calc.graphTangent(t);
        Cotangent c = new Cotangent(200,1,1,0,0);
        calc.graphCotangent(c);
        */
        /* Test C
        Cosecant cs = new Cosecant(1,1,1,0,0);
        calc.graphCosecant(cs);
        Secant s = new Secant(1,1,1,0,0);
        calc.graphSecant(s);
        */
        /* Test D
        Reciprocal r = new Reciprocal(30,1,0,0);
        calc.graphReciprocal(r);
        */
        ArcSine as = new ArcSine(30,1,1,0,0);
        calc.graphArcSine(as);
        ArcCosine ac = new ArcCosine(30,1,1,0,0);
        calc.graphArcCosine(ac);
        ArcTangent at = new ArcTangent(30,1,1,0,0);
        calc.graphArcTangent(at);
    }
    /**
     * graphs a line 
     */
    public void graphLine(Linear l){
        frame.setVisible(false);
        if (AUTOSCALE){
            l = new Linear(l.getA() * RSCALE, l.getB());
        }
        if (MANUALSCALE){
            l = new Linear(l.getA() * MSCALE, l.getB());
        }
        LineComponent lineComponent = new LineComponent(l);
        GraphComponent component = new GraphComponent();
        frame.add(component);
        frame.add(lineComponent);
        frame.setVisible(true);
    }
    /**
     * graphs a quadratic 
     */
    public void graphQuadratic(Quadratic q){
        //saved.add(q);
        frame.setVisible(false);
        if (AUTOSCALE){
            q = new Quadratic(q.getA() * RSCALE, q.getB(), q.getC());
        }
        if (MANUALSCALE){
            q = new Quadratic(q.getA() * MSCALE, q.getB(), q.getC());
        }
        QuadraticComponent quadraticComponent = new QuadraticComponent(q);
        GraphComponent component = new GraphComponent();
        frame.add(component);
        frame.add(quadraticComponent);
        frame.setVisible(true);
    }
    /**
     * graphs an absolute value
     */
    public void graphAbsoluteValue(AbsoluteValue a){
        //saved.add(a);
        frame.setVisible(false);
        if (AUTOSCALE){
            a = new AbsoluteValue(a.getA() * RSCALE, a.getB(), a.getC(), a.getD());
        }
        if (MANUALSCALE){
            a = new AbsoluteValue(a.getA() * MSCALE, a.getB(), a.getC(), a.getD());
        }
        AbsoluteValueComponent absComponent = new AbsoluteValueComponent(a);
        GraphComponent component = new GraphComponent();
        frame.add(component);
        frame.add(absComponent);
        frame.setVisible(true);
    }
    /**
     * graphs a sine 
     */
    public void graphSine(Sine s){
        //saved.add(s);
        frame.setVisible(false);
        if (AUTOSCALE){
            s = new Sine(s.getA() * RSCALE, s.getB(), s.getC(), s.getD(), s.getE());
        }
        if (MANUALSCALE){
            s = new Sine(s.getA() * MSCALE, s.getB(), s.getC(), s.getD(), s.getE());
        }
        SineComponent sComponent = new SineComponent(s);
        GraphComponent component = new GraphComponent();
        frame.add(component);
        frame.add(sComponent);
        frame.setVisible(true);
    }
    /**
     * graphs a cosine 
     */
    public void graphCosine(Cosine c){
        //saved.add(c);
        frame.setVisible(false);
        if (AUTOSCALE){
            c = new Cosine(c.getA() * RSCALE, c.getB(), c.getC(), c.getD(), c.getE());
        }
        if (MANUALSCALE){
            c = new Cosine(c.getA() * MSCALE, c.getB(), c.getC(), c.getD(), c.getE());
        }
        CosineComponent cComponent = new CosineComponent(c);
        GraphComponent component = new GraphComponent();
        frame.add(component);
        frame.add(cComponent);
        frame.setVisible(true);
    }
    /**
     * graphs an exponential 
     */
    public void graphExponential(Exponential e){
        frame.setVisible(false);
        if (AUTOSCALE){
            e = new Exponential(e.getA() * RSCALE, e.getB(), e.getC(), e.getD(), e.getE());
        }
        if (MANUALSCALE){
            e = new Exponential(e.getA() * MSCALE, e.getB(), e.getC(), e.getD(), e.getE());
        }
        ExpComponent eComponent = new ExpComponent(e);
        GraphComponent component = new GraphComponent();
        frame.add(component);
        frame.add(eComponent);
        frame.setVisible(true);
    }
    /**
     * graphs a logarithm 
     */
    public void graphLogarithm(Logarithm l){
        frame.setVisible(false);
        if (AUTOSCALE){
            l = new Logarithm(l.getA() * RSCALE, l.getB(), l.getC(), l.getD(), l.getE());
        }
        if (MANUALSCALE){
            l = new Logarithm(l.getA() * MSCALE, l.getB(), l.getC(), l.getD(), l.getE());
        }
        LogComponent lComponent = new LogComponent(l);
        GraphComponent component = new GraphComponent();
        frame.add(component);
        frame.add(lComponent);
        frame.setVisible(true);
    }
    /**
     * graphs a square root 
     */
    public void graphSquareRoot(SquareRoot s){
        frame.setVisible(false);
        if (AUTOSCALE){
            s = new SquareRoot(s.getA(), s.getB() * RSCALE, s.getC(), s.getD());
        }
        if (MANUALSCALE){
            s = new SquareRoot(s.getA(), s.getB() * MSCALE, s.getC(), s.getD());
        }
        SquareRootComponent sComponent = new SquareRootComponent(s);
        GraphComponent component = new GraphComponent();
        frame.add(component);
        frame.add(sComponent);
        frame.setVisible(true);
    }
    /**
     * graphs a tangent 
     */
    public void graphTangent(Tangent t){
        frame.setVisible(false);
        if (AUTOSCALE){
            t = new Tangent(t.getA() * RSCALE, t.getB(), t.getC(), t.getD(), t.getE());
        }
        if (MANUALSCALE){
            t = new Tangent(t.getA() * MSCALE, t.getB(), t.getC(), t.getD(), t.getE());
        }
        TangentComponent tComponent = new TangentComponent(t);
        GraphComponent component = new GraphComponent();
        frame.add(component);
        frame.add(tComponent);
        frame.setVisible(true);
    }
    /**
     * graphs a cotangent 
     */
    public void graphCotangent(Cotangent c){
        frame.setVisible(false);
        if (AUTOSCALE){
            c = new Cotangent(c.getA() * RSCALE, c.getB(), c.getC(), c.getD(), c.getE());
        }
        if (MANUALSCALE){
            c = new Cotangent(c.getA() * MSCALE, c.getB(), c.getC(), c.getD(), c.getE());
        }
        CotangentComponent cComponent = new CotangentComponent(c);
        GraphComponent component = new GraphComponent();
        frame.add(component);
        frame.add(cComponent);
        frame.setVisible(true);
    }
    /**
     * graphs a cosecant 
     */
    public void graphCosecant(Cosecant c){
        frame.setVisible(false);
        if (AUTOSCALE){
            c = new Cosecant(c.getA() * RSCALE, c.getB(), c.getC(), c.getD(), c.getE());
        }
        if (MANUALSCALE){
            c = new Cosecant(c.getA() * MSCALE, c.getB(), c.getC(), c.getD(), c.getE());
        }
        CosecantComponent cComponent = new CosecantComponent(c);
        GraphComponent component = new GraphComponent();
        frame.add(component);
        frame.add(cComponent);
        frame.setVisible(true);
    }
    /**
     * graphs a secant 
     */
    public void graphSecant(Secant s){
        frame.setVisible(false);
        if (AUTOSCALE){
            s = new Secant(s.getA() * RSCALE, s.getB(), s.getC(), s.getD(), s.getE());
        }
        if (MANUALSCALE){
            s = new Secant(s.getA() * MSCALE, s.getB(), s.getC(), s.getD(), s.getE());
        }
        SecantComponent sComponent = new SecantComponent(s);
        GraphComponent component = new GraphComponent();
        frame.add(component);
        frame.add(sComponent);
        frame.setVisible(true);
    }
    /**
     * graphs a reciprocal 
     */
    public void graphReciprocal(Reciprocal r){
        frame.setVisible(false);
        if (AUTOSCALE){
            r = new Reciprocal(r.getA() * RSCALE, r.getB(), r.getC(), r.getD());
        }
        if (MANUALSCALE){
            r = new Reciprocal(r.getA() * MSCALE, r.getB(), r.getC(), r.getD());
        }
        ReciprocalComponent rComponent = new ReciprocalComponent(r);
        GraphComponent component = new GraphComponent();
        frame.add(component);
        frame.add(rComponent);
        frame.setVisible(true);
    }
    /**
     * graphs an arcsine 
     */
    public void graphArcSine(ArcSine a){
        frame.setVisible(false);
        if (AUTOSCALE){
            a = new ArcSine(a.getA() * RSCALE, a.getB(), a.getC(), a.getD(), a.getE());
        }
        if (MANUALSCALE){
            a = new ArcSine(a.getA() * MSCALE, a.getB(), a.getC(), a.getD(), a.getE());
        }
        ASineComponent aComponent = new ASineComponent(a);
        GraphComponent component = new GraphComponent();
        frame.add(component);
        frame.add(aComponent);
        frame.setVisible(true);
    }
    /**
     * graphs an arccosine
     */
    public void graphArcCosine(ArcCosine a){
        frame.setVisible(false);
        if (AUTOSCALE){
            a = new ArcCosine(a.getA() * RSCALE, a.getB(), a.getC(), a.getD(), a.getE());
        }
        if (MANUALSCALE){
            a = new ArcCosine(a.getA() * MSCALE, a.getB(), a.getC(), a.getD(), a.getE());
        }
        ACosineComponent aComponent = new ACosineComponent(a);
        GraphComponent component = new GraphComponent();
        frame.add(component);
        frame.add(aComponent);
        frame.setVisible(true);
    }
    /**
     * graphs an arctangent 
     */
    public void graphArcTangent(ArcTangent a){
        frame.setVisible(false);
        if (AUTOSCALE){
            a = new ArcTangent(a.getA() * RSCALE, a.getB(), a.getC(), a.getD(), a.getE());
        }
        if (MANUALSCALE){
            a = new ArcTangent(a.getA() * MSCALE, a.getB(), a.getC(), a.getD(), a.getE());
        }
        ATangentComponent aComponent = new ATangentComponent(a);
        GraphComponent component = new GraphComponent();
        frame.add(component);
        frame.add(aComponent);
        frame.setVisible(true);
    }
    /**
     * hides the graph JFrame 
     */
    public void hide(){ frame.setVisible(false); }
    /**
     * shows the graph JFrame
     */
    public void show(){ frame.setVisible(true); }
}
class GraphComponent extends JComponent{
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.BLACK);
        Line2D.Double x_axis = new Line2D.Double(300,-1000,300,1000);
        Line2D.Double y_axis = new Line2D.Double(-1000,300,1000,300);
        g2d.draw(x_axis);
        g2d.draw(y_axis);
    }
}
class LineComponent extends JComponent{
    private Linear lin;
    public LineComponent(Linear linear){
        super();
        lin = linear;
    }
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.RED);
        double y1 = -10 * lin.getA() + lin.getB();
        double y2 = 10 * lin.getA() + lin.getB();
        Line2D.Double line = new Line2D.Double(0,300 + -1 * y1,600,300 + -1 * y2);
        g2d.draw(line);
    }
}
class AbsoluteValueComponent extends JComponent{
    private AbsoluteValue abs;
    public AbsoluteValueComponent(AbsoluteValue absoluteValue){
        super();
        abs = absoluteValue;
    }
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.MAGENTA);
        Point2D.Double basePoint = new Point2D.Double(-1 * 30 * abs.getC() + 300, abs.getD() + 300);
        int leftBound = (int)(Math.abs(-10 * abs.getB() + abs.getC()) * abs.getA() + abs.getD());
        int rightBound = (int)(Math.abs(10 * abs.getB() + abs.getC()) * abs.getA() + abs.getD());
        Line2D.Double leftLine = new Line2D.Double(new Point2D.Double(0,300 + (-1 * leftBound)), basePoint);
        Line2D.Double rightLine = new Line2D.Double(basePoint, new Point2D.Double(600,300 + (-1 * rightBound)));
        g2d.draw(leftLine);
        g2d.draw(rightLine);
    }
}
class QuadraticComponent extends JComponent{
    private Quadratic quad;
    public QuadraticComponent(Quadratic quadratic){
        super();
        quad = quadratic;
    }
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.BLUE);
        int xcounter = 0;
        for (double a = -10.0; a <= 10.0; a += .1){
            double value1 = quad.getValue(a);
            double value2 = quad.getValue(a+.1);
            Line2D.Double line = new Line2D.Double(xcounter,300-value1,xcounter+3,300-value2);
            g2d.draw(line);
            xcounter += 3;
        }
    }
}
class SineComponent extends JComponent{
    private Sine sin;
    public SineComponent(Sine s){
        super();
        sin = s;
    }
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.ORANGE);
        int xcounter = 0;
        for (double a = -10.0; a < 10.0; a+=.1){
            double value1 = sin.getValue(a);
            double value2 = sin.getValue(a+.1);
            Line2D.Double line = new Line2D.Double(xcounter, 300 - value1, xcounter + 3, 300 - value2);
            g2d.draw(line);
            xcounter += 3;
        }
    }
}
class CosineComponent extends JComponent{
    private Cosine cos;
    public CosineComponent(Cosine c){
        super();
        cos = c;
    }
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.GREEN);
        int xcounter = 0;
        for (double a = -10.0; a < 10.0; a+=.1){
            double value1 = cos.getValue(a);
            double value2 = cos.getValue(a+.1);
            Line2D.Double line = new Line2D.Double(xcounter, 300 - value1, xcounter + 3,300 - value2);
            g2d.draw(line);
            xcounter += 3;
        }
    }
}
class ExpComponent extends JComponent{
    private Exponential exp;
    public ExpComponent(Exponential e){
        super();
        exp = e;
    }
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.PINK);
        int xcounter = 0; 
        for (double a = -10.0; a <= 10.0; a+=.1){
            double value1 = exp.getValue(a);
            double value2 = exp.getValue(a+.1);
            Line2D.Double line = new Line2D.Double(xcounter,300-value1,xcounter+3,300-value2);
            g2d.draw(line);
            xcounter += 3;
        }
    }
}
class LogComponent extends JComponent{
    private Logarithm log;
    public LogComponent(Logarithm l){
        super();
        log = l;
    }
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.CYAN);
        int xcounter = 0;
        for (double a = -10.0; a <= 10.0; a += .1){
            double value1 = log.getValue(a);
            double value2 = log.getValue(a+.1);
            //System.out.println(value1 + " " + value2 + " " + a);
            if(Double.isNaN(value1) || Double.isNaN(value2)){
                xcounter += 3;
                continue;
            }
            Line2D.Double line = new Line2D.Double(xcounter,300-value1,xcounter+3,300-value2);
            g2d.draw(line);
            xcounter += 3;
        }
    }
}
class SquareRootComponent extends JComponent{
    private SquareRoot sqrt;
    public SquareRootComponent(SquareRoot s){
        super();
        sqrt = s;
    }
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(new Color(52,133,255));
        int xcounter = 0;
        for (double a = -10.0; a <= 10.0; a += .1){
            double value1 = sqrt.getValue(a);
            double value2 = sqrt.getValue(a+.1);
            //System.out.println(value1 + " " + value2 + " " + a);
            if(Double.isNaN(value1) || Double.isNaN(value2)){
                xcounter += 3;
                continue;
            }
            Line2D.Double line = new Line2D.Double(xcounter,300-value1,xcounter+3,300-value2);
            g2d.draw(line);
            xcounter += 3;
        }
    }
}
class TangentComponent extends JComponent{
    private Tangent tan;
    public TangentComponent(Tangent t){
        super();
        tan = t;
    }
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(new Color(37,124,27));
        int xcounter = 0;
        for (double a = -10.0; a <= 10.0; a += .1){
            double value1 = tan.getValue(a);
            double value2 = tan.getValue(a+.1);
            //System.out.println(value1 + " " + value2 + " " + a);
            if (value2 < value1){
                xcounter += 3;
                continue;
            }
            Line2D.Double line = new Line2D.Double(xcounter,300-value1,xcounter+3,300-value2);
            g2d.draw(line);
            xcounter += 3;
        }
    }
}
class CotangentComponent extends JComponent{
    private Cotangent cot;
    public CotangentComponent(Cotangent c){
        super();
        cot = c;
    }
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(new Color(255,0,171));
        int xcounter = 0;
        for (double a = -10.0; a <= 10.0; a += .1){
            double value1 = cot.getValue(a);
            double value2 = cot.getValue(a+.1);
            //System.out.println(value1 + " " + value2 + " " + a);
            if (value2 > value1){
                xcounter += 3;
                continue;
            }
            Line2D.Double line = new Line2D.Double(xcounter,300-value1,xcounter+3,300-value2);
            g2d.draw(line);
            xcounter += 3;
        }
    }
}
class CosecantComponent extends JComponent{
    private Cosecant csc;
    public CosecantComponent(Cosecant c){
        super();
        csc = c;
    }
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(new Color(163,32,203));
        double xcounter = 0;
        for (double a = -100.0; a <= 100.0; a += .01){
            double value1 = csc.getValue(a);
            double value2 = csc.getValue(a+.01);
            if ((value2 < 0 && value1 > 0)||(value1 < 0 && value2 > 0)){
                xcounter += .3;
                continue;
            }
            Line2D.Double line = new Line2D.Double(xcounter,300-value1,xcounter+.3,300-value2);
            g2d.draw(line);
            xcounter += .3;
        }
    }
}
class SecantComponent extends JComponent{
    private Secant sec;
    public SecantComponent(Secant s){
        super();
        sec = s;
    }
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(new Color(202,202,61));
        double xcounter = 0;
        for (double a = -100.0; a <= 100.0; a += .01){
            double value1 = sec.getValue(a);
            double value2 = sec.getValue(a+.01);
            if ((value2 < 0 && value1 > 0)||(value1 < 0 && value2 > 0)){
                xcounter += .3;
                continue;
            }
            Line2D.Double line = new Line2D.Double(xcounter,300-value1,xcounter+.3,300-value2);
            g2d.draw(line);
            xcounter += .3;
        }
    }
}
class ReciprocalComponent extends JComponent{
    private Reciprocal r;
    public ReciprocalComponent(Reciprocal recip){
        super();
        r = recip;
    }
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(new Color(218,138,69));
        int xcounter = 0;
        for (double a = -10.0; a <= 10.0; a += .1){
            double value1 = r.getValue(a);
            double value2 = r.getValue(a+.1);
            if ((value2 < 0 && value1 > 0) || (value1 < 0 && value2 > 0)){
                xcounter += 3;
                continue;
            }
            Line2D.Double line = new Line2D.Double(xcounter,300-value1,xcounter+3,300-value2);
            g2d.draw(line);
            xcounter += 3;
        }
    }
}
class ASineComponent extends JComponent{
    private ArcSine arc;
    public ASineComponent(ArcSine a){
        super();
        arc = a;
    }
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(new Color(0,255,213));
        int xcounter = 0;
        for (double a = -10.0; a <= 10.0; a += .1){
            double value1 = arc.getValue(a);
            double value2 = arc.getValue(a+.1);
            if (Double.isNaN(value1) || Double.isNaN(value2)){
                xcounter += 3;
                continue;
            }
            Line2D.Double line = new Line2D.Double(xcounter,300-value1,xcounter+3,300-value2);
            g2d.draw(line);
            xcounter += 3;
        }
    }
}
class ACosineComponent extends JComponent{
    private ArcCosine arc;
    public ACosineComponent(ArcCosine a){
        super();
        arc = a;
    }
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(new Color(240,128,128));
        int xcounter = 0;
        for (double a = -10.0; a <= 10.0; a += .1){
            double value1 = arc.getValue(a);
            double value2 = arc.getValue(a+.1);
            if (Double.isNaN(value1) || Double.isNaN(value2)){
                xcounter += 3;
                continue;
            }
            Line2D.Double line = new Line2D.Double(xcounter,300-value1,xcounter+3,300-value2);
            g2d.draw(line);
            xcounter += 3;
        }
    }
}
class ATangentComponent extends JComponent{
    private ArcTangent arc;
    public ATangentComponent(ArcTangent a){
        super();
        arc = a;
    }
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.GRAY);
        int xcounter = 0;
        for (double a = -10.0; a <= 10.0; a += .1){
            double value1 = arc.getValue(a);
            double value2 = arc.getValue(a+.1);
            if (Double.isNaN(value1) || Double.isNaN(value2)){
                xcounter += 3;
                continue;
            }
            Line2D.Double line = new Line2D.Double(xcounter,300-value1,xcounter+3,300-value2);
            g2d.draw(line);
            xcounter += 3;
        }
    }
}