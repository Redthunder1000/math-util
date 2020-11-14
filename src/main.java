
import Truong.util.MathUtility;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author THINKPAD
 */
public class main {

    public static void main(String[] args) {
        long exppected = 120; // tớ hy vọng thấy 120 nếu tớ gọi 5!
        long actual = MathUtility.getFactorial(5);
        // in ra kiểm tra sự khớp nhau giữa cái ta muốn và cái ta làm
        System.out.println(actual + " - - - " + exppected);
        System.out.println("0!=1 ; actual = " + MathUtility.getFactorial(0));
        //ném về ngoại lệ IllegalArgumentException
        try {
            System.out.println(MathUtility.getFactorial(21));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
