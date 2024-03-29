public class Task {


    static void task1() {
    /*
        Создать новый класс для потока через реализацию интерфейса Runnable.
        Переопределить метод run.
        В переопределённом методе run должен быть бесконечный цикл в котором надо выводить в консоль имя текущего потока и его id.
        Доработать созданный класс так что бы можно было отключать бесконечный цикл во время исполнения запущенного потока с помощью метода interrupt.
         */
    }

    static void task2() {
        /*
        Программа создаёт 5 потоков через класс EmployeeThread.
        У класса EmployeeThread есть приватная статическая переменная с названием email.
        Переменная email используется в переопределённом методе run, там же устанавливаеться "test@gmail.com" + Thread.currentThread().getId()
        В конце метода run в консоль выводиться сообщения с текущим id потока, его именем и email, который содержится в переменной email.

        Сейчас программа работает с ошибкой и первый поток может установить переменную email, а другие потоки могут использовать значение, которое было установлено первым потоком.
        Если вы запустите программу, то станет ясно, что id текущего потока не равно id потока, который установлен в переменной email.
        Вот примерно такое сообщение у вас должны быть "current thread with id 17 have name Thread with index 3 with value is test@gmail.com18"
        Как видно потока 17, а id потока в переменной email 18. Это значит, что переменная Email взяла id чужого потока (18)

        Вам надо модифицировать код класс EmployeeThread так, что бы у каждого потока была своя отдельная переменная email.
        Запрещено убирать ключевое слово static у переменной email.
        В результате у вас должна быть логика, которая не позволит потоку использовать значение переменной email, которое было установленно другим потоком ранее.

        Задача рассчитана на понимание потокобезопасности.

        Для решения задачи запрещено использовать оператор synchronized, класс ReentrantLock и методы join(), wait, notify, notifyAll
         */
       /* for (int i = 0; i < 5; i++) {
            EmployeeThread employeeThread = new EmployeeThread("Thread with index " + i);
            employeeThread.setEmail("testemail" + i);
            employeeThread.start();*/
        }
    }

//static void task3() {
        /*
        Создать новый класс для потока через реализацию интерфейса Runnable.
        Переопределить метод run.
        В переопределённом методе run выводить в консоль имя текущего потока и его id.
        В переопределённом методе run должен быть слип на пол секунды.
        Создать динамический массив потоков и запустить первый и предпоследний поток.
        В результате в консоли у вас должно быть сообщение из метода run для первого и предпоследнего потока.
         */




