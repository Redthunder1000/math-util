/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Truong.util.test;

import static Truong.util.MathUtility.*; // chỉ có từ JDK 5 trở lên, hàm static gọi mà k cần tên class chấm
// do mình đã chơi trò khau báo săn tên class và tên hàm static qua lệnh import static
// sau này xài hàm static của class này ko cần tên class chấm, xài như c
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author THINKPAD
 */
public class MathUtilityTest {
    
    // viết các tình huống xài getFactorial()
    // kiểm tra actual == expected
    // show xanh - đỏ
    // ngoài ra nó còn dùng cho việc CI - Continous Integration; CD - Continous Delivery; CT - Continous Regression Test;  DevOps - Development & Operation
    // app liên tục đc kiểm tra chất lượng code, build ra file .jar .war
    // đẩy lên 1 server trung gian - STAGING ENVIRONMENT để nhóm test
    // sẵn sàng test kĩ
    // sau đó có thể đẩy thẳng lên PRODUCTION SERVER, máy chạy ở nơi khách hàng
    // mọi viẹc sẽ bắt đầu ke963 từ lúc Developer push code lên Github
    // mọi thứ cứ thế tự động, không cần con người can thiệp
    
    @Test // ~ biến hàm này thành public static void main()
    // hàm này mình sẽ show ra màu xanh đỏ dựa trên sự khớp nhau của Actual và Expected qua hàm assertEquals() .... mà thự viện cung cấp
    // assert...() đủ thứ assert - hàm so sánh
    // nhờ hàm so sánh thay vì nhờ mắt so sánh
    public void getFactorial_RunsWell_IfValidArgument(){
        assertEquals(120, getFactorial(5));
        assertEquals(24, getFactorial(4));
        assertEquals(720, getFactorial(6));
        assertEquals(1, getFactorial(0));
    }
}
