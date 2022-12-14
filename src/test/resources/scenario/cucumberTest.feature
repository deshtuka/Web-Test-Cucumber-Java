#language: ru

@all
Функционал: Командировки сотрдуников Appline

  @negative
  Сценарий: Проверка создания командировки (негативный)
    * Ожидание загрузки страницы и ввод логина "Irina Filippova" и пароля "testing"
    * Нажать на кнопку "Авторизоваться"
    * Проверить наличие заголовка "Панель быстрого запуска"
    * В выплывающем окне раздела "Расходы" нажать на "Командировки"
    * Нажать на "Создать командировку"
    * Проверка наличия на странице заголовка "Создать командировку"
    * В разделе "Подразделение" выбрать "Отдел внутренней разработки"
    * В разделе "Принимающая организация" нажать "Открыть список"
    * В разделе "Принимающая организация" выбрать любое значение в "Укажите организацию"
    * В разделе "Задачи" установить чекбокс на "Заказ билетов"
    * В разделе "Сведения" заполнить поля
      | Город выбытия    | Россия, Санкт-Петербург |
      | Город прибытия   | Россия, Владивосток     |
      | Дата выезда      | 01.01.2022              |
      | Дата возвращения | 02.02.2022              |
    * Нажать "Сохранить и закрыть"
    * Проверить наличие сообщения "Список командируемых сотрудников не может быть пустым"

  @positive
  Структура сценария: Проверка авторизации
    * Ожидание загрузки страницы и ввод логина "<login>" и пароля "<password>"
    * Нажать на кнопку "Авторизоваться"
    * Проверить наличие заголовка "Панель быстрого запуска"
    Примеры:
      | login           | password |
      | Irina Filippova | testing  |
