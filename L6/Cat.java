// 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
// а) информационной системой ветеринарной клиники
// б) архивом выставки котов
// в) информационной системой Театра кошек Ю. Д. Куклачёва
// Можно записать в текстовом виде, не обязательно реализовывать в java.

package L6;

import java.sql.Date;



public class Cat {
        // Vet Clinic
    String nameCat;
    String nameHolder;
    Date birthYear;
    float height;
    float weight;
    String diagnosis;
    
        // Archiv Contest
    // String nameCat;
    // String nameHolder;
    // Date birthYear;
    String breed;
    // String nameMamaCat;
    // String namePapaCat;
    float riting;
    int age;

        // Kuklachev`s Theatre
    // String nameCat;
    // Date birthYear;
    // String breed;
    String actorUmplua;
    String character;
    String nameMamaCat;
    String namePapaCat;    
    
    // 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы. 
    // Создайте несколько экземпляров этого класса, выведите их в консоль.
    // 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст 
    // (или другие параметры на ваше усмотрение).

    public Cat (String nameCat, int age, String breed){
        this.nameCat = nameCat;
        this.age = age;
        this.breed = breed;
    }

    public String toString() {

        return "Name: " + nameCat + "; Age: " + age + "; Breed: " + breed;
    }
    
}




