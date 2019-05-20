import java.util.*;

public class RectangleArea {

    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        if(C < E || G < A )
            return (G - E) * (H - F) + (C - A) * (D - B);
     
        if(D < F || H < B)
            return (G - E) * (H - F) + (C - A) * (D - B);
     
        int right = Math.min(C, G);
        int left = Math.max(A, E);
        int top = Math.min(H, D);
        int bottom = Math.max(F, B);
     
        return (G - E) * (H - F) + (C - A) * (D - B) - (right - left) * (top - bottom);
    }

    public static void main(String args[]) {

        int A = 1, B = 1, C = 5, D = 5, E = 3, F = 3, G = 7, H = 7;
        int area = computeArea(A, B, C, D, E, F, G, H);
        System.out.println("The Area of the Rectangle: " + area);

    }

}



























