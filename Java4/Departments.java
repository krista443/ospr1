class Departments {

    private String dep;

    void setDep(String dep){
        this.dep=dep
        ;
    }
    String getDep(){
        return this.dep;
    }


    public String toString(){
        return "Кафедра " + this.dep + ".";
    }

}