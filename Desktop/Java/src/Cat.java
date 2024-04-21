public class Cat extends Animal{

    private boolean isHunter;

    public Cat(String name, String color, boolean isHunter){
        super(name, color);
        this.isHunter = isHunter;
    }

    @Override
    public String getSoun() {
        return "Meow";
    }


    public String getIsHunter(){
        if (isHunter){
            return "Yes is Hunter";
        } else {
            return "No Isn't Hunter";
        }
    }

}
