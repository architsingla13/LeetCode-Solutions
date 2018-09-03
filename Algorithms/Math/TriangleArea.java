package Math;

/**
 * Author - archit.s
 * Date - 03/09/18
 * Time - 11:45 AM
 */
public class TriangleArea {

    //area	= |Ax(By−Cy) + Bx(Cy−Ay) + Cx(Ay-By)|/2, points OR sqrt(S*(S-a)*(S-b)*(S-c))) where S = a+b+c/2, lengths
    private double AreaFormula(int[] a, int[] b, int[] c){
        return 0.5 * Math.abs(a[0]*(b[1]-c[1]) + b[0]*(c[1]-a[1]) + c[0]*(a[1]-b[1]));
    }

    public double largestTriangleArea(int[][] points) {

        double max = 0;
        int N = points.length;

        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                for(int k=j+1;k<N;k++){
                    double area = AreaFormula(points[i], points[j], points[k]);
                    max = Math.max(max, area);
                }
            }
        }

        return max;
    }

}
