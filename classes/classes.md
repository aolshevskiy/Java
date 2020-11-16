1.*Опишите процедуру инициализации полей класса и полей экземпляра класса. Когда инициализируются поля класса, а когда – поля экземпляров класса. Какие значения присваиваются полям по умолчанию? Где еще в классе полям могут быть присвоены начальные значения?*
- Поля класса описываются непосредсвтенно внутри класса и они являются обобщенными. 
Поля экземпляра класса это объект внутри которого могут быть присвоены значения переменных поля класса.
- поля класса иницализируются в самом классе например:
```
class Student{
private int course = 1;
private float  average;
```
- поля экземпляра инициализируются в зависимости от необходимости. один из примеров:
```
public static void main(String[] args){
	Student student = new Student(3) // представим что тут конструктор Average
   	student.setCourse(5) // представим что тут есть сеттер, чтобы мы могли поменять курс студента.
```
- по умолчанию целочисленные переменные получают = 0; строковые = null; булевые = false; с плавающей точкой = 0.0; символьные '\u0000'.
- в конструкторе.
2. *Дайте определение перегрузке методов. Как вы думаете, чем удобна перегрузка методов? Укажите, какие методы могут перегружаться, и какими методами они могут быть перегружены? Можно ли перегрузить методы в базовом и производном классах? Можно ли private метод базового класса перегрузить public методов производного? Можно ли перегрузить конструкторы, и можно ли при перегрузке конструкторов менять атрибуты доступа у конструкторов?*
- Перегрузка методов - это возможность создавать несколько методов с одинаковым названием, но разными входыми параметрами.
- можно создавать конструкторы/методы с разными входными параметрами. в условиях одного наименования всегда ясна исполняемая функция.
- статические методы могут перегружаться нестатическими и наоборот
- 