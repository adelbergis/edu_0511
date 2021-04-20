/*
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, по вашему усмотрению
Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
*/


public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat(5, 11, 5);
        Cat enemyCat = new Cat(13, 10, 5);
        System.out.println(myCat.fight(enemyCat));
    }
}

class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int myScore = 0, enemyScore = 0;

        if (anotherCat.age > this.age) enemyScore++;
        else if (anotherCat.age < this.age) myScore++;
        if (anotherCat.weight > this.weight) enemyScore++;
        else if (anotherCat.weight < this.weight) myScore++;
        if (anotherCat.strength > this.strength) enemyScore++;
        else if (anotherCat.strength < this.strength) myScore++;

        if (myScore > enemyScore) return true;
        return false;
    }

}
