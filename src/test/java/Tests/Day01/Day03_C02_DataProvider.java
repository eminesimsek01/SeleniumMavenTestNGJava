package Tests.Day01;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_C02_DataProvider {
    //username, email, password, number
    @Test(dataProvider="getData")
    public void test(String username,String email, String password, int number){
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        System.out.println("email = " + email);
        System.out.println("number = " + number);
 }
    @DataProvider
    public Object[][] getData(){

       Object[][] data={
               {"Emine","emine@cw.com","123", 1},
               {"Mehmet","meymet@cw.com","1357",2},
               {"Elif","elif@cw.com","abc123",3},
               {"Enes","enes@cw,com","987ll",4}
       };
        return data;
    }
}
