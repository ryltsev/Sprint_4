import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

public class DataCustomerTest {

    @RunWith(Parameterized.class)
    public static class DataTest {
        private final String name;
        private final boolean expected;

        public DataTest(String name, boolean expected) {
            this.name = name;
            this.expected = expected;
        }

        @Parameterized.Parameters
        public static Object[][] getCustomerData() {
            return new Object[][]{
                    {"Тимотииии Шаламеее", true}, //18 символов
                    {"Тимотииии Шаламееее", true}, // 19 символов
                    {"Тимотиииии Шаламееее", false}, //20 символов
                    {"Т ", false},  //2 символа
                    {"Ти а", true}, //4 символа
                    {"Т Ш", true},  //3 символа
                    {"", false}, //пустое значение
                    {null, false},
                    {" Тимоти Шаламе ", false},
                    {"Тимоти Шаламе ", false},
                    {" Тимоти Шаламе", false},
                    {"Тимоти  Шаламе", false},
                    {"ТимотиШаламе", false},
            };
        }

        @Test
        public void validName() {
            Account account = new Account(name);
            boolean actual = account.checkNameToEmboss();
            assertEquals(expected, actual);
        }
    }
}



