# Композиция в Java: Структурирование классов

Композиция — это один из фундаментальных принципов объектно-ориентированного программирования в Java, который позволяет создавать сложные типы, используя другие классы. В этом уроке мы рассмотрим, что такое композиция и как она работает на примере компьютера.

## Что такое композиция?

Композиция — это процесс использования одного или нескольких классов в качестве полей внутри другого класса. Это позволяет выстраивать сложные структуры, где один класс "содержит" другой класс, и делает ваш код более модульным и переиспользуемым.

## Разбор на примере

Представим, что у нас есть класс [`Computer`](/Users/alexandr/Developer/dmdev/projects/dmdev-level2/src/ru/lexkml/level2/lesson7/part1/Computer.java), который ранее содержал примитивные поля `ssd` и `ram`. В реальных проектах вместо примитивных типов часто используются классы, отражающие более сложные и подробные характеристики.

Создадим классы [`Ram`](/Users/alexandr/Developer/dmdev/projects/dmdev-level2/src/ru/lexkml/level2/lesson7/part1/Ram.java) и [`Ssd`](/Users/alexandr/Developer/dmdev/projects/dmdev-level2/src/ru/lexkml/level2/lesson7/part1/Ssd.java), которые будут использоваться в классе [`Computer`](/Users/alexandr/Developer/dmdev/projects/dmdev-level2/src/ru/lexkml/level2/lesson7/part1/Computer.java):

## Использование композиции

В [`Computer`](/Users/alexandr/Developer/dmdev/projects/dmdev-level2/src/ru/lexkml/level2/lesson7/part1/Computer.java) мы включили два объекта: [`Ram`](/Users/alexandr/Developer/dmdev/projects/dmdev-level2/src/ru/lexkml/level2/lesson7/part1/Ram.java) и [`Ssd`](/Users/alexandr/Developer/dmdev/projects/dmdev-level2/src/ru/lexkml/level2/lesson7/part1/Ssd.java). Таким образом, класс [`Computer`](/Users/alexandr/Developer/dmdev/projects/dmdev-level2/src/ru/lexkml/level2/lesson7/part1/Computer.java) зависит от этих классов. Это и есть композиция: [`Computer`](/Users/alexandr/Developer/dmdev/projects/dmdev-level2/src/ru/lexkml/level2/lesson7/part1/Computer.java) включает [`Ram`](/Users/alexandr/Developer/dmdev/projects/dmdev-level2/src/ru/lexkml/level2/lesson7/part1/Ram.java) и [`Ssd`](/Users/alexandr/Developer/dmdev/projects/dmdev-level2/src/ru/lexkml/level2/lesson7/part1/Ssd.java) как составные части.

## Преимущества композиции

Используя композицию, мы можем легко расширять функциональность наших классов, не меняя их внутреннюю структуру. Композиция также помогает в поддержании принципа инкапсуляции, поскольку внутренние детали каждого класса остаются скрытыми от других классов.

## Заключение

Композиция является мощным инструментом в Java для создания гибких и легко расширяемых приложений. В следующих уроках мы продолжим изучение объектно-ориентированных принципов, таких как инкапсуляция и наследование, и углубимся в практическое использование композиции в проектах.
