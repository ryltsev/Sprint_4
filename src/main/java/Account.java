public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }


    public boolean checkNameToEmboss() {
        if (name == null) {
            return false;
        } else
            return name.length() >= 3 &&
                    name.length() <= 19 &&
                    name.length() - name.replace(" ", "").length() == 1 &&
                    !name.startsWith(" ") &&
                    !name.endsWith(" ");
    }

}

/*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
