package Tests.Day01;

import org.testng.annotations.DataProvider;

public class Day03_C03_DataProviderClass {
    @DataProvider
    public Object[][]testData(){

        Object[][]returnData={
                {"First Test", "birinci test"},
                {"Second Test", "ikinci test"},
                {"Third Test", "üçüncü test"}
        };
        return returnData;
    }


}
