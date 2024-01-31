package eserciziJava.esercizioCostruttore.java;

public class Studente {
    private  String firstName;
    private String lastName;
    private  String ID;

    public Studente(String firstName, String lastName, String ID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    };

    @Override
    public String toString(){
        String datiStudente = "Students data: "+ firstName + ", "+ lastName + " ," + ID;
        return datiStudente;
    };
    //dichiaro getter e setter
    public String getFirstName(){
        return firstName;
    };

    public String getLastName(){
        return lastName;
    };

    public String ID(){
        return ID;
    };

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
}

