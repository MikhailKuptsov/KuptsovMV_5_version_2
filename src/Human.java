public class Human {
    public String name;
    public String nicname;
    public int year_birth;

    private int now_year=2022;

    public void set_human(String _name, String _nicname, int _year_birth){
        name=_name;
        nicname=_nicname;
        year_birth=_year_birth;
    }
    public String Info(){
        String man="Имя: "+name+"\nФамилия: "+nicname+"\nВозраст: ";
        int a=now_year-year_birth;
        return (man+a);
    }
}
