package ariorick.com.greatpeople.models;




public class GreatPerson {

    String name;
    String secondName;
    String surname;
    long birthDate;
    long deathDate;
    String description;
    String activityField;

    public GreatPerson(String name, String secondName, String surname, String activityField, String description,  long birthDate, long deathDate) {
        this.activityField = activityField;
        this.description = description;
        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
    }
}
