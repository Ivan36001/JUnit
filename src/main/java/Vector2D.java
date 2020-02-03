/*Artifact- это, по сути, любая библиотека, хранящаяся в репозитории. Это может быть какая-то зависимость или плагин.
Зависимость- это те библиотеки, которые непосредственно используются в вашем проекте для компиляции кода или его тестирования.
 Архетип — это некая стандартная компоновка файлов и каталогов в проектах различного рода (веб, swing-проекты и прочие).
Apache Maven (идиш Собиратель Знаний)-инструмент для сборки проекта и управления зависимотями.
Java проект можно собраить в .jar(предназначены для хранения общих библиотек классов Java, ресурсов, вспомогательных
файлов и т.д.) и .war(это веб-архив, и они работают на веб-сервере) файлов.
Создание Maven-проекта: file->new->Project->Maven(имеет определенную структуру папок и файлов, а так же pom.xml файл
где прописываются зависимости которые Maven будет брать из интернета и подключать к нашему проекту, там же прописывается
 конфигурация сборки в jar или war-файл)->далее появится список архитипов (структур проектов) которые загружаются из
 интернета из репозитория  Maven и которые можно подключить  к своему проекту. Можно это пропустить (next) и задать
 структуру по умолчанию задав Groupid (url) и Artifactid (название нашего проекта)->next-finish. Структура папок:
 main.java-в этой папке создаются наши классы, resources-содержит статические ресурсы (текстовые файлы,CSS,HTML,
 javaScript-файлы т.е. все то что не является java кодом), папка test содержит тестовые файлы в папке java, файл pom.xml
 в котором описываются зависимости которые нам нужны и maven их сам подгружает( XML — это не исполняемый код, а язык
 описания данных.), External Libraries содержит все стороние библиотеки. На сайте maven repository копируем нужный нам
 XML-код и вставляем его в pon.xml-файл между двумя нами написанными тэгами <dependencies>........</dependencies>
 ->Import Changes (в правом нижнем углу) наша зависимость появится в External Libraries. Каждая зависимость (в xml)
 содержит тэги <groupId> <artifactId> <version> <scope> (область к которой эта зависимость относится у junit это test т.е
 эта зависимость будет использоватся только в тесте)
 Test case(тестовый сценарий)-понимается структура вида: action(действие)->Expected Result(ожидаемый результат)->
 Test Result(результат теста). Уровни тестирования:1) Модульное тестирование-проверка отдельных модулей (классов, методов)
 2) Интеграционное тестирование-проверка совместной работы нескольких модулей 3) Системное тестирование-проверка работы
 системы в целом. Модульное тестрование-проводится разработчиком. Что делает тест: 1) Воспроизводит некоторые данные и
 делает предварительные действия 2)Выполняет тестируемый метод, правильный результат которого очевиден автору теста
 3) Выполняет сопоставление полученного результата с ожидаемым (assert). Если ожидание и реальность совпадают-тест пройден
 Если нет-тест завален (чаще всего генерируется специальное исключение-AssertionError)
 Каждый тестовый сценарий это отдельный метод который необходимо помечать аннотацией @Test(даем понять библиотеке junit
 что наш метод это тестовый сценарий). Тестовый класс необходимо называть с суффиксом Test (например Vector2DTest).
 Тестовые методы желательно должны содержать "should"  в названии (П: sumShouldBePositive). Аннотация @Test объявляет метод
 (обязательно public void) тестовым. Аннотация @Test может использовать параметры: 1) expected-код в тесте проверяется
 на гененрацию определенного исключения. 2) Timeout-код в тесте должен работать не более указанного времени.
 Методы класса org.junit.Assert проверяют на соответствие ожидания реальности (assertTrue(),assertFalse(),assertEquals())
все эти методы статические. метод fail()-гарантированно заваливает тест
*/
public class Vector2D {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double length() {
        return Math.sqrt(x*x + y*y);

    }
}
