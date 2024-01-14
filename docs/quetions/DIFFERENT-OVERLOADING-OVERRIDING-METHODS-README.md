## Отличие перегрузки методов от переопределения методов


| # | Overloading (перегрузка)                                           | Overriding (переопределение)                                                                                  |
|---|--------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------|
| 1 | Находится  в одном классе                                          | Происходит между двумя классами суперклассом и подклассом                                                     |
| 2 | Участвует один класс, наследование не участвует                    | Поскольку процесс переопределения происходит между суперклассом и подклассом, то тут участвует `Наследование` |
| 3 | Возвращаемый тип не должен быть одинаковым                         | Возвращаемый тип должен быть одинаковый                                                                       |
| 4 | Параметры должны быть всегда разными                               | Метод должен быть с одинаковыми параметрами                                                                   |
| 5 | Статический полиморфизм можно достичь с помощью перегрузки методов | Динамический полиморфизм можно достичь при помощи переопределения метода                                      |
| 6 | Один метод не скрывает другой метод                                | Переопределенный метод скрывает метод суперкласса                                                             |

> Статический полиморфизм - это полиморфизм, который не оказывает влияния на работу функции во время выполнения, но реализуется во время компиляции

> Динамический полиморфизм - это одна из основных концепций объектно-ориентированного программирования. Он позволяет использовать один и тот же метод или функцию для объектов разных классов, при условии, что они являются наследниками от одного базового класса или реализуют один и тот же интерфейс