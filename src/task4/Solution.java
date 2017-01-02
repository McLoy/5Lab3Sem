package task4;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Solution {

    private static JFrame mainMap;
    private static Polygon poly;

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = in.nextInt();
        System.out.println("Enter R:");
        int r = in.nextInt();
        int x = r + 50, y = r + 50;
        double angle;
        int[] arrX = new int[n + 1];
        int[] arrY = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            angle = 2 * Math.PI * i / n;
            arrX[i] = (int) (r * Math.cos(angle) + x);
            arrY[i] = (int) (r * Math.sin(angle) + y);
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                mainMap = new JFrame();
                mainMap.setResizable(false);

                mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                poly = new Polygon(arrX, arrY, arrX.length);
                JPanel p = new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        g.setColor(Color.BLUE);
                        g.drawPolygon(poly);
                    }

                    @Override
                    public Dimension getPreferredSize() {
                        return new Dimension(800, 600);
                    }
                };
                mainMap.add(p);
                mainMap.pack();
                mainMap.setVisible(true);
            }
        });
    }
}
