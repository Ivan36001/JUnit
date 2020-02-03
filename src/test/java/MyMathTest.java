import org.junit.Test;

public class MyMathTest {
    @Test(expected=ArithmeticException.class)//пишем какое исключение ожидаем
    public void zeroDenominatorShouldThrowExeption(){//нолевой делитель должен выбрасывать исключение
    MyMath.divide(1,0);
    }
}
