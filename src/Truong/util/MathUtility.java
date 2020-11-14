/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Truong.util;

/**
 *
 * @author THINKPAD
 */
public class MathUtility {
    //làm đồ chơi giống thư viện math
    //Math.PI, .abs(), .sqrt(), .pow(a,b), a^b
    //static thẳng tiến
    //thư viện cần lưu info riêng thì non-static
    
    public static final double PI = 3.1415;
    
    //n! = 1*2*3....*n
    // 0<= n <=20 , 0! = 1! = 1   (21! kiểu long đéo chơi đc)
    //âm giai thừa vô nghĩa
    public static long getFactorial(int n){
        if (n<0 || n>20)
            throw new IllegalArgumentException("n must be between 0..20");
        if (n==0 || n==1)
            return 1; // đặc biệt
        //k cần viết else ở đây
        //mặc nhiên CPU đến đây => n = 2..20
        long result = 1;
        for(int i=2;i<=n;i++){
            result *= i;
        }
        return result;
    }
}
