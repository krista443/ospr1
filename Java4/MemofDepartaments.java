class MemofDepartaments  {

    private String name;
    private  String dol;
    private String pred;
    private String deport;

    public void setDeport(String deport){
        this.deport =deport;
    }

    void setName(String name){
        this.name = name;

    }
    void setDol(String dol){
        this.dol = dol;

    }
    void  setPred(String pred){
        this.pred=pred;

    }



    public String toString(){
        return "Преподователи кафедры:\n" + "1) Кафедра:  " + deport + ", должность: " + this.dol + ", ФИО: " + this.name + "Преподоваемый предмет: " + this.pred + ".";
    }
}
