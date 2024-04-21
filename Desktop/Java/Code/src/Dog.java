public class Dog extends Animal{

    private boolean isBodyGuar;

     public Dog(String name, String color, boolean isBodyGuar){
         super(name, color);
         this.isBodyGuar = isBodyGuar;
     }

    @Override
    public String getSoun() {
        return "Haf";
    }

    public String getIsBodyGuard(){
         if (isBodyGuar){
             return "Yes is BodyGuard";
         } else {
             return "No Isn't Body";
         }
    }
}
