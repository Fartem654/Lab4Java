 <p><strong>Автор</strong>: Фадеев Артём ИТ-12<br>
   <strong>Вариант</strong>: 1<br>
 </p>

<hr>

<h2>Оглавление</h2>
<ul>
 <li>
  <a href="#алгоритм">Описание и решение заданий</a>
  <ul>
   <li>
    <a href="#задание12">Задание 1.2</a>
   </li>
     <li>
    <a href="#задание15">Задание 1.5</a>
   </li>
   <li>
    <a href="#задание21">Задание 2.1</a>
   </li>
   <li>
    <a href="#задание31">Задание 3.1</a>
   </li>
   <li>
    <a href="#задание32">Задание 3.2</a>
   </li>
    <li>
    <a href="#задание33">Задание 3.3</a>
   </li>
    <li>
    <a href="#задание34">Задание 3.4</a>
   </li>
 <li><a href="#структура-проекта">Структура проекта</a></li>
 <li><a href="#как-запустить">Как запустить</a></li>
</ul>

<h2 id="алгоритм">Алгоритмы выполнения</h2>

<h3 id="задание12">Задание 1.2</h3>
<p><strong>Текст задачи:</strong><br></p>
<p>Создайте сущность <strong>Хранилище</strong>, которая обладает следующими характеристиками:</p>
<ul>
<li>Может хранить один произвольный объект в один момент времени.</li>
<li>Хранилище неизменяемо.</li>
<li>Объект кладётся в Хранилище при его создании. В качестве объекта может быть сохранено также и значение <code>null</code>.</li>
<li>Хранилище может вернуть ссылку на объект.</li>
<li>Если вместо объекта хранится <code>null</code>, необходимо вернуть какое-либо альтернативное значение.</li>
<li>Метод получения значения должен работать с тем типом данных, который был указан во время создания объекта.</li>
</ul>
<p><strong>Примеры использования:</strong></p>
<ul>
<li>Создайте Хранилище чисел, положите туда значение <code>null</code>. Передайте Хранилище в метод, извлеките значение и выведите его на экран. Альтернативой должно быть число <code>0</code>.</li>
<li>Создайте Хранилище чисел, положите туда значение <code>99</code>. Альтернативой должно быть число <code>-1</code>.</li>
<li>Создайте Хранилище строк, положите туда <code>null</code>. Альтернативой должна быть строка <code>"default"</code>.</li>
<li>Создайте Хранилище строк, положите туда <code>"hello"</code>. Альтернативой должна быть строка <code>"hello world"</code>.</li>
</ul>
<p><strong>Описание выполнения задания:</strong><br>
<ul>
<li>
 Определяется класс <code>Storage</code> с типовым параметром <code>T</code>,
</li>
<li>
 Класс имеет приватное поле  <code>final T value</code>, где <code>T</code> передаваемый в класс тип.,
</li>
<li>
 Класс содержит геттер с параметром <code>T alternative</code>, если <code>value</code> будет null, геттер вернет <code>alternative</code>, иначе сылку на <code>value</code>,
</li>
<li>
Также класс имеет конуструктор с параметром <code>value</code> типа <code>T</code>,
</li>
<li>
 Переопределяется метод <code>toString</code>.
</li>
</ul>
<h4>Тесты</h4>
<img width="1240" height="653" alt="image" src="https://github.com/user-attachments/assets/1e9e4112-d680-4272-9e3d-5f08c91d540e" />
<hr>

<h3 id="задание15">Задание 1.5</h3>
<p><strong>Текст задачи:</strong><br></p>

<p><strong>Описание выполнения задания:</strong><br>
<p>Измените сущность <strong><a href="https://github.com/Fartem654/Lab3?tab=readme-ov-file#задание6">Линия</a></strong> таким образом, чтобы:</p>
<ul>
<li>При создании её объекта можно было точно указать тип точки — двухмерная (<code>Point</code>) или трёхмерная (<code>Point3D</code>).</li>
<li>Методы получения и установки значения точки могли работать с типом, указанным при создании объекта.</li>
<li>Граница стирания не могла быть хуже двумерной точки (т.е. параметр должен быть ограничен суперклассом <code>Point</code>).</li>
</ul>
<p><strong>Пример:</strong> создайте и выведите на экран произвольную линию в трёхмерном пространстве.</p>
<ul>
<li>
 К классу <code>Line</code> добавляется возможность записи типового параметра, который должен наследовать класс <code>Point</code>,
</li>
 <li>
 Переопределяются поля <code>start</code> и <code>end</code> - точки начала и конца линии, теперь они будут типа <code>T</code>,
</li>
 <li>
 В конструкторе добавляется проверка на равенство типов передаваемых <code>start</code> и <code>end</code>, в случае если начало и конец будут находится в разных пространствах, конструктор выбросит ошибку,
</li>
 <li>
 В сеттерах также добавляется  проверка на равенство типов передаваемых и уже хранящихся точек <code>start</code> и <code>end</code>, если точки находятся в одном пространстве, через оператор <code>instanceof</code> проверяется соответсвие входной точки классу <code>Poin3D</code>, елси точка в трехмерном пространстве, создается новый объект класса <code>Poin3D</code> и передается в поле точки.
</li>
</ul>
<h4>Тесты</h4>
<img width="804" height="299" alt="image" src="https://github.com/user-attachments/assets/3648fd66-a502-415d-84c0-9ca82074d8e7" />
<hr>

<h3 id="задание21">Задание 2.1</h3>
<p><strong>Текст задачи:</strong><br></p>
<p>Создайте метод, принимающий <strong>Линию</strong> (из задачи 1.5) с любой допустимой параметризацией и сдвигающий точку начала на <code>10</code> единиц по оси X.</p>
<p>Например:</p>
<ul>
<li>Если X был <code>5</code>, то должен стать <code>15</code>.</li>
<li>Если X был <code>-7</code>, то должен стать <code>-17</code>.</li>
</ul>
<p><strong>Описание выполнения задания:</strong><br>
<ul>
<li>
 В класс <code>Line</code> добавляется статический метод <code>Sdvg</code>, который принимает объект этого же класс с неопределенных типовым параметром,
</li>
 <li>
 В <code>Line</code> определено, что типовой параметр наследуется от <code>Point</code>, значит все точки в линиях разных пространств будут иметь координату <code>X</code>. Получем <code>X</code> и сдвигаем на 10.
</li>
</ul>
<h4>Тесты</h4>
<img width="646" height="296" alt="image" src="https://github.com/user-attachments/assets/a8b0d116-c980-453a-9fb5-5eb0bceb00d9" />
<hr>

<h3 id="задание31">Задание 3.1</h3>
<p><strong>Текст задачи:</strong><br></p>
<p>Разработайте обобщённый метод, который:</p>
<ul>
<li>Принимает список значений типа <code>T</code>,</li>
<li>Принимает объект с единственным методом <code>apply</code>,</li>
<li>Применяет этот метод к каждому элементу списка,</li>
<li>Возвращает новый список значений типа <code>P</code> (где <code>T</code> и <code>P</code> могут отличаться).</li>
</ul>
<p><strong>Примеры использования:</strong></p>
<ol>
<li>Список строк <code>["qwerty", "asdfg", "zx"]</code> → список их длин: <code>[6, 5, 2]</code>.</li>
<li>Список чисел <code>[1, -3, 7]</code> → модули: <code>[1, 3, 7]</code>.</li>
<li>Список массивов <code>[[1,5,3], [-2,-8,-1], [0]]</code> → максимумы: <code>[5, -1, 0]</code>.</li>
</ol>
<p><strong>Описание выполнения задания:</strong><br>
<ul>
<li>
Создаем обобщенный метод <code>listAction</code> с типовыми параметрами <code>T,P</code>,
</li>
<li>
 Метод принимает:
  <ul>
   <li>
     список <code>list</code> типа <code>T</code> - исходный список значений,
   </li>
   <li>
     Интерфейс <code>Action(T, P) action</code> - выполняющий действие с исходным списком.
   </li>
  </ul>
</li>
 <li>
 Создается пустой список <code>result</code>, в котором будут в катором будут значения типа <code>P</code>,
</li>
 <li>
 Далее метод проходит по списку и добавляет в результрующий список элементы после какого-то действия с помощью <code>action.apply(t)</code>,
</li>
 <li>
 Возвращает <code>result</code>.
</li>
</ul>
<h4>Тесты</h4>
<img width="900" height="773" alt="image" src="https://github.com/user-attachments/assets/20babd96-05ee-4eb1-a886-2537e6091476" />
<img width="946" height="547" alt="image" src="https://github.com/user-attachments/assets/9d9fdf5a-d115-4577-b1b0-4b870d8d6e0e" />
<hr>

<h3 id="задание32">Задание 3.2</h3>
<p><strong>Текст задачи:</strong><br></p>
<p>Разработайте обобщённый метод, который:</p>
<ul>
<li>Принимает список значений типа <code>T</code>,</li>
<li>Принимает объект с единственным методом <code>test(T): boolean</code>,</li>
<li>Возвращает новый список, содержащий только те элементы, для которых условие вернуло <code>true</code>.</li>
</ul>
<p><strong>Примеры использования:</strong></p>
<ol>
<li>Строки <code>["qwerty", "asdfg", "zx"]</code> → оставить только длиной ≥ 3: <code>["qwerty", "asdfg"]</code>.</li>
<li>Числа <code>[1, -3, 7]</code> → только положительные: <code>[1, 7]</code>.</li>
<li>Массивы целых → оставить только те, где <strong>нет ни одного положительного</strong> числа.</li>
</ol>
<p><strong>Описание выполнения задания:</strong><br></p>
<ul>
<li>
Создаем обобщенный метод <code>filter</code> с типовым параметром <code>T</code>,
</li>
<li>
 Метод принимает:
  <ul>
   <li>
     список <code>list</code> типа <code>T</code> - исходный список значений,
   </li>
   <li>
     Интерфейс <code>Test(T) condition</code> - выполняющий "фильтрацию" исходного списка.
   </li>
  </ul>
</li>
 <li>
 Создается пустой список <code>result</code>, в котором будут "филтрованные" значения,
</li>
 <li>
 Далее метод проходит по списку и проверяет условие выполнения для каждого элемента с помощью <code>condition.test(list.get(i))</code>, далее добавляем в <code>result</code>,
</li>
 <li>
 Возвращает <code>result</code>.
</li>
</ul>
<h4>Тесты</h4>
<img width="667" height="775" alt="image" src="https://github.com/user-attachments/assets/141b1d09-459d-48b2-b867-06a86cdfdda1" />
<img width="672" height="546" alt="image" src="https://github.com/user-attachments/assets/d72b9831-3fe2-4cbd-9834-2abdc1cc4bd7" />
<hr>

<h3 id="задание33">Задание 3.3</h3>
<p><strong>Текст задачи:</strong><br></p>
<p>Разработайте обобщённый метод, который сводит список значений типа <code>T</code> к одному значению того же типа с помощью заданной операции.</p>
<p><strong>Требование:</strong> метод должен быть безопасен для пустого списка — не возвращать <code>null</code> и не выбрасывать исключений.</p>
<p><strong>Примеры использования:</strong></p>
<ol>
<li>Список строк → объединить в одну: <code>"qwertyasdfgzx"</code>.</li>
<li>Список чисел <code>[1, -3, 7]</code> → сумма: <code>5</code>.</li>
<li>Список списков → общее количество элементов (например, через комбинацию map + reduce).</li>
</ol>
<p><strong>Описание выполнения задания:</strong><br></p>
<ul>
<li>
Создаем обобщенный метод <code>reduc</code> с типовым параметром <code>T</code>,
</li>
<li>
 Метод принимает:
  <ul>
   <li>
     список <code>list</code> типа <code>T</code> - исходный список значений,
   </li>
   <li>
     Объект типа <code>T</code>, который вернется методом в случае елси исходный список или результат будут <code>null</code>,
   </li>
   <li>
     Интерфейс <code>Rule(T) rule</code> - Выполняющий скращение исходного списка.
   </li>
  </ul>
</li>
<li>
 Метод проверяет что исзодный список не пустой,
</li>
 <li>
 Формируется результат с помощью вызова <code>rule.rule(list)</code>,
</li>
 <li>
 Проверется, что результат не <code>null</code>,
</li>
 <li>
 Возвращает объект типа <code>T</code>.
</li>
</ul>
<h4>Тесты</h4>
<img width="696" height="779" alt="image" src="https://github.com/user-attachments/assets/77c7584a-07ee-4123-b3b9-c31f9bf681a2" />
<img width="618" height="605" alt="image" src="https://github.com/user-attachments/assets/eb945e88-a5f6-4cf5-b700-ae7cb0836e19" />
<hr>

<h3 id="задание34">Задание 3.4</h3>
<p><strong>Текст задачи:</strong><br></p>
<p>Разработайте обобщённый метод, который:</p>
<ul>
<li>Принимает список исходных значений типа <code>T</code>,</li>
<li>Принимает способ создания результирующей коллекции типа <code>P</code>,</li>
<li>Принимает способ добавления элементов в эту коллекцию,</li>
<li>Возвращает коллекцию типа <code>P</code>, содержащую значения типа <code>T</code>.</li>
</ul>
<p><strong>Примеры использования:</strong></p>
<ol>
<li>Числа <code>[1, -3, 7]</code> → разбить на два подсписка: положительные и отрицательные.</li>
<li>Строки <code>["qwerty", "asdfg", "zx", "qw"]</code> → сгруппировать по длине.</li>
<li>Строки с дубликатами → вернуть без повторов.</li>
</ol>
<p><strong>Описание выполнения задания:<br>
<ul>
<li>
Создаем обобщенный метод <code>collect</code> с типовыми параметрами <code>T, P</code>,
</li>
<li>
 Метод принимает:
  <ul>
   <li>
     список <code>list</code> типа <code>T</code> - исходный список значений,
   </li>
   <li>
     функциональный интерфейс <code>Supplier<P> creatingMethod</code> - используется для создания пустой результирующей коллекции типа <code>P</code>,
   </li>
   <li>
     функциональный интерфейс <code>BiConsumer(P, T) addMethod</code> - принимающий два аргумента: коллекцию типа <code>P</code> и элемент типа <code>T</code>, и выполняющий добавление элемента в коллекцию,
   </li>
  </ul>
</li>
<li>
 Далее метод создает пустую колекцию <code>P result</code>, вызывая <code>creatingMethod.get()</code>, проходит по списку <code>list</code> и для каждого элемента вызывает <code>addMethod.accept(result, item)</code>, чтобы добавить его в созданную коллекцию,
</li>
 <li>
 Возвращает коллекцию <code>P</code>.
</li>
</ul>
<h4>Тесты</h4>
 <img width="535" height="565" alt="image" src="https://github.com/user-attachments/assets/c44fd05b-28be-41d6-84c9-98ee2f746a38" />
<img width="794" height="334" alt="image" src="https://github.com/user-attachments/assets/4637abf1-ffab-4753-82f1-482c33334fdc" />
<hr>

<h2 id="структура-проекта">Структура проекта</h2>
<pre>
src/
└── ru/
    └── fadeev/
        ├── ListMethod/
        │   ├── Interfaces/
        │   │   ├── <a href="https://github.com/Fartem654/Lab4Java/blob/master/src/ru/fadeev/ListMethod/Interfaces/Action.java">Action.java</a>
        │   │   ├── <a href="https://github.com/Fartem654/Lab4Java/blob/master/src/ru/fadeev/ListMethod/Interfaces/Rule.java">Rule.java</a>
        │   │   └── <a href="https://github.com/Fartem654/Lab4Java/blob/master/src/ru/fadeev/ListMethod/Interfaces/Test.java">Test.java</a>
        │   └── <a href="https://github.com/Fartem654/Lab4Java/blob/master/src/ru/fadeev/ListMethod/ListMethod.java">ListMethod.java</a>
        ├── Main/
        │   └── <a href="https://github.com/Fartem654/Lab4Java/blob/master/src/ru/fadeev/Main/Main.java">Main.java</a>
        ├── Storage/
        │   └── <a href="https://github.com/Fartem654/Lab4Java/blob/master/src/ru/fadeev/Storage/Storage.java">Storage.java</a>
        ├── UserPanel/
        │   ├── <a href="https://github.com/Fartem654/Lab4Java/blob/master/src/ru/fadeev/UserPanel/CheckInput.java">CheckInput.java</a>
        │   └── <a href="https://github.com/Fartem654/Lab4Java/blob/master/src/ru/fadeev/UserPanel/UserPanel.java">UserPanel.java</a>
        └── geometry/
            ├── Point/
            │   ├── <a href="https://github.com/Fartem654/Lab4Java/blob/master/src/ru/fadeev/geometry/Point/Point.java">Point.java</a>
            │   └── <a href="https://github.com/Fartem654/Lab4Java/blob/master/src/ru/fadeev/geometry/Point/Point3D.java">Point3D.java</a>
            └── <a href="https://github.com/Fartem654/Lab4Java/blob/master/src/ru/fadeev/geometry/Line.java">Line.java</a>
</pre>

<h2 id="как-запустить">Как запустить</h2>
<ol>
 <li>Убедитесь, что установлен JDK.</li>
 <li>
   Скачайте архив с проектом.
 </li>
 <li>
   Откройте в консоли каталог "src".
 </li>
 <li>
   Введите в консоль:
   <pre>java master.java</pre>
 </li>
</ol>
