## Тестовое задание для PTEECH

1. Тест-кейсы написал в таблице Excel, проверить можно в [google docs](https://docs.google.com/spreadsheets/d/1wWO0ZSfSMNj8GXX2N85K2ZVg45uG4Sds/edit?gid=364041389#gid=364041389), а так же файл [Тест-кейсы.xlsx](https://github.com/Chm137/PTEECH.testTask/blob/main/Тест-кейсы.xlsx)[^1].

2. Автотест PlayWrith находится [здесь](https://github.com/Chm137/PTEECH.testTask/blob/main/testask/src/main/java/com/chm137/playwrith/App.java). Результат выполнения теста находится в [testResults.png](https://github.com/Chm137/PTEECH.testTask/blob/main/testResult.png). В тесте сделал запуск двух браузеров(`chrome` и `firefox`), затем оформил операции сравнения для заголовка `<title>` на сайте и получаемый с помощью `PlayWrith`. Тест можно было бы улучшить использования класс `BrowserType`, чтобы не дублировать блоки с условиями[^2].

3. Решение задачи по теории вероятности можно проверить на [google docs](https://docs.google.com/document/d/1N-pSRyryjR7FCKb2sa-NjSqRSETD6a1j/edit), а так же файл [Теория вероятности.docx
](https://github.com/Chm137/PTEECH.testTask/blob/main/Теория%20вероятности.docx). Дополнительно ради интереса реализовал решение задачки с помощью [кода на Java](https://github.com/Chm137/PTEECH.testTask/blob/main/testask/src/main/java/com/chm137/playwrith/Balls.java), результат отработки программы можно увидеть в [ballsResults.png](https://github.com/Chm137/PTEECH.testTask/blob/main/ballsResults.png). В программе можно заносить любые любые валидные значения шариков и выбирать их виды для просчёта вероятности[^3]. <br/><br/><br/>

>**Описание задач:**
[^1]: Задача по написанию тест-кейсов. <br/>
Условие: В веб-приложении есть выпадающий список с выбором стран и кодом телефона. Необходимо проверить корректность работы списка.

[^2]: Задача Playwright.<br/>
Условие: Написать тест, который открывает веб-страницу https://playwright.dev/ и проверяет что заголовок страницы соответствует ожидаемому значению. Тест необходимо запустить минимум на 2 разных браузерах.

[^3]: Задача по теории вероятности.<br/>
Условие: В коробке 7 красных, 5 зеленых и 8 синих шаров. Наугад выбирается один шар. Какова вероятность того, что выбранный шар окажется либо красным, либо зеленым?


