package Personal;

public abstract class Personal {
    public String name;

    public String surname;

    public String specialty;

    public double workExperience;

    public Personal(String name, String surname, String specialty, double workExperience) {
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.workExperience = workExperience;
    }
    
    @Override
    public String toString() {
        return String.format("ФИ = %s %s, специализация = %s, опыт работы = %s", name, surname, specialty, workExperience);
    }
}
