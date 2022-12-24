//1. Класс Группа содержит в себе коллекцию Студентов. По группе можно перемещаться с помощью итератора.
//(Это повторяет 1-ю задачу из классной работы). Остальные задачи надстраиваются поверх неё.

//2. Создайте класс GroupListIterator, который позволяет перемещаться по группе в обоих направлениях.
// Он реализует интерфейс ListIterator<Student>.
//Добавьте в Группу метод listIterator (), который позволяет начать итерацию с помощью GroupListIterator.

//3. Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
//Он отслеживает текущую позицию в переборе
//Он изначально выставлен на конечную позицию
//Он движется справа налево
//Проверьте, как он работает.

package org.example;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        StudentGroup group = new StudentGroup(Arrays.asList(
                new Student("Вася"),
                new Student("Галя"),
                new Student("Коля")
        ));

        Iterator<Student> it = group.descendingIterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}