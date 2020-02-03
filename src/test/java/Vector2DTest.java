import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
/*
public class Vector2DTest {
    @Test
    public void newVectorShouldHaveZeroLength(){
        Vector2D v1=new Vector2D();//action
        Assert.assertEquals(0,v1.length(),1e-9);//параметры: ожидание,реальность,дельта=0.000 000 000 1
    }
    @Test
    public void newVectorShouldHaveZeroX(){
        Vector2D v1=new Vector2D();
        Assert.assertEquals(0,v1.getX(),1e-9);
    }
    @Test
    public void newVectorShouldHaveZeroY(){
        Vector2D v1=new Vector2D();
        Assert.assertEquals(0,v1.getY(),1e-9);
    }
}*/
public class Vector2DTest {
    private final double EPS=1e-9;
    private static Vector2D v1;
    @BeforeClass//аннотация помечает вспомогательный метод который запускается только один раз
    public static void createNewVector(){//вспомогательный метод
        v1=new Vector2D();
    }
    @Test
    public void newVectorShouldHaveZeroLength(){
                Assert.assertEquals(0,v1.length(),EPS);//параметры: ожидание,реальность,дельта=0.000 000 000 1
    }
    @Test
    public void newVectorShouldHaveZeroX(){
               Assert.assertEquals(0,v1.getX(),EPS);
    }
    @Test
    public void newVectorShouldHaveZeroY(){
               Assert.assertEquals(0,v1.getY(),EPS);
    }
}
/*@BeforClass-запускается только один раз при запуске теста (statiс)-подготавливает тестовое окружение
@Befor-запускается перед каждым тестовым методом.
@Befor и @BeforClass-подготавливают тестовое окружение
@After-запускается после каждого метода
@AfterClass-запускается после того как отработали все тестовые методы(static)
@After и @AfterClass-закрывем соединения, чистим ресурсы и т.д.
Жизненный цикл тестирующего класса:
-@BeforClass-запускается один раз
-При запуске каждого  тестового метода создается объект тестового класса
-@Befor(запускается перед каждым тестовым методом)
-@Test
-@After
-@AfterClass-запускается один раз


 */