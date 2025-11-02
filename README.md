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

<h4>Тесты</h4>
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
<h4>Тесты</h4>
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

<h4>Тесты</h4>
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

<h4>Тесты</h4>
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
<p><strong>Описание выполнения задания:</strong><br> 

<h4>Тесты</h4>
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
<p><strong>Описание выполнения задания:</strong><br><strong><code>interface NumericValue</code></strong></p>

<h4>Тесты</h4>
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
<p><strong>Описание выполнения задания:</strong><br>

<h4>Тесты</h4>
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
