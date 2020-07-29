public class Test {
    private int number;
    private String name = "default";

    @ConfigProperty  //??
    private String configName = "default";
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setName(String name) {
        this.name = name;
    }
    private void printData(){
        System.out.println(number + name);
    }
}

