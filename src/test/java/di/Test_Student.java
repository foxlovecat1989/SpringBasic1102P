
package di;

import com.mycompany.springbasic1102p.di.Student;
import org.junit.Test;

/**
 *
 * @author foxlo
 */
public class Test_Student {
    @Test 
    public void test() {
        Student s1 = new Student();
        s1.setName("Vincent");
        s1.setAge(18);
        System.out.println(s1);
    }
}
