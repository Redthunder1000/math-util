
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
        System.out.println("I want to see the RED or GREEN!!!");
    }
    // mình mún kết luận hàm nogn, mình phải test các trường hợp xài hàm
    // mình phải thiết kế các test case, tình huống test để sau đó mình verify
    // giữa giá trị trả về của hàm (actual) có khớp với expected cái mình dự định hàm chạy trả về
    // và nếu mọi thứ khớp, tức là actual == expected, mình mới dám gáy hàm ngon
    // nhược điểm: nhìn bằng mắt và so sánh kết quả của từng case
    //cách này tiềm ẩn sai sót do nhìn = mắt
    
    // cách nâng cao
    // cũng nhìn = mắt, nhưng nhìn 2 màu xanh - đỏ cho mọi test case
    // nếu bạn xài 100 tham số, chạy hàm với 100 tình huống khác nhau
    // bạn chỉ cần nhìn duy nhất 2 màu xanh - đỏ
    // xanh - code ổn định cho mọi test case
    // đỏ - nếu mọi case màu xanh, chỉ có 1 thằng đỏ => cả đám đỏ
    // phải đảm bảo rằng phải chính xác mọi tình huống
    
    // mún làm đc điều này, cần sự phụ giúp của các thư viện bên ngoài JDK, gọi là UNIT TEST FRAMEWORK
    // nổi tiếng: JUnit, TestNG, NUnit,...
    // nay học qua JUnit
    // test hàm có ngon ko, nhưng chỉ nhìn đúng 2 màu, ko care chi tiết các tình huống chạy hàm
}