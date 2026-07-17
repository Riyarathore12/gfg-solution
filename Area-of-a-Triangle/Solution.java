import java.util.*;
class Solution {
    public double findArea(int a, int b, int c) {
        // code here
        if(a+b<=c || b+c <= a || a+c <= b){
            return 0.000;
        }
        double s = (a+b+c)/2.0;
        double area= Math.sqrt(s*(s-a)*(s-c)*(s-b));
        area = Math.floor(area*1000)/1000.0;
        return area;
    }
}