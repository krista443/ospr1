class Facultymembers{

    private String nameF;

    void setNameF(String nameF){

        this.nameF=nameF;
    }

    public String toString(){
        return "Члены факультета:\n" + "Декан: " + this.nameF + ".";
    }
}