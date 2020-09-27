package day6;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student, int rating) {
        String s;
        if (rating == 5) {
            s = "отлично";
        } else if (rating == 4) {
            s = "хорошо";
        } else if (rating == 3) {
            s = "удовлетворительно";
        } else if (rating == 2) {
            s = "неудовлетворительно";
        } else {
            s = "Неправильная оценка";
        }

        String result = "Преподаватель " + getName() + " оценил студента с именем " + student.getName() +
                " по предмету " + getSubject() + " на оценку " + s + ".";

        System.out.println(result);
    }
}

